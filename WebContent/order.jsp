<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500|Pacifico&display=swap&subset=korean" rel="stylesheet">
<title>Insert title here</title>
<style type="text/css">
	/*공통*/
	#header, #container {position: relative;}
	*{color:#000; text-decoration:none; font-family: 'Noto Sans KR', sans-serif;}
	a:hover{color:#000; font-weight:bold;}
	ul li{list-style: none;}
	h1,h2,h3,h4,h5,p,ul,li{
    margin: 0px;
    padding: 0px;
	}
	table, th, td {border: 1px solid white; border-collapse: collapse; }
	hr{margin-top:10px; color:#FAFAFA}
	/* container */
	#container{width:1254px; height:1189; margin:auto;}
	
	/* header */
	#header{width:1254px; height:180px; /* border:1px solid red; */ margin:auto;}
	#usermenu{width:1050px; height:37px; margin-left:162px; margin-right:40px;}
	#headerlogo{width:1050px; height:63px; margin-left:102px; margin-right:102px; position: relative;}
	#logo {display: block; width:200px; height:80px; margin-left:440px; margin-right:500px; margin-bottom: 20px }
	#headerul {float:right;}
	#header ul li {margin-top: 15px; margin-left:10px; float:left;}
	#gnb{width:1254px; height:56px; /* border:1px solid blue; */ }
	#gnbin{position:relative; width:1150px; height:56px; /* border:1px solid blue; */ margin:0 auto; }
	.gnb_ul{width:1150px; height:56px; float:left; height:55px; }
	.gnb_li {float:left; width:190; height:55;}
	.gnb_li a{ padding: 16px 50px 0 48px; font-size:18px;}	
	#side_search{position: absolute; right:135px; top:110px; width:240px; height:40px; /* border:1px solid green */; border-radius:18px; background-color:#F7F7F7;}
	#searchimg{position:absolute; right:10px; top:5px; width:40px; height:30px;}
	#basketimg{position:absolute; right:75px; top:106px; width:50px; height:50px;}
	
	/* main */
	#main{margin-bottom:300px; margin:auto;}
	#orderName{width:1000px; margin:auto; margin-left:470px;}
	#orderName h1{margin-left:98px; font-size:50px}
	#orderName h5{padding:20px; color:#999999;}
	#order{margin:auto;}

	#goods th{height:50px;}
	#goods td{height: 200px;}	
	.goods_tr{border-top-color:#5F0080;}
	.title{padding-top:40px; padding-bottom:15px; padding-left:20px; text-align:left;}
	.imagearea{width:130px;}
	.infoarea{width:720px;}
	.pricearea{width:150px;}
	
	.orderInfo th{width:190px; height:54px; padding:22px 0 0 20px; text-align:left; vertical-align:top;}
	.orderInfo td{width:810px; height:54px;}
	.tel_read_only{width:70px}
	.read_only{border:0 none; text-align:left;}

	.deliInfo th{width:190px; height:54px; padding:22px 0 0 20px; text-align:left; vertical-align:top;}
	.deliInfo td{width:810px; height:54px;}
	.deli_phone{width:70px}
	#del_addr{width:517px}
	#deli_memo{width:500px; height:73px; padding:10px; text-align:left;}

	.credit_table{margin-top:10px}
	.credit{width:200px;}
	.credit button{width:100px; height:40px;}
	#buy{width:354px; height:56px; margin-top:20px; margin-top:30px; margin-left:450px; color:#FFFFFF; background-color:#5F0080; border-radius:5px; outline:0;}

</style>
</head>
<body>
	<div id="container"> 
	<form> 

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
				<li class="gnb_li"><a href="#"><span>전체카테고리</span></a>  |</li>
				<li class="gnb_li"><a href="#"><span>운동화</span></a>  |</li>
				<li class="gnb_li"><a href="#"><span>구두</span></a>  |</li>
				<li class="gnb_li"><a href="#"><span>샌들</span></a>  |</li>
				<li class="gnb_li"><a href="#"><span>부츠</span></a>  |</li>
			</ul>
			</div>
			<img src="image/basket.png" id="basketimg">
			<div id="side_search">
				<img src="image/search.png" id="searchimg">
			</div>
			
		</div>
	</div>
	
	<div id="main">
	<div id="orderName">
	<h1>주문서</h1>	
	<h5>주문하실 상품명 및 수량을 정확하게 확인해 주세요.</h5>
	</div>
	<div id="order">
		<div class="title"> 
		<h3>상품 정보</h3>
		</div>
		<div>
			<table id="goods">
				<tr id="goods_tr">
					<th class="imagearea">상품사진</th>
					<th class="infoarea">상품정보</th>
					<th class="pricearea">상품금액</th>
				</tr>
				
				<tr>
					<td class="imagearea" ><img src=""></td>
					<td class="infoarea"><div></div></td>
					<td class="pricearea"><div></div></td>
				</tr>
			</table>
		</div>
		<hr>
		<div class="title">
		<h3>주문자 정보</h3>
		</div>
		<div>
			<table class="orderInfo">
				<tr>
					<th>주문자명*</th>
					<td><input type="text" readonly="readonly" class="read_only"></td>
				</tr>
				<tr>
					<th class="telarea">휴대폰*</th>
					<td><input type="text" max-length="3" readonly="readonly" class="read_only tel_read_only" >
						<span> - </span>
						<input type="text" max-length="4" readonly="readonly" class="read_only tel_read_only"> 
						<span> - </span>
						<input type="text" max-length="4" readonly="readonly" class="read_only tel_read_only"></td>
				</tr>
				<tr>
					<th>이메일*</th>
					<td><input type="text" readonly="readonly" class="read_only"></td>
				</tr>
			</table>
		</div>
		<hr>
		<div class="title"> 
		<h3>배송정보</h3>
		</div>
		<div>	
			<table class="deliInfo">
				<tr>
					<th>이름*</th>
					<td><input type="text" required="required"></td>
				</tr>
				<tr>
					<th class="telarea">휴대폰*</th>
					<td><input type="text" maxlength="3" class="deli_phone" required="required">
						<span> - </span>
						<input type="text" maxlength="4" class="deli_phone" required="required"> 
						<span> - </span>
						<input type="text" maxlength="4" class="deli_phone" required="required"></td>
				</tr>
				<tr>
					<th>주소*</th>
					<td><input type="text" id="del_addr" required="required"></td>
				</tr>
				<tr>
					<th>요청사항</th>
					<td><textarea id="deli_memo"></textarea></td>
				</tr>
			</table>	
		</div>
		<hr>
		<div class="title"> 
		<h3>결제수단</h3>
		</div>
		<table class="credit_table">
			<tr>
				<td class="credit">
					<input type="radio" name="pay" value="카드"/><button type="button">카드</button>
				</td>
				<td class="credit">
					<input type="radio" name="pay" value="계좌이체"/><button type="button">계좌이체</button>
				</td>
				<td class="credit">
					<input type="radio" name="pay" value="핸드폰"/><button type="button">휴대폰</button>
				</td>
			</tr>
		</table>
		<div id="bottom">
		<button id="buy">결제하기</button>
		</div>
	</div>
	</div>
	</form> 
	 
	
	<div id="foot">
	</div>
	</div>
</body>
</html>