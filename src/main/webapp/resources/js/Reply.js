
window.addEventListener('load', ()=>{
	//핸들바에서 사용 : 헬퍼만들기
	Handlebars.registerHelper('levelSpace', function(relevel){
		let result = '';
		for(var i=0; i<relevel; i++)
			result += '<div class ="divSpace"></div>';
		return result;
	});


	//댓글창 초기화
	const replyInit = ()=>{
		//입력된 내용 지우기
		document.getElementById('replycontent').value='';
		
		//댓글추가 div 이동
		const hr = document.getElementById(`hr`);
		const divReplyAdd = document.getElementById('divReplyAdd');
		hr.after(divReplyAdd);
		//댓글추가 창 숨기기
		divReplyAdd.style.display = 'none';
		
		
		
		
	};
	//댓글의 리스트 
	const replyList = ()=> {
		
		replyInit();//댓글창 초기화
		
		const boardnum = document.getElementById('boardnum').innerText;
		//console.log(bnum);
		//ajax 서버 호출(get)
	
			
		
		
	};
	
	replyList();
	
	//게시물의 댓글 버튼을 클릭했을때
	document.getElementById('replyAddShow').addEventListener('click',()=>{
		//부모의 restep,relevel
		document.getElementById('restep').value = 0;
		document.getElementById('relevel').value = 0;
		
		//댓글추가 div 이동
		const hr = document.getElementById(`hr`);
		const divReplyAdd = document.getElementById('divReplyAdd');
		hr.after(divReplyAdd);
		
		//댓글추가 div 보이기
		
		divReplyAdd.style.display = '';
		
	});
	
	//댓글추가창에서 취소버튼을 클릭했을때
	document.getElementById('replyCancel').addEventListener('click', ()=>{
		//댓글추가 창 숨기기
		document.getElementById('divReplyAdd').style.display = 'none';	
	});
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	//댓글리스트의 삭제 버튼을 클릭했을때
	$('#reReplyRemove').click(()=>{
		if (confirm('삭제하시겠습니까?')){
		
		const rnum = $('#rnum').val();
		console.log(rnum);
		


		//ajax 서버 호출
		fetch(`/wep/reply/${rnum}`,{
			method : 'delete',
		})
		.then(res=>res.text())
		.then(text=>{
			alert(text);
			replyList(); //댓글 리스트 호출
		})
		.catch(err=>console.log(err));
	

	}else
	 retrun;
	
		});

	
	

	
	//추가댓글의 추가버튼 클릭시
	$('#replyAdd').click(()=>{
		//추가할 내용 읽어오기
		const boardnum = $('#boardnum').val();
		const userid = $('#replyuserid').val();
		const content = $('#replycontent').val();
		const restep = $('#restep').val(); // 댓글의 순서
		const relevel = $('#relevel').val(); // 댓글의 레벨
		
		//전송할 데이터(자바스트립트 객체)
		const data ={
			boardnum,
			userid,
			content,
			restep,
			relevel,
		};
		
		console.log(data);
		
		//jquery 서버 호출
		$.ajax({
			url : '/wep/reply/',
			type : 'post',
			contentType : 'application/json', //보내는 데이터의 타입
			data: JSON.stringify(data), //보내는 데이터  
			dataType : 'text', //받을 데이터의 타입 
			success : (text)=>{
				console.log(text);
				replyList(); //댓글의 리스트 호출
			},
			error : console.error
			
		});
		
	});
	
	
	

	
	
	
});