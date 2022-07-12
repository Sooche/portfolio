<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${path}/resources/css/userjoin.css">

	<script type="text/javascript" >
		
	function goPopup(path){
	//컨트롤러에 jusoPopup.jsp호출 요청	
	var pop = window.open(path + "/user/jusoPopup","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
}
//주소팝업 호출후 실행할 함수
function jusoCallBack(zipNo,roadAddrPart1,addrDetail){
	// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
	document.frmjoin.zipcode.value = zipNo;
	document.frmjoin.addrload.value = roadAddrPart1;
	document.frmjoin.addrdetail.value = addrDetail;
}

function joinCheck(e) {
	e.preventDefault();
	const email = document.getElementById('email');
	const passwd = document.getElementById('passwd');
	const passwdConfirm = document.getElementById('passwdConfirm');
	const userid =document.getElementById('userid');
	console.log(email.value);

	
	if (!userid.value){
		alert('아이디를 입력해주세요!');
		email.focus();
		return ;
	}
	if (!email.value){
		alert('이메일을 입력해주세요!');
		email.focus();
		return ;
	}
	if (!passwd.value){
		alert('비밀번호를 입력해주세요!');
		passwd.focus();
		return ;
	}
	if (!passwdConfirm.value){
		alert('비밀번호 확인을 입력해주세요!');
		passwdConfirm.focus();
		return ;
	}
	if (passwd.value !== passwdConfirm.value){
		alert('비밀번호가 일치하지 않습니다!');
		passwdConfirm.focus();
		return ;
	}
	
	document.getElementById('frmjoin').submit();
	
	
}

</script>
	

</head>
<body>
<a href="${path}" class="Logo">Logo</a>
<hr class="hr">
<form action="${path}/user/join" name="frmjoin" id="frmjoin" method ="post">
<div class="container">


	<h3 class="signup">Sign Up</h3>

	

 		

		<div class="id_div">
			<label class="id_label">아이디</label><br>
			<input type ="text" name ="userid" id="userid">
		</div>
		
		
		
		<div class="email_div">
			<label class="email_label">이메일</label><br>
			<input type="email" name ="email"  id= "email">
		</div>
		
		
		
		<div class="passwd_div">
			<label class="passwd_label">패스워드</label><br>
			<input type="password" name="passwd" id="passwd">
		</div>
		
		<div class="passwd_con_div">
			<label class="passwd_con_label">패스워드 확인</label><br>
			<input type ="password" name ="passwdConfirm" id="passwdConfirm">
		</div>
		
		<div class="nickname_div">
			<label class="nickname_label">닉네임</label><br>
			<input type ="text" name="usernickname" id="usernickname">
		</div>
		
		<div class="name_div">
			<label class="name_label">이름</label><br>
			<input type ="text" name="username" id="username">
		</div>
		
		
		
		<label class="zopcode_label">우편번호</label>
		<div class="zipcode">
			
				
			<input type="text" name="zipcode" size="5"  id="zipcode" value="${user.zipcode}">
			<button type="button" onclick="goPopup('${path}')">조회</button>
		</div>
		
		<div class="addrload">
			<label class="addrload_label">도로명주소</label><br>
			<input type="text" name="addrload" size="35" id="addrload" value="${user.addrload}">
		</div>
		
		<div class="addrdetail">
				<label class="addrdetail_label">상세주소</label><br>
				<input type="text" name="addrdetail" size="35" id="addrdetail" value="${user.addrdetail}"> 
		</div>
	
		<div >
				<button onclick="joinCheck(event)" class="joinbutton">회원 가입</button> 
		</div>
		
	
	
</div>
	
	
	





	</form>



</body>
</html>