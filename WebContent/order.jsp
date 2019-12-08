<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	table, th, td {border: 1px solid /* white */red; border-collapse: collapse; }
	hr{margin-top:10px; color:#FAFAFA}
	/* container */
	#container{width:1254px; height:1189; margin:auto;}
	
	/* header */
	#header{width:1200px; height:100px; margin:auto;}
	#header #headerlogo{display: inline-block; margin:auto;}
	#header ul {float:right;}
	#header ul li {margin-left:10px; float:left;}
	#header #headerlogo{margin:auto; margin-left: 500px; margin-top:25px;}
	
	/* nav */	
	#nav{width:1200px; height:50px; margin:auto; position: sticky; top: 0;}
	#nav ul .mL{width:100px; height:50px; margin-left:30px; float:left; font-size:20px;}
	#nav .main>li:hover .sub{display:block; }
	#nav .main .sub {position:absolute;  height:50px; top:50px; left:40px; display:none;}
	#nav .main .sub li {width:80px; margin-top:5px; }
	
	#side_search{position: absolute; right:220px; width:240px; height:40px; border-radius:18px; background-color:#F7F7F7;}
	#searchimg{position:absolute; right:10px; top:5px; width:40px; height:30px;}
	#basketimg{position:absolute; right:150px;  width:50px; height:50px;}
	
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
<script type="text/javascript" src="./js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="./js/script.js"></script>
<script type="text/javascript">
$(function(){
	$("#buy").click(function(){
		
		let str = $("#purchaseForm").serializeObject();
		console.log(str);
		
		$.ajax({
		type : "post" ,
		url : "/ShoesCase/api/v1", 
		dataType : "json", 
		data : { data: JSON.stringify(str),
				 resource: "Purchase",
				 route: "purchase" 
		},
		//contentType: 'application/json; charset=utf-8',
		success : function(result) { 
			console.log(result.statusCode);
			if(result.statusCode === "Success") {
				alert("구매 성공");
				
				
				//location.href='/ShoesCase/goods/main.html' 
			} else {
				alert("구매가 실패했습니다.");
			}
		},
		error : function(error) {
			console.log(error);
			alert("오류가 발생되었습니다");
		}
	});//ajax끝

	})			

});
</script>
</head>
<body>
	<div id="container"> 

	<div id="header">
		<ul>
			<li><a href="signupForm.jsp">회원가입</a></li>
			<li><a href="login.html">로그인</a></li>
		</ul>
		<div id="headerlogo">
			<a>
			<img id="logo" src="image/LOGO.png" url="dressShoes.html" alt="로고">
			</a>
		</div>
	</div>
	<div id="nav">
		<ul class="main">
			<li class="mL"><a href="#">카테고리</a>
				<ul class="sub">
					<li><a href="sneakers.html">운동화</a></li>
					<li><a href="#">구두</a></li>
					<li><a href="#">샌들</a></li>
					<li><a href="#">부츠</a></li>
					<li><a href="#">나이키</a></li>
					<li><a href="#">아디다스</a></li>
					<li><a href="#">퓨마</a></li>
					<li><a href="#">반스</a></li>
				</ul>
			</li>
			<li class="mL"><a href="product?categoryName=sneakers">운동화</a></li>
			<li class="mL"><a href="product?categoryName=gudu">구두</a></li>
			<li class="mL"><a href="product?categoryName=sandal">샌들</a></li>
			<li class="mL"><a href="product?categoryName=boots">부츠</a></li>
		</ul>
		<img src="image/basket.png" id="basketimg">
			<div id="side_search">
				<form name="searchBox" method="get" action="#" id="searching">
				<input type="text" style="width:179px; height:36px; border-radius:18px; background-color:#F7F7F7; border: none;">
				<input type="image" src="image/search.png" style="float: right; width: 55px; border-radius: 18px" onclick="goSearch()">
				</form>
			</div>
	</div>
	<form method="post" id="purchaseForm" name="purchaseForm">
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
				<%
				Cookie cookie [] = request.getCookies();
				%>
				<c:forEach var="cart" items="<%=cookie%>"> 
				<tr>
					<td class="imagearea" id="imagebox"><img  name="imagebox"></td>
					<td class="infoarea" id="infobox"><div><input type="text" name="infobox"/></div></td>  <!-- 위아래로 잘 나오면 이렇게 하고 아니면 td 하나더 생성해서 th는 colspan 쳐야해  -->
					<td class="pricearea" id="pricebox"><div><input type="text" name="pricebox" /></div></td>
				</tr>
				</c:forEach>
				
				 
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
					<td><input type="text" readonly="readonly" class="read_only" name="orderername"></td>
				</tr>
				<tr>
					<th class="telarea">휴대폰*</th>
					<td>
						<input type="text" max-length="10" readonly="readonly" class="read_only tel_read_only" name="orderertel">
					</td>
				</tr>
				<tr>
					<th>이메일*</th>
					<td><input type="text"  class="read_only" name="orderermail"></td>
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
					<td><input type="text" required="required" name="recipientname"></td>
				</tr>
				<tr>
					<th class="telarea">휴대폰*</th>
					<td>
						<input type="text" maxlength="10" class="deli_phone" required="required" name="recipienttel">
					</td>
				</tr>
				<tr>
					<th>주소*</th>
					<td><input type="text" id="del_addr" required="required" name="recipientaddr"></td>
				</tr>
				<tr>
					<th>요청사항</th>
					<td><textarea id="deli_memo" name="recipientmemo"></textarea></td>
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