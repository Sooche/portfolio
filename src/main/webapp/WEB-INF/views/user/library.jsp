<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file = "../include/include.jsp" %>
 <%@ include file="../include/sessionCheck.jsp" %>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="${path}/resources/css/library.css">
<script type="text/javascript" src="${path}/resources/js/header.js"></script>
</head>
<body>
<input type="hidden" value="${path}" id="contextpath"> 
	<a href="${path}" class="home">Libary</a>

<hr class="hr">

<div class="background"></div>

<div class="container">
		<span style="display:none" id="sessionUserid"  > ${sessionScope.userid}</span>
		<a href="${path}/gboard/list" class="store">Store</a>
		
		<a href="" id="aLogout" >Logout</a>
	
		<form action="${path}/user/library" id="frmlibrary" name="frmlibary">
			
		<div class="back">	
				
			<div class="librarydiv">	
			
				<c:forEach var="library" items="${library}">
					<div class="librarybox">
						<div class="linkbox">
						
						<a href="${path}/gboard/detail?boardnum=${library.boardnum}" class="img">
						
							<img alt="" src="${path}/savedir/${library.thumbnail}" width="100" height="160"><br>
						
						${library.subject}
						
					
					
						</a>
					
				
						</div>
					</div>
				</c:forEach>
			
			</div>
		
		</div>	
			
		
		
		</form>
		
</div>	
</body>
</html>