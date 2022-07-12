<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="${path}/resources/css/list.css">
<script type="text/javascript" src="${path}/resources/js/header.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />


</head>
<body>
	<input type="hidden" value="${path}" id="contextpath"> 
	<span style="display:none" id="sessionUserid"  > ${sessionScope.userid}</span>

 <!-- 로고 -->
	<a href="${path}" class="home">
		<label class="listlogo">Logo</label>	
	</a>

<!-- 헤드 부분 -->
<div class="headdiv">
		<a href="" id="aLogout" >
				
				<label class="aLogout">Logout</label>
	
		</a>
		
		
		<a href="${path}/user/library?userid=${sessionScope.userid}" id="library">
				
				<label class="library"> Library</label>
		
		</a>
</div>	

<div class="justback">

</div>

<div class="search">
	<form action="${path}/gboard/list" >
	
		<select name="findkey" class="selectbox" >
					<option value="subject" <c:out value="${page.findkey=='subject'?'selected':''}"/>>제목</option>
					<option value="kategorie" <c:out value="${page.findkey=='kategorie'?'selected':''}"/>>카테고리</option>
					
		</select>
			<input type="text" name="findvalue" value="${page.findvalue}" class="searchbar" placeholder='Search'>
			<button class="seachbutton"></button>
				
				<div class="icon">
				
					<i class="fa-solid fa-magnifying-glass" style="font-size:3px"></i>
				
				</div>
	</form>
	
</div>


	
		
			
		
		
		
	
	

<div class="back">

	<div class="storediv">	
			
		<c:forEach var="gboard" items="${gamelist}" >
	
			<div class="linkbox" >
				<div class="listimg">
					<a href="${path}/gboard/detail?boardnum=${gboard.boardnum}" class="href">
						
							<img alt="" src="${path}/savedir/${gboard.thumbnail}"  style="display: block; margin: 0 auto; width:182px; height:223px; margin-top:20px "><br>
						
					</a>
					
				</div>
				
				<div class="imgword">
						<a href="${path}/gboard/detail?boardnum=${gboard.boardnum}" style="display: block; margin: 0 auto; margin-top:5px " class="line">
							${gboard.subject}
						</a>
				</div>
			</div>
		
		</c:forEach>
		
	</div>
		
</div>

	

</body>
</html>