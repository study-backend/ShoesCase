<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500|Pacifico&display=swap&subset=korean"
          rel="stylesheet">
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript">
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
	function selectAll(){
		  $.ajax({
			  type:"get",
			  url:"../front",
		      dataType: "json",
		      success: function(result){
	   		        var str="";
	   		         $.each(result, function(index, item){
	   		        	 str+="<tr>";
	   		        	 str+="<td>"+(index+1)+"</td>";
	   		        	 str+="<td><a href='#'>"+item.title+"</a></td>";
	   		        	 str+="<td>"+item.content+"</td>";
	   		        	 str+="<td>"+item.score+"</td>";
	   		        	 str+="<td>"+item.createDate+"</td>";
	   		        	 str+="<td>"+item.updateDate+"</td>";
	   		        	 str+="</tr>";
	   		         })
	   		        
	   		        $("#review_t tr:gt(0)").remove();
	   		        $("#review_t tr:eq(0)").after(str);
	   		        $("a").css("textDecoration", "none");
		      } ,
		      error : function(err){
		    	  console.log(err+"=> error");
		      }
		  });//ajax끝
	  }
})
	

</script>
<style type="text/css">
	/*공통*/
	*{font-family: 'Noto Sans KR', sans-serif;}
	a{color:#000; text-decoration:none;}
	a:hover{color:#000; font-weight:bold;}
	ul li{list-style: none; margin:0; padding:0;}
	body{height:100%;}

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
	#basketimg{position:absolute; right:100px; bottom:5px; width:50px; height:50px;}

	/* product */
	#product {width:1100px; margin:auto; text-align:center;}
	#product table{display:inline-block;}
	#product table th {background-color:#5F0080; width:1000px; height:35px; font-size:20px; color:white;}
	#product table td {background-color:#F5F5F5;}
	
	#product table td:nth-child(1){width:10%;}
	#product table td:nth-child(2){width:30%;}
	#product table td:nth-child(3){width:20%;}
	#product table td:nth-child(4){width:10%;}
	#product table td:nth-child(5){width:20%;}
	#product table td:nth-child(6){width:10%;}
	
	button{width:200px; height:50px; color:white; background-color:#5F0080; border-radius:5px;}
	
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
		
	<%
	ArrayList list = (ArrayList)session.getAttribute("productlist");
	%>
		
	<div id="product">
		<table>
			<tr>
				<th colspan='6'>장바구니</th>
			</tr>
			<tr>
				<td>전체선택</td>
				<td>사진</td>
				<td>이름</td>
				<td>수량</td>
				<td>금액</td>
				<td>삭제</td>
			</tr>
			<%
			if ( list == null ) {
				out.println("<tr><td colspan='6'>리스트가 비었습니다. </td></tr>");
			} else {
				for( Object productname:list ) out.println("<tr><td>" + productname + "</td></tr>"); 
			}
			%>
		</table>
		<div>
			총 결제액: <input type="text">	
		</div>
		
		<button type="submit" url="order.jsp">주문하기</button>
		
		
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