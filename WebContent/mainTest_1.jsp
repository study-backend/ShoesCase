<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	/*공통*/
	a{color:#000; text-decoration:none;}
	a:hover{color:#000; font-weight:bold;}
	ul li{list-style: none; margin:0; padding:0;}
	body{height:2200px;}
		
	/* header */
	#header{width:1200px; height:100px; border:1px solid red; margin:auto;}
	#header #headerlogo{display: inline-block; margin:auto;}
	#header ul {float:right;}
	#header ul li {margin-left:10px; float:left;}
	
	/* nav */	
	#nav{width:1200px; height:50px; border:1px solid blue; margin:auto; position: sticky; top: 0;}
	#nav ul .mL{width:100px; height:50px; margin-left:30px; float:left;}
	#nav .main>li:hover .sub{display:block; }
	#nav .main .sub {position:absolute;  height:50px; top:50px; left:40px; display:none;}
	#nav .main .sub li {width:60px;}
	
	#nav #img-btn {background: url("") no-repeat;}
	
	/* section */
	#section{width:1200px; height:320px; border:1px solid red; margin:auto;}
	
	#one {background-color:blue; text-align:center;}
	#two {background-color:pink;}
	#three {background-color:red;}
	#four {background-color:black;}
	
	/* goods */
	#goods {width:1200px; height:700px; margin:auto;}
	#goods h2 {width:1200px; height:80px; text-align:center; }
	#goods ul li {width:230px; height:500px; margin-left:40px; float:left;   }
	#goods #list_goods div{width:230px; height:350px; display:flex; overflow:hidden; align-items:center; justify-content:center;}
	#goods #list_goods #gL_a {font-size:30px; display:block;}
	
	
	/* md */
	#md {width:1200px; height:700px; margin:auto;}
	#md h2 {width:1200px; height:80px; text-align:center;}
	#md ul li {width:230px; height:500px; margin-left:40px; float:left;}
	#md #list_md div{width:230px; height:350px; display:flex; overflow:hidden; align-items:center; justify-content:center;}
	#md #list_md #mL_a {font-size:30px; display:block;}
	
	/* footer */
    #footerTable{border: none; }
    #footerTable td{border: none; }
    .f{padding:8px; font-size: 12px;margin-left: 200px;}
    .s{padding:8px; font-size: 12px;margin-left: 50px;}
    .footerHr{border: 0; height: 1px}
	
</style>
</head>
<body>
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
				</ul>
			</li>
			<li class="mL"><a href="front?resource=product&categoryName=sneakers">운동화</a></li>
			<li class="mL"><a href="front?resource=product&categoryName=dressShoes">구두</a></li>
			<li class="mL"><a href="front?resource=product&categoryName=sandal">샌들</a></li>
			<li class="mL"><a href="front?resource=product&categoryName=boots">부츠</a></li>
		</ul>
		<input type="text">
		<button type="submit" id="img_btn"><img src="./image/a.png"></button>
	</div>
	
	<div id="section">
		<div id="one"></div>
 		<div id="two"></div>
		<div id="three"></div>
		<div id="four"></div>
	</div>
	
	<div id="goods">
		<div id="tit_goods">
			<h2>이 상품 어때요?</h2>
		</div>
		<div id="list_goods">
			<ul>
				<li class="gL">
					<a href="#">
					<div>
						<img src="image/mainImage/big.jpg">
					</div>
					</a>
					<a href="#" id="gL_a">나이키</a>
					<span>20,000원</span>	
				</li>
				<li class="gL">
					<a href="#">
						<div>
							<img src="image/mainImage/boston.jpg">
						</div>
					</a>
					<a href="#" id="gL_a">아디다스</a>
					<span>20,000원</span>	
				</li>
				<li class="gL">
					<a href="front?resource=reviewSelect">
						<div>
							<img src="image/mainImage/andy.png">
						</div>
					</a>
					<a href="front?key=reviewSelect" id="gL_a">아디다스</a>
					<span>20,000원</span>	
				</li>
				<li class="gL">
					<a href="#">
						<div>
							<img src="image/mainImage/ferry.jpg">
						</div>
					</a>
					<a href="#" id="gL_a">아디다스</a>
					<span>20,000원</span>	
				</li>
			</ul>
		</div>
	</div>
	<div id="md">
		<div id="tit_md">
			<h2>MD의 추천</h2>
		</div>
		<div id="list_md">
			<ul>
				<li class="mL">
					<a href="#"><div></div></a>
					<a href="#" id="mL_a">가나다</a>
					<span>20,000원</span>	
					<a href="#">
					<div>
						<img src="image/mainImage/flower03.jpg">
					</div>
					</a>
					<a href="#" id="mL_a">������</a>
					<span>20,000��</span>	
				</li>
				<li class="mL">
					<a href="#"><div></div></a>
					<a href="#" id="mL_a">가나다</a>
					<span>20,000원</span>	
					<a href="#">
					<div>
						<img src="image/mainImage/bold03.jpg">
					</div>
					</a>
					<a href="#" id="mL_a">������</a>
					<span>20,000��</span>	
				</li>
				<li class="mL">
					<a href="#"><div></div></a>
					<a href="#" id="mL_a">가나다</a>
					<span>20,000원</span>	
					<a href="#">
					<div>
						<img src="image/mainImage/classic.jpg">
					</div>
					</a>
					<a href="#" id="mL_a">������</a>
					<span>20,000��</span>	
				</li>
				<li class="mL">
					<a href="#"><div></div></a>
					<a href="#" id="mL_a">가나다</a>
					<span>20,000원</span>	
					<a href="#">
					<div>
						<img src="image/mainImage/gray.jpg">
					</div>
					</a>
					<a href="#" id="mL_a">������</a>
					<span>20,000��</span>	
				</li>
			</ul>
		</div>
	</div>
	
	
	<br><br><br>
<hr class="footerHr" color="gray"  >
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