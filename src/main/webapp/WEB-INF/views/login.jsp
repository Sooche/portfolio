<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="./include/include.jsp" %> 
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="${path}/resources/css/login.css">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function login(e) {
		e.preventDefault();
		
		const userid= document.getElementById('userid');
		const passwd= document.getElementById('passwd');
		console.log(userid.value);
		console.log(passwd.value);
		
	if(!userid.value){
		userid.focus();
		alert('아이디를 입력해주세요');
		return;
		
	}
	if(!passwd.value){
		alert('패스워드를 입력해주세요!');
		passwd.focus();
		return;
	}
		
		
		frmLogin.submit();
	}
	
	





</script>
</head>
<body>
	<div class="container">
	
	<a href="${path}">
	<label class="Logo">Logo</label>
	</a>
	
	<form id="frmLogin" name="frmLogin" action="${path}/login" method="post">
		<table>
			<tr>
				<th class='login'>Login</th>
				<td><input type="text" name="userid" id="userid" class="loginbar" placeholder='Userid'> </td>
			</tr>
			<tr>
				
				<td><input type="password" name="passwd" id="passwd" class="passwdbar" placeholder='Password'> </td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="button" class="btn btn-primary" id="btnLogin" onclick="login(event)" >
					Sign in
					</button>
					<a href="${path}/user/join"  id ="aJoin" >
					<label class="joinbar">회원가입</label>
					</a>
				 </td>
			</tr>
		</table>
	</form>
</div>	

</body>
</html>