 //document가 준비되었을때 
$(function(){
	const sessionUserid = $('#sessionUserid').text().trim();
	console.log(sessionUserid);
	//로그인, 로그아웃, 회원가입 제어
	if (!sessionUserid){ //로그인 전
		$('#aLogin').show();
		$('#aLogout').hide();
		$('#aJoin').show();
		$('#library').hide();
	}else{  //로그인 후
		$('#aLogin').hide();
		$('#aLogout').show();
		$('#aJoin').hide();
		$('#library').show();
	}
	
	//로그아웃 버튼을 클릭했을때
	$('#aLogout').click(e=>{
		e.preventDefault(); //기본이벤트 제거
		if (confirm('로그아웃하시겠습니까?')){
			const path = $('#contextpath').val();
			location.href=`${path}/logout`;
		}		
		
	});
	
	
	
	
});