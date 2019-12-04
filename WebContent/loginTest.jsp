<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	/*공통*/
	#header, #container {position: relative;}
	a{color:#000; text-decoration:none; font-family: 'Noto Sans KR', sans-serif;}
	a:hover{color:#000; font-weight:bold;}
	ul li{list-style: none;}
	h1,h2,h3,h4,h5,p,ul,li{
    margin: 0px;
    padding: 0px;
}

		
	/* container */
	#container{width:1254px; height:1189; margin:auto;}
	
	/* header */
	#header{width:1254px; height:180px; /* border:1px solid red; */ margin:auto;}
	#usermenu{width:1050px; height:37px; margin-left:162px; margin-right:40px;}
	#headerlogo{width:1050px; height:63px; margin-left:102px; margin-right:102px; position: relative;}
	#logo {display: block; width:200px; height:80px; margin-left:450px; margin-right:500px; margin-bottom: 20px }
	#headerul {float:right;}
	#header ul li {margin-top: 15px; margin-left:10px; float:left;}
	#gnb{width:1254px; height:56px; /* border:1px solid blue; */ }
	#gnbin{position:relative; width:1150px; height:56px; /* border:1px solid blue; */ margin:0 auto; }
	.gnb_ul{width:1150px; height:56px; float:left; height:55px; }
	.gnb_li {float:left; width:190; height:55;}
	.gnb_li a{width:190; height:55; padding: 16px 50px 0 48px; font-size:18px;}	
	#side_search{position: absolute; right:135px; top:110px; width:270px; height:40px; /* border:1px solid green */; border-radius:18px; background-color:#F7F7F7;}
	#searchimg{position:absolute; right:10px; top:5px; width:40px; height:30px;}
	#basketimg{position:absolute; right:75px; top:106px; width:50px; height:50px;}
	/* main */
	
	#main{width:355px; height:600px; margin:auto; /* border:1px solid pink; */}
	#main h3{text-align:center;}
 	#main .log{width:350px; height:50px; border:0; outline:0; border-radius:5px; border:1px solid gray;}
	#main #search{float:right;}
	#blogin{width:354px; height:56px; margin-top:20px; color:#FFFFFF; background-color:#5F0080; border-radius:5px; outline:0;}
	#bsignup{width:354px; height:56px; margin-top:20px; color:#5F0080 ; background-color:#FFFFFF; border-radius:5px; outline:0;}
	#main button span{font-size:16px; }
	#login{height: 100.5px; margin-top: 50px; font-size:30px}
	/* footer */
	#footer{width:1254px; height:100px; /* border:1px solid green; */ margin:auto;}
</style>
</head>
<body>
<div id="container"> 
	<div id="header">
		<div id="usermenu">
			<ul id="headerul">
				<li><a href="signupForm.html">회원가입</a>   ||</li>
				<li><a href="login.html">로그인</a></li>
			</ul>
		</div>
		<div id="headerlogo">
			<a> 
			<img id="logo" src="image/LOGO.png" alt="로고">
			</a>
		</div>	
		<div id="gnb">
			<div id="gnbin">
			<ul class="gnb_ul">
				<li class="gnb_li"><a href="#"><span>전체카테고리</span></a></li>
				<li class="gnb_li"><a href="#"><span>운동화</span></a></li>
				<li class="gnb_li"><a href="#"><span>구두</span></a></li>
				<li class="gnb_li"><a href="#"><span>샌들</span></a></li>
				<li class="gnb_li"><a href="#"><span>부츠</span></a></li>
			</ul>
			</div>
			<img src="image/basket.png" id="basketimg">
			<div id="side_search">
				<img src="image/search.png" id="searchimg">
			</div>
			
		</div>
	</div>
	<div id="main">
		<form  method="post" action="<%= application.getContextPath() %>/front?key=login">
		<div id="login"><h3>로그인</h3></div>
		<input type="text" name="loginId" class="log" value="아이디를 입력해주세요."><br><br>
		<input type="password" name="loginPwd" class="log" placeholder="비밀번호를 입력해주세요."><br>
		<input type="checkbox"><span>보안접속</span>
		<div id="search">
			<a href="#">아이디 찾기</a> | <a href="#">비밀번호 찾기</a>
		</div>
		<input type="submit" id="blogin" value="로그인"><span></span></p>
		<button type="submit" id="bsignup" src="signupForm.html"><span>회원가입</span></button>
		</form>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
</html>