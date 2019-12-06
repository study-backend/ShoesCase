<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ksw
  Date: 04/12/2019
  Time: 2:19 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
    
    /*공통*/
	a{color:#000; text-decoration:none;}
	a:hover{color:#000; font-weight:bold;}
	ul li{list-style: none; margin:0; padding:0;}
	body{height:2200px;}	

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
        

	/* footer */
    #footerTable{border: none; }
    #footerTable td{border: none; }
    .f{padding:8px; font-size: 12px;margin-left: 300px;}
    .s{padding:8px; font-size: 12px;margin-left: 50px;}
    .footerHr{border: 0; height: 1px}
    </style>

</head>
<body style="margin: 0px;">

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
			<li class="mL"><a href="#"><span>카테고리</span></a>&nbsp;&nbsp;&nbsp;|
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
			<li class="mL"><a href="product?categoryName=sneakers"><span>운동화</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
			<li class="mL"><a href="product?categoryName=gudu"><span>구두</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
			<li class="mL"><a href="product?categoryName=sandal"><span>샌들</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
			<li class="mL"><a href="product?categoryName=boots"><span>부츠</span></a>&nbsp;&nbsp;&nbsp;&nbsp;</li>
		</ul>
		<img src="image/basket.png" id="basketimg">
			<div id="side_search">
				<form name="searchBox" method="get" action="#" id="searching">
				<input type="text" style="width:179px; height:36px; border-radius:18px; background-color:#F7F7F7; border: none;">
				<input type="image" src="image/search.png" style="float: right; width: 55px; border-radius: 18px" onclick="goSearch()">
				</form>
			</div>
	</div>

<div class="boardForm1" style="box-sizing: border-box; margin-left: 300px; margin-right: 300px; margin-top: 150px">

    <div class="boardName" style="float: left; display: block; width: 23%;">
        <h2>마이슈즈</h2>
        <div class="boardMenu">
            <ul class="list_menu" style="padding: 10px">
                <li style="border: solid 1px gray">
                    <a href="memberOrLi.jsp">주문 내역</a>
                </li>
                <li style="border: solid 1px gray; border-top: none">
                    <a href="myInfoChange.html">개인 정보 수정</a>
                </li>
            </ul>
        </div>
    </div>
    <div style="float: left; margin-left: 30px;">
        <h3 style="padding-bottom: 18px">주문 내역</h3>

        <c:choose>
        <c:when test="${empty list}">
        <div style="width: 740px; padding-top: 40px; padding-bottom : 40px; border-top: 2px solid purple; border-bottom: 1px solid lightgray; text-align: center">
            주문내역이 없습니다.
        </div>
        </c:when>
        <c:otherwise>
        <div style="width: 740px; padding-top: 40px; padding-bottom : 40px; border-top: 2px solid purple; border-bottom: 1px solid lightgray;">
            <table>

                <c:forEach var="purchaseItem" items="${list}">
                    <tr>
                        <td rowspan="2"><c:out value="${purchaseItem.img}"/></td>
                        <td colspan="2"><c:out value="${purchaseItem.name}"/></td>
                        <td rowspan="2"><c:out value="${purchaseItem.state}"/></td>
                    </tr>
                    <tr>
                        <td colspan="2">${purchaseItem.price}</td>
                    </tr>
                </c:forEach>

        </c:otherwise>
        </c:choose>
            </table>
        </div>
    </div>

</div>

<br><br><br>
<hr class="footerHr" color="gray">
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

</body>
</html>