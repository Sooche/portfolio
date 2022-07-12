<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/include.jsp" %>
<html>
<head>


<!-- 아이콘 -->
<script src="https://kit.fontawesome.com/5bbe282217.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="${path}/resources/css/home.css">

<script type="text/javascript" src="${path}/resources/js/home.js"></script>
<script type="text/javascript" src="${path}/resources/js/header.js"></script>



</head>
<body>
 <!-- 세션 유저 아이디 불러오기 -->
	<span  id="sessionUserid" > ${sessionScope.userid}</span>
	<input type="hidden" value="${path}" id="contextpath" > 
	
		<div class="homehead">
		
			<img alt="" src="">
	
		</div>

 <!-- 검색창 div -->
	<div class="search">
		<div class="icon">
	<i class="fa-solid fa-magnifying-glass" style="font-size:3px"></i>
		</div>
		<div>
			<input class="homesearch" type=text  placeholder='Search'>
		</div>
		
	</div>
	<!-- 홈화면 배너 -->
	<div class="headbox">
		<ol >
			<li class ="mainword2">
				NEW Character Update
			</li>
			<li class="mainword">
				PATHFINDER
			</li>
			<li class="headimg">
				<img alt="" src="${path}/resources/images/pathfinder.png">
			</li>
			
		
			
		</ol>
				<a href="${path}">
					<label class="home">Logo</label>
				</a>
			
				<a href="${path}/login" id="aLogin"  >
					<label class="aLogin" >Login</label>
				</a>
				
			
			
			
				<a href="" id="aLogout" >
					<label class="aLogout">Logout</label>
				</a>
			
			
				<!-- 디테일 버튼 -->
				
				<label class="see"><i class="fa-solid fa-align-right" ></i></label>
				<div id="home_select" class="" >
				
					<a href="${path}/user/library?userid=${sessionScope.userid}" id="">
						<label class="library">My Library</label>
					</a>
				
					<a href="${path}/gboard/add" class="product">Add Game</a>
					
					
					<a href="${path}/gboard/list" class="store">Store</a>
				</div>
			
			<div class="minititle">
				<div class="event-one">
					<ol>
						<li class="event-one-word">
						NEW Character Update<br>
						PATHFINDER
						 </li>
					</ol>
				</div>
					
				
					<div class="event-two">
					
				</div>
					
					<div class="event-three">
					
				</div>
			
					<div class="event-four">
					
				</div>
			</div>
		
	</div>
	
<!-- 여기부터는 바디 -->
	
	
		
		<div class="Best">
			<ol>
				<li class="title">
					Now Playing HOT
				</li> 
			
			
			</ol>
	
		</div>
		<a href="${path}/gboard/list" >
			
			<label class="more">MORE</label>
		</a>
	
		<div class="hotbox">
			<div class="hotbox-in">
			  <img alt="" src="${path}/resources/images/Mine.gif" width="296px" height="395px">
			 		
			 		<div class="viewbox">
			 			<div class="viewicon">
			 				<i class="fa-solid fa-caret-right"></i>
			 			</div>
					<ol>
						<li class="view">121.1K</li>
						
					</ol>
				
					</div>
			 	<ul>
			 		<li class="hotword">Minecraft</li>
			 	</ul>
			</div>
		
		</div>
		
		<div class="hotbox2">
			<div class="hotbox-in2">
				<img alt="" src="${path}/resources/images/popy.gif" width="296px" height="395px">
				<div class="viewbox">
					<div class="viewicon">
			 				<i class="fa-solid fa-caret-right"></i>
			 			</div>
					<ol>
						<li class="view">26.3K</li>
						
					</ol>
				
				</div>
				<ul>
			 		<li class="hotword2">Poppy Playtime</li>
			 		
			 	</ul>
			</div>
		
		</div>
		<div class="hotbox3">
			<div class="hotbox-in3">
				<img alt="" src="${path}/resources/images/Ace.gif" width="296px" height="395px">
				
				<div class="viewbox">
				<div class="viewicon">
			 				<i class="fa-solid fa-caret-right"></i>
			 			</div>
					<ol>
						<li class="view">9.1K</li>
						
					</ol>
				
				</div>
				
				<ul>
			 		<li class="hotword3">ACE COMBAT™ 7: SKIES UNKNOWN</li>
			 	</ul>
			</div>
		
		</div>
	
		<div class="hotbox4">
			<div class="hotbox-in4">
				<img alt="" src="${path}/resources/images/seosebom.gif" width="296px" height="395px">
				<div class="viewbox">
					<div class="viewicon">
			 				<i class="fa-solid fa-caret-right"></i>
			 			</div>
					<ol>
						<li class="view">36.2K</li>
							
					</ol>
				
				</div>
				<ul>
			 		<li class="hotword4">League of Legends</li>
			 	</ul>
			</div>
		
		</div>
	
		<div class="sale">
			<ol >
				<li class="saletitle">Time sale</li>
			
			</ol>
		
			<div class="salebox">
			<a href="https://maplestory.nexon.com/promotion/event/2022/20220611/event/sub01">
				<img alt="" src="${path}/resources/images/bbang.png" class="salebox-1">
			</a>
			</div>
			
			<div class="salebox2">
				<a href="https://maplestory.nexon.com/Promotion/event/2022/20220630/intro">
				<img alt="" src="${path}/resources/images/ignition.png" class="salebox-2">	
				</a>
			</div>
		
		</div>
		<!-- 위클리 베스트  -->
		<div class="Weekly">
			<ol>
				<li class="Weeklyword">Weekly BEST</li>
			</ol>
		
			<div class="W1box">
				<div class="W1box2">
					<ol>
						<li class="wword1">01</li>
						<li class="weekword1">Weekly BEST<br>Game</li>
					</ol>
				</div>
			</div>
			<div class="W2box">
				<div class="W2box2">
					<ol>
						<li class="wword2">02</li>
						<li class="weekword2">Weekly BEST<br>
											  Game</li>
					</ol>
				</div>
			</div>
			
			<div class="W3box">
				<div class="W2box3">
					<ol>
						<li class="wword3">03</li>
						<li class="weekword3">Weekly BEST<br> Game</li>
					</ol>
				</div>
			</div>
			
				<ol>
					<li class="weeklylank">04</li>				
				</ol>
			<div class="weeklymini">
				
			</div>
			
			<hr class="line1">
			
			<ol>
					<li class="weeklylank2">05</li>				
				</ol>
				<div class="weeklymini2">
			
				
			</div>
			
			<hr class="line2">
			
			<!-- 위클리 미니 -->
			
			<ol>
					<li class="weeklylank3">06</li>				
			</ol>
			
			<div class="weeklymini3">
				
			</div>
			
			<hr class="line3">
			
			<ol>
					<li class="weeklylank4">07</li>				
			</ol>
			
			<div class="weeklymini4">
				
			</div>
			
			<hr class="line4">
			
			<ol>
					<li class="weeklylank5">08</li>				
			</ol>
			
			<div class="weeklymini5">
				
			</div>
			
			
			<ol>
					<li class="weeklylank6">09</li>				
			</ol>
				
				<div class="weeklymini6">
				
			</div>
			
			
		</div>
		
	    <hr class="footerline">
	    
	    
	    <div class=footer> </div>
	    
</body>
</html>
