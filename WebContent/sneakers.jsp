<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500|Pacifico&display=swap&subset=korean"
          rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script> 
	window.onload = function () {
		var inFo = sessionStorage.getItem("user");
		var inFoObj = JSON.parse(inFo);

		if(inFoObj==null){
			document.getElementById("loginState").innerHTML="<li><a href=\"/ShoesCase/signupForm.jsp\">회원가입</a> ㅣ</li><li><a href=\"/ShoesCase/loginReal.jsp\"> 로그인</a></li>"
		}else {
			document.getElementById("loginState").innerHTML="<li>"+inFoObj.name+"님 ㅣ</li><li><a href=\"/ShoesCase/myInfoChangeReal.jsp\">  내 정보 ㅣ</a></li>"+
			"<li><button type='submit' id='logoutb' style='background-color:white; border-style:none; font-size:16px;'>로그아웃</button></li>"
		}

	}
		$(function () {
            $("#logoutb").on("click",function () {
          
                sessionStorage.clear();
                
            });
        });

		function goSearch() {
            document.searchBox.submit();
        }
</script>
<style type="text/css">
/*공통*/
	a{color:#000; text-decoration:none;}
	*{font-family: 'Noto Sans KR', sans-serif;}
	a:hover{color:#000; font-weight:bold; font-family: 'Noto Sans KR', sans-serif;}
	ul li{list-style: none; margin:0px; padding:0;}
	body{height:2200px;}
	span{margin:0px; padding:0px;}
		
	/* header */
	#header{width:1200px; height:100px; margin:auto;}
	#header #headerlogo{display: inline-block; margin:auto;}
	#header ul {float:right;}
	#header ul li {margin-left:10px; float:left;}
	#header #headerlogo{margin:auto; margin-left: 500px; margin-top:25px;}
	#loginState{float:right; margin-left:10px;}
	/* nav */	
	#nav{width:1200px; height:50px; margin:auto; position: sticky; top: 0;}
	#nav ul .mL{width:110px; height:50px; margin-left:20px; margin-right:10px; float:left; font-size:20px;}
	#nav .main>li:hover .sub{display:block; }
	#nav .main .sub {position:absolute;  height:50px; top:50px; left:40px; display:none;}
	#nav .main .sub li {width:80px; margin-top:5px; }
	
	#side_search{position: absolute; right:220px; width:240px; height:40px; border-radius:18px; background-color:#F7F7F7;}
	#searchimg{position:absolute; right:10px; top:5px; width:40px; height:30px;}
	#basketimg{position:absolute; right:100px;  bottom: 5px; width:50px; height:50px;}
	
	/* nav_down */
	#nav_down {width:1200px; height:100px; margin:auto;}
	#nav_down #a {width:1200px; height:30px; background-color:red;}
	#nav_down #b {width:1200px; height:50px; font-size:20px;}
	#nav_down span {width:1200px; height:50px; border-bottom:2px solid black;}
	
	/* sneakers */
	#sneakers {width:1200px; height:700px; margin:20px auto; }
	#sneakers ul li {width:300px; height:500px; margin-left:5%; float:left;}
	#sneakers #list_sneakers{width:300px; height:350px;}
	#sneakers #list_sneakers img{width:300px; height:350px;}
	#sneakers #list_sneakers #sL_a {font-size:30px; display:block;}
	
	 /* footer */
	 #footer{margin-left:550px;}
    #footerTable{border: none; }
    #footerTable td{border: none; }
    .f{padding:8px; font-size: 12px;margin-left: 200px;}
    .s{padding:8px; font-size: 12px;margin-left: 50px;}
    .footerHr{border: 0; height: 1px}
	
</style>
</head>
<body>
	<div id="header">
		<div id="loginState">
		<!-- <ul>
			<li><a href="signupForm.jsp">회원가입</a></li>
			<li><a href="loginReal.html">로그인</a></li>
		</ul> -->
		</div>
		<div id="headerlogo">
			<a href="out_main.html"><img src="image/LOGO.png" id="logo"></a>
		</div>
	</div>
	<div id="nav">
		<ul class="main">
        <li class="mL"><a href="#"><span style="margin-left:-10px">카테고리</span></a>&nbsp;&nbsp;&nbsp;&nbsp;
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
			<li class="mL"><a href="front?resource=product&categoryName=sneakers">운동화</a></li>
			<li class="mL"><a href="front?resource=product&categoryName=dressShoes">구두</a></li>
			<li class="mL"><a href="front?resource=product&categoryName=sandal">샌들</a></li>
			<li class="mL"><a href="front?resource=product&categoryName=boots">부츠</a></li>
		</ul>
		<a href="shoppingBasket.jsp"><img src="image/basket.png" id="basketimg"></a>
    	<div id="side_search">
        <form name="searchBox" method="get" action="#" id="searching">
            <input type="text"
                   style="width:185px; height:36px; border-radius:18px; background-color:#F7F7F7; border: none;">
            <input type="image" src="image/search.png" style="float: right; width: 45px; border-radius: 18px"
                   onclick="goSearch()">
        </form>
    	</div>
	</div>
	
	<div id="nav_down">
		<div id="a">
		</div>
		<div id="b">
			운동화
		</div id="c">
			<span>전체보기</span>
		<div>
			
		</div>
	</div>
	
	
	<%-- 테스트 위해 사용됨
	   List<String> list = new ArrayList<>();
	list.add("사과");
	list.add("딸기");
	list.add("포도");
	
	list.add("바나나");
	list.add("귤");
	list.add("키위");
	
	list.add("배");
	list.add("배");
	list.add("배");
	
	
	list.add("배");
	list.add("배");
	
	request.setAttribute("list", list);
	
	--%>

	<!-- 마지막 줄이 3개가 아닐 경우에 list가 끝날때 닫아야 해서 사이즈 구하는 함수 씀 -->
	<c:set var="size" value="${fn:length(list)}" />
	
	
	<c:forEach var="list" items="${requestScope.list}" varStatus="state">
	  <c:if test="${state.count%3==1}">
	     <div id="sneakers">
		    <div id="list_sneakers">
		<ul>
	  </c:if>
		
			<li class="sL">
				<a href="front?resource=detail&goodsNameOrImg=${list.name}"><img src="${list.sumnailPath}"></a>
				<a href="front?resource=detail&goodsNameOrImg=${list.name}" id="sL_a">${list.name}</a>
				<span>${list.price}</span>	
			</li>
	 
	 <c:choose>
	   <c:when test="${state.count%3==0}">
	        </ul>
			</div>
		    </div>
	   </c:when>
	   <c:when test="${state.count==size}">
	        </ul>
			</div>
		    </div>
	   </c:when>
	 </c:choose>		
	
	</c:forEach>
	
	
	<br><br><br>
<hr class="footerHr" color="gray"  >
<div id="footer"> 
<table id= "footerTable">
<tr>
<td>
   <div class="f">
         <p><strong>(주)슈즈케이스</strong>&nbsp;&nbsp;&nbsp;대표이사: 장희정<br>
         주소: 경기도 성남시 판교로 유스페이스2 B동<br>
         사업자등록번호: 123-456-7890&nbsp;
         반품지 주소: 미국 하와이 123-58번지 <br>
         <em style="margin-left:65px;">Shoes Case 온라인 물류센터(02-1588-9667)</em><br></p>
         <p class="mt10" style="line-height:1.4">본 상품의 상품이미지 저작권은 ㈜슈즈케이스 <br>내용의 무단복제를 금합니다.</p>
                        
         <address class="copyright mt10">COPYRIGHT © SHOES-CASE KOREA CO,LTD. ALL RIGHTS RESERVED.</address>
   </div>

</td>
<td>
   <div class="s">
       <h2 class="tit_type1 fs16">통합고객센터</h2>
       <a href="javascript://" class="tel_number">080-701-7770</a>
       <a href="javascript://" class="tel_number">· 1588-9667</a>
       <p class="mt15">운영시간 : 월~금 09:00 ~18:00 (12:00 ~13:00 점심시간)<br><em style="margin-left:55px;">주말, 공휴일 휴무</em><br>
       이메일 : <a href="mailto:abcmartcs@abcmartkorea.com">shoesCase@scmartkorea.com</a></p>
       <ul class="clearfix">
       <li><img src="http://image.abcmart.co.kr/nexti/images/abcmart_new/confirm_01.gif" alt=""></li>
       <li><img src="http://image.abcmart.co.kr/nexti/images/abcmart_new/confirm_02.gif" alt=""></a></li>
       </ul>
   </div>
</td>
</tr>
</table>
</div>
</body>
</html>