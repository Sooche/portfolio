<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<%@ include file="../include/sessionCheck.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function fileAdd(e){
	e.preventDefault(); //기본이벤트 제거
	//input엘리먼트 생성
	var input = document.createElement('input');
	input.type = 'file';
	input.name = 'files';
	//br엘리먼트 생성
	var br = document.createElement('br');
	//button엘리먼트 생성
	var removeButton = document.createElement('button');
	var text = document.createTextNode('삭제');
	removeButton.type = 'button';
	removeButton.appendChild(text);
	
	
	//divFiles에 추가하기
	var divFiles = document.getElementById('divFiles');
	var div = document.createElement('div');
	
	div.appendChild(input);
	div.appendChild(removeButton);
	div.appendChild(br);
	
	divFiles.appendChild(div);
	
	//이벤트 달기1
/*	button.onclick= function(){
		console.log('이벤트달기');
	}
*/
	//이벤트달기2
	//삭제버튼 클릭시 부모div삭제
	removeButton.addEventListener('click', function(){
		this.parentNode.remove();
	});



	
	
}




</script>
</head>
<body>
<div class = "container">

	<h2>상품 판매 게시물추가</h2>
 <%@include file="../header.jsp"%>	
	<form action="${path}/gboard/add" method="post" enctype="multipart/form-data">

		<table border="1">
			<tr>
				<th>게임이름</th>
				<td><input type="text" name="subject" id="subject"> </td>
			</tr>
			<tr>
				<th>섬네일</th>
				<td><input type ="file" name="thumbnailfile" id="thumbnailfile"> </td>
			</tr>
			<tr>
				<th>미디어<br><button onclick="fileAdd(event)">+</button></th>
				<td>
					<div id="divFiles">
						<input type="file" name="files" id="files">
					</div>
				 </td>
			</tr>
			<tr>
				<th>다운로드 파일</th>
				<td><input type="file" name ="downloadfile" id ="downloadfile"></td>
			</tr>
			<tr>
				<th>카테고리</th>
				<td><input type="text" name= "kategorie" id ="kategorie"></td>
			</tr>
			<tr>
				<th>게임설명</th>
				<td><textarea name="content" rows="10" cols="50"></textarea> </td>
			</tr>
			<tr>
				<th>출시일</th>
				<td><input type="date" name="date" id="date"> </td>
			</tr>
			<tr>
				<th>개발사</th>
				<td><input type="text" name ="companyname" id="companyname"> </td>
			</tr>
			<tr>
				<th>개발사로고</th>
				<td><input type="file" name="logofile" id="logofile"> </td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="number" name="price" id="price" > </td>
			</tr>
			<tr>
				<th>권장사양</th>
				<td><textarea name="RS" id="RS" rows="10" cols="20"></textarea> </td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<button>저장</button>
					<button>취소</button>
				</td>
			</tr>
		</table>
	
	
	
	</form>
	
</div>	
</body>
</html>