$(function(){
	
	 var tradelog = $('#tradelog').val();
	console.log(tradelog);
	
	if(tradelog==0){
		$('#btnDownload').hide();
		$('#buy').show();
	}else{
		$('#btnDownload').show();
		$('#buy').hide();
		
	}	
	
	
	const buycheck = $('#buy').click(e=>{
		e.preventDefault();
		if(confirm('구매하시겠습니까?')){
		 const userid = document.getElementById('userid');
		const boardnum = document.getElementById('boardnum');
		const payment = document.getElementById('payment');
		console.log(userid);
		console.log(boardnum);
		console.log(payment);  
		
	

		buyform.submit();

			
		}else
		
		return;
		
		
		
		
	});
	
	
	
	
	
	
});