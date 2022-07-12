<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file = "../include/include.jsp" %>
    <%@ include file="../include/sessionCheck.jsp" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${path}/resources/css/detail.css">
<link rel="stylesheet" href="${path}/resources/css/media.css">
<script type="text/javascript" src="${path}/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="${path}/resources/js/detail.js"></script> 
<script type="text/javascript" src="${path}/resources/js/Reply.js"></script>
<script type="text/javascript" src="${path}/resources/js/media.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.7/handlebars.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">











</script>


<script type="text/javascript">
var slideIndex = 0; //slide index

//HTML 로드가 끝난 후 동작
window.onload=function(){
showSlides(slideIndex);




// Auto Move Slide
var sec = 3000;
setInterval(function(){
 slideIndex++;
 showSlides(slideIndex);

}, sec);
}


//Next/previous controls
function moveSlides(n) {
slideIndex = slideIndex + n
showSlides(slideIndex);
}

//Thumbnail image controls
function currentSlide(n) {
slideIndex = n;
showSlides(slideIndex);
}

function showSlides(n) {

var slides = document.getElementsByClassName("mySlides");
var dots = document.getElementsByClassName("dot");
var size = slides.length;

if ((n+1) > size) {
 slideIndex = 0; n = 0;
}else if (n < 0) {
 slideIndex = (size-1);
 n = (size-1);
}

for (i = 0; i < slides.length; i++) {
   slides[i].style.display = "none";
}
for (i = 0; i < dots.length; i++) {
   dots[i].className = dots[i].className.replace(" active", "");
}

/* slides[n].style.display = "block";
dots[n].className += " active"; */
}







</script>






<script type="text/x-handlebars-template" id="template_source">
	{{#each .}}
		<div class="divReply" id='reply{{rnum}}'>
			{{#levelSpace relevel}} <!--헬퍼작성:levelSpace(헬퍼의 이름) -->
			{{/levelSpace}}
			<div >
				<span style="display:none;">{{rnum}}</span>
				<span style="display:none;" id="restep{{rnum}}">{{restep}}</span> 
				<span style="display:none;" id="relevel{{rnum}}">{{relevel}}</span> <br>

				아이디 : <span> {{userid}}</span> <br>
				내용 : <pre id='content{{rnum}}'>{{content}}</pre> <br>
				<button class="reReplyAddShow" value="{{rnum}}">댓글</button>
				<button class="reReplyModify" value="{{rnum}}">수정</button>
				<button class="reReplyRemove" value="{{rnum}}">삭제</button>
			</div>
		</div>
		<hr>
	{{/each}}
</script>


<script type="text/javascript">



function download(e) {
	
	const downloads = document.querySelectorAll('.btnDownload');
	console.log(downloads);
	
	downloads.forEach((dfile)=>{
		dfile.addEventListener('click',(e)=>{
			const setupfile = e.target.innerText;
			console.log(setupfile);
			location.href='${path}/gboard/filedownload?setupfile=${gameboard.setupfile}';
			
			
			
		})
		
		
	});
} 


</script>

<script type="text/javascript">

</script>

</head>
 


<!-- ============================================================== -->
<body>
<div class="container">
<div class=titlebox>
	<label class="gametitle">${gameboard.subject}</label>
</div>
	
	
<div class="slideshow-container">
  <c:forEach var="media" items="${gamefile}">
     <div class="mySlideDiv fade active">
        <img src="${path}/savedir/${media.filename}" width="1305px" height="504px"> 
     </div>
      </c:forEach>
   

     <a class="prev" onclick="prevSlide()">&#10094;</a>
     <a class="next" onclick="nextSlide()">&#10095;</a>
            
</div>


	
	
	
		<div class="thumbnaildiv">
				
			<img alt="" src="${path}/savedir/${gameboard.thumbnail}" width="327px" height="280px">
			
		</div>
	
		


	<form action="${path}/gboard/detail" method="post" id='buyform' name='buyform'>
	
			

	
   
 
	<table >
		<tr>
	
			<td><input type='hidden' value='${gameboard.boardnum}' name="boardnum" id ="boardnum"></td>
			<td><input type="hidden" value="${sessionScope.userid}" name="userid" id="userid"></td>
			<td><input type="hidden" value="${tradelog}"id ="tradelog"></td>
			<td><input type="hidden" value="${filecount}" id="filecount"></td>
				
		</tr>
	
	
 
	
		<tr>
			<td class="logo"><img alt="" src="${path}/savedir/${gameboard.companylogo}" width="327px" height="280px"></td>
		</tr>
		
		
	
			<tr class="buybutton">
				<td><button type="button" id="buy">구매</button></td>
				
				
			</tr>
		
			<tr class="download">
				<td class="downfont"><button type="button" onclick="download(event)" class="btnDownload" name="btnDownload" id="btnDownload" value="${gameboard.setupfile}">
				   다운로드
				</button></td>		
			</tr>
			
	
	
	
    
   		<tr>
			<td class="content"><textarea rows="10" cols="184" readonly >${gameboard.content}</textarea>${media}</td>
		</tr>
		<tr >
			<td class="RS"><textarea rows="30" cols="184" readonly >${gameboard.RS}</textarea></td>
		</tr>	
	
		
	
	
		
	
	</table>
	
	

	
	</form>
	
	</div>
	
	
	<table>
		<tr>
			<td colspan="2" class= "replybutton">
				
				<button id="replyAddShow">댓글</button>
				
				
			</td>
		</tr>
	</table>
	
		
	
		
	<hr id="hr" class="hr">
		<!-- 댓글추가 -->
	<div class="cardmb-2" id="divReplyAdd">
		<div class="card-header bg-light">
		        <i class="fa fa-comment fa"></i> 
		        <input type="hidden" id="restep" size="3">
		        <input type="hidden" id="relevel" size="3">
		</div>
		<div class="card-body">
			<ul class="list-group list-group-flush">
			    <li class="list-group-item">
				<div class="form-inline mb-2">
					<label for="replyuserid"><i class="fas fa-envelope"></i></label>
					<input type="text" class="form-control ml-2" id="replyuserid" value="${sessionScope.userid}" readonly>
				</div>
				<textarea class="form-control" id="replycontent" rows="3"></textarea>
				<button type="button" class="btn btn-dark mt-3" id="replyAdd">추가</button>
				<button type="button" class="btn btn-dark mt-3" id="replyCancel">취소</button>
			    </li>
			</ul>
		</div>
	</div>	
	
	
	
	<!-- 댓글리스트 -->
	
	<div class="reply-div" id="replyList">
	
		<c:forEach var= "reply"  items="${reply}">
		
			
				<input type="hidden" class="replyid" value="${reply.userid}"  class="replyboard" >
				<li class="replyuserid">${reply.userid}</li><br>
			
				
				<textarea rows="3" cols="100">${reply.content} 
				</textarea>
				<input type="hidden" class="rnum" value="${reply.rnum}">
				
				
			
			<c:if test="${reply.userid eq sessionScope.userid}">	
				<button type="button" id="reReplyRemove">삭제</button> <br>
			</c:if>
				
			
			</c:forEach>
			
		
		
	</div>



		
</body>
</html>