<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

$(document).ready(function(){
	//$('#section div').hide();
	$('#section div').first().show();
	$('#section div').css('width',1000);
	$('#section div').css('height',320);
	setInterval(function(){
		$('#section').append($('#section div').first());
		$('#section div').last().hide();
		$('#section div').first().show();
	}, 3000);
}) 

	function selectAll(){
		  $.ajax({
			  type:"get",
			  url:"../",
		      dataType: "json",//서버에게 받은 응답결과 type(text, xml, html, json)
		      //data : {id: $(this).val() } ,//서버에게 전송할 parameter
		      success: function(result){
	   		        var str="";
	   		         $.each(result, function(index, item){
	   		        	 console.log(item)
	   		        	 str+="<ul>";
	   		        	 str+="<li class='gL'>";
	   		        	 str+="<a href='#'>";
	   		        	 str+="<div>";
	   		        	 str+="<img src=''>"
	   		        	 str+="</div>";
	   		        	 str+="<a href='#' id='gL_a'>"+item.name+"</a>";
	   		        	 str+="<span>"+item.price+"</span>";
	   		        	 str+="</li>";
	   		         })
	   		         
	   		        $("#list_goods tr:gt(0)").remove();
	   		        $("#list_goods tr:eq(0)").after(str);
	   		        $("a").css("textDecoration", "none");
		      } ,
		      error : function(err){
		    	  console.log(err+"=> 오류발생");
		      }
		  });//ajax끝
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
	
	/* nav */	
	#nav{width:1200px; height:50px; margin:auto; position: sticky; top: 0;}
	#nav ul .mL{width:110px; height:50px; margin-left:20px; margin-right:10px; float:left; font-size:20px;}
	#nav .main>li:hover .sub{display:block; }
	#nav .main .sub {position:absolute;  height:50px; top:50px; left:40px; display:none;}
	#nav .main .sub li {width:80px; margin-top:5px; }
	
	#side_search{position: absolute; right:220px; width:240px; height:40px; border-radius:18px; background-color:#F7F7F7;}
	#searchimg{position:absolute; right:10px; top:5px; width:40px; height:30px;}
	#basketimg{position:absolute; right:150px;  bottom: 5px; width:50px; height:50px;}
	
	/* section */
	#section{width:1200px; height:320px; margin:auto;}
	
	#one {background-color:blue; text-align:center;}
	#two {background-color:pink;}
	#three {background-color:red;}
	#four {background-color:black;}
	
	/* goods */
	#goods {width:1200px; height:700px; margin:auto;}
	#goods h2 {width:1200px; height:80px; text-align:center; }
	#goods ul li {width:230px; height:500px; margin-left:40px; float:left;}
	#goods #list_goods div{width:230px; height:350px; display:flex; overflow:hidden; align-items:center; justify-content:center;}
	#goods #list_goods div img{width:100%; height:100%}
	#goods #list_goods #gL_a {font-size:30px; display:block;}
	
	
	/* md */
	#md {width:1200px; height:700px; margin:auto;}
	#md h2 {width:1200px; height:80px; text-align:center;}
	#md ul li {width:230px; height:500px; margin-left:40px; float:left;}
	#md #list_md div{width:230px; height:350px; display:flex; overflow:hidden; align-items:center; justify-content:center;}
	#md #list_md div img{width:100%; height:100%}
	#md #list_md #mL_a {font-size:30px; display:block;}
	
	/* footer */
    #footerTable{border: none; }
    #footerTable td{border: none; }
    .f{padding:8px; font-size: 12px;margin-left: 200px;}
    .s{padding:8px; font-size: 12px;margin-left: 50px;}
    .footerHr{border: 0; height: 1px}
     #tabled {width: 1200px; margin:auto;}
	
</style>
</head>
<body>
	<div id="header">
		<ul id="loginState">
		<!-- <li><a href="signupForm.jsp">회원가입</a></li>
        <li><a href="login.html">로그인</a></li> -->
		</ul>
		<div id="headerlogo">
			<a href="out_main.html"><img src="image/LOGO.png" id="logo"></a>
		</div>
	</div>
	<div id="nav">
    <ul class="main">
        <li class="mL"><a href="#"><span style="margin-left:-10px">카테고리</span></a>&nbsp;&nbsp;&nbsp;&nbsp;
       	     <ul class="sub">
                <li><a href="sneakers.jsp">운동화</a></li>
                <li><a href="#">구두</a></li>
                <li><a href="#">샌들</a></li>
                <li><a href="#">부츠</a></li>
                <li><a href="#">나이키</a></li>
                <li><a href="#">아디다스</a></li>
                <li><a href="#">퓨마</a></li>
                <li><a href="#">반스</a></li>
            </ul>
        </li>
        <li class="mL"><a href="front?resource=product&categoryName=sneakers"><span>운동화</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
        <li class="mL"><a href="front?resource=product&categoryName=dressShoes"><span>구두</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
        <li class="mL"><a href="front?resource=product&categoryName=sandal"><span>샌들</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
        <li class="mL"><a href="front?resource=product&categoryName=boots"><span>부츠</span></a>&nbsp;&nbsp;&nbsp;&nbsp;</li>
    </ul>
    <a href=shoppingBasket.jsp"><img src="image/basket.png" id="basketimg"></a>
		<div id="side_search">
			<form name="searchBox" method="get" action="#" id="searching" url=shopping_basket.html">
				<input type="text"
					style="width:185px; height:36px; border-radius:18px; background-color:#F7F7F7; border: none;">
				<input type="image" src="image/search.png" style="float: right; width: 45px; border-radius: 18px"
					onclick="goSearch()">
			</form>
		</div>
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
			
		</div>
	</div>
	<div id="md">
		<div id="tit_md">
			<h2>MD의 추천</h2>
		</div>
		<div id="list_md">
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
					<a href="front">
						<div>
							<img src="image/mainImage/andy.png">
						</div>
					</a>
					<a href="detailPage.html" id="gL_a">아디다스</a>
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

<br><br><br>
<hr class="footerHr" color="gray"  >
<div id="tabled">
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

	<script type="text/javascript">
	$(function(){
			$.ajax({
			type : "get" ,
			url : "/ShoesCase/api/v1", 
			dataType : "json", 
			data : { data: "",
					 resource: "Goods",
					 route: "goodsMain" 
			},
			
			//contentType: 'application/json; charset=utf-8',
			success : function(result) { 
				console.log("나오나"+result);
				var str="";
				var cat="";
				var ban="";
				 $.each(result, function(index, item){
					 console.log(item);
					 if(index === "goodsList"){
						 for (var v of item) { 
							 str+="<ul>";
							 console.log(v.price);
					        	 str+="<li class='mL'>";
					        	 str+="<a href='#'>";
					        	 str+="<div>";
					        	 str+="<img src='image/sneakers/andy.png'>";
					        	 str+="</div>";
					        	 str+="</a>";
					        	 str+="<a href='#' id='mL_a'>"+v.name+"</a>";
					        	 str+="<span>"+v.price+"원</span>";
					        	 str+="</li>";

				        	 str+="</ul>";
				        	 
							 }
						 console.log("goodlist_str" + str);
						 $("#list_goods").html(str);
					 };
					 
					 /* if (index === "categoryList"){
						 cat +="<ul class='main'>";
						 cat +="<li class='mL'><a href='#''>카테고리</a>";
						 cat +="<ul class='sub'>"
						 for (var v of item) {
							cat +="<li><a href="+v.name+".jsp>"+v.name+"</a></li>"
						 }
						 	cat +="</ul>"

						 for (var v of item) { 
						 	cat+="<li class='mL'><a href="+v.name+".jsp>"+v.name+"</a></li>";
						 }
						 cat +="</li>"
						 cat+="</ul>";
						 
						 $("#nav").html(cat);
						 
					 }; */
					 if (index === "bannerList"){
						 for (var v of item) {
							ban +="<img src="+v.img_path+">";
						 }
						 console.log(ban);
						 $("#section").html(ban);
					 };			 
			});
				 
			},
			error : function(error) {
				console.log(error);
				//alert("아이디 또는 비밀번호를 확인해주세요.");
			}
		});//ajax끝	
	}); 
	</script>

</body>


</html>