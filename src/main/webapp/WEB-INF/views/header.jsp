<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file = "./include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${path}/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="${path}/resources/js/header.js"></script>

	

</head>
<body>
	<header>
		<h2>게시물 관리 V1.0</h2>
		
		<div>
			<!-- 컨택스트패스 -->
			<input type="hidden" value="${path}" id="contextpath"> 
			
		<a href="${path}">홈</a>
			
			<a href="${path}/user/join"  id ="aJoin" >회원가입</a>
			<a href="${path}/gboard/list">상점</a>
			<a href="${path}/gboard/add" id="product">상품판매</a>	
			<a href="${path}/user/library?userid=${sessionScope.userid}">라이브러리</a>
			<a href="${path}/login" id="aLogin" >로그인</a>
			<a href="" id="aLogout" >로그아웃</a>
			
			
				<span  id="sessionUserid" > ${sessionScope.userid}</span>
		</div>
		
	
	</header>
	<hr>
	
	
</body>
</html>