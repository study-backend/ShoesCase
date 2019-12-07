<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="./js/jquery-3.4.1.min.js"></script>
<script>
$(document).ready(function(){
	var popupX = (document.body.offsetWidth / 2) - (360 / 2);
	var popupY= (document.body.offsetHeight / 2) - (200 / 2);

	$("#basket").click(function(){
		window.open('popup.html', '', 'status=no, height=200, width=360, left='+ popupX + ', top='+ popupY);
	}); 
});
</script>

<style type="text/css">
	
	/*공통*/
	a{color:white; text-decoration:none;}
	a:hover{color:white; font-weight:bold;}
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
	#basketimg{position:absolute; right:150px;  width:50px; height:50px;}

	/* detail */
	#detail{width:1100px; margin:auto; }
	#detail #detail_img{width:430px; height:500px; display:flex; overflow:hidden; align-items:center; justify-content:center;}
	#detail #detail_infor{width:450px; height:500px; display:inline-block; float:right;}
	#detail #main_title{font-size:24px; font-style:bold; margin:20px;}
	#detail #sub_title {margin-top:-15px; margin-left:20px;}
	#detail #member_price{margin-top:20px; margin-left:20px;}
	#detail #price {margin-left:20px;}
	#detail #price .price{font-size: 25px;}
	#detail #price .dc{font-size: 20px; color:red;} 
	#detail #discount{margin-left:50px; text-decoration:line-through; color:gray;}
	#detail #not_login {margin-top:20px; margin-left:20px;}
	
	#a span {margin-top:30px; margin-left:20px; margin-bottom:30px;}
	#detail #not_login {margin-top:20px; margin-left:20px;}
	#detail_infor table{margin-top:30px; margin-left:20px; margin-bottom:30px;}
	#detail_infor table td:nth-child(1){width:100px;}
	#detail_infor table td:nth-child(2){width:60px;}
	#detail_infor table td:nth-child(3){width:200px;}
	#detail input{width:50px;}
	#detail #total_price{width:420px; height:80px; float:right;}
	
	#detail #total_price .tpsT{font-size:32px; font-style:bold;}
	
	#detail #long_img{margin:auto; width:1000px; height:100%; display:flex; overflow:hidden; align-items:center; justify-content:center;}
	
	#product_rv {width:1000px; margin:auto; text-align:center;}
	#product_rv table{display:inline-block;}
	#product_rv table th {background-color:#CBA3E9; width:700px; height:35px; font-size:20px; color:white;}
	#product_rv table td {background-color:#F5F5F5;}
	
	#product_rv table td:nth-child(1){width:6%;}
	#product_rv table td:nth-child(2){width:30%;}
	#product_rv table td:nth-child(3){width:12%;}
	#product_rv table td:nth-child(4){width:20%;}
	#product_rv table td:nth-child(5){width:12%;}
	#product_rv table td:nth-child(6){width:20%;}
	
	button{width:200px; height:50px; color:white; background-color:#CBA3E9; border-radius:5px;}
</style>
<script type="text/javascript">

//삭제 ajax
$(document).ready(function(){
 $(document).on("click","#contentShow" , function(){
 //   alert(1);
    
 //   #review_t > tbody > tr:nth-child(4)
 //   #review_t > tbody > tr:nth-child(6)
 //   #review_t > tbody > tr:nth-child(8)
 
   $(this).parent().parent().parent().parent().next().show();
    
 });
 
 $(document).on("click", "#contentHide", function(){
    
    $(this).parent().parent().parent().hide();
    
 })
});



$(document).on("click","[value='삭제']",function(){
   var reviewId = $(this).attr("name");
   var reviewPwd = $()
  // alert (idValue);
    $.ajax({
    type: "post",
//    url: "/front?resource=reviewDelete",
    url: "../ShoesCase/front?resource=reviewDelete",
    dataType: "text",
    data : {reviewId : reviewId},
    success : function(result){
       //확인
       if(result>0) {
       //   alert("삭제성공")
          alert("result?");      
       }else{
          alert("삭제실패")
          }
       
    },
    error : function(err){
       console.log(err + "=> 오류 발생");
    }
    
      
   }); //ajax 끝
   
}); 
</script>
</head>

<body>
	<div id="detail">
		<div id="detail_infor">
			<table>
				<div id="main_title">
					<strong>${requestScope.goods.name}</strong>
				</div>
				<div id="sub_title">
					<span>최고의 신발</span>
				</div>
				<div id="member_price">
					<span>회원할인가</span>
				</div>
				<div id="price">
					<span class="price">${requestScope.goods.price}</span>
					<span class="won">원</span>
					<sapn class="dc">15%</sapn>
				</div>
				<div id="discount">
					<span>3000원</span>
				</div>
				<div id="not_login">
				<span>로그인 후, 회원할인가와 적립혜택이 제공됩니다.</span>
			</div>
			<hr>
				<tr>
					<td>색상</td><td></td>
					<td>
						<select id ="selec">
						<option value="black">${requestScope.goods.colorCode}</option>
						<option value="white" selected="selected"> white</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>사이즈</td><td></td>
					<td>
						<select id ="selec">
							<option value="250" selected="selected">${requestScope.goods.sizeCode}</option>
							<option value="255">255</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>구매수량</td><td></td>
		
					<td>
						<input type="number" id="number">
					</td>
				</tr>
			</table>
			<hr>
			<div id="total_price">
					<span class="tpsO">총 상품금액</span><span class="tpsT">${requestScope.goods.totalPrice}</span><span class="tpsTh">원</span>
					<button id="basket" type="button">장바구니 담기</button>
			</div>
		</div>
		<div id="detail_img">
			<img src="image/sneakers/${requestScope.goods.imgPath}">
		</div>
		<div id="long_img"> 
			<img src="image/sneakers/${requestScope.goods.sumnailPath}">
		</div>
	</div>
	
	 <div id="product_rv">
      <table id="review_t">
         <tr>
            <th colspan='6'>상품후기</th>
         </tr>
         <tr>
            <td>글번호</td>
            <td>제목</td>
            <td>구매자</td>
            <td>만족도</td>
            <td>작성일</td>
            <td>삭제</td>
            
               
               
    <c:choose>
    <c:when test="${empty requestScope.reviewList}">
      <tr>
        <td colspan="6">
            <p align="center"><b><span>등록된 상품이 없습니다.</span></b></p>
        </td>
    </tr>
    </c:when>
    <c:otherwise>
   <c:forEach items="${requestScope.reviewList}" var="reviewDTO">
          <tr>
              <td>
                  <p><span>
                  index 번호줘야함</span></p> 
              </td>
              <td >
               <p><span>
            
                <a herf="#" id="contentShow"> ${reviewDTO.title} </a>
            
               </span></p>
              </td>
              <td >
               <p><span>
               
               작성자id :  ${reviewDTO.accountId}
               
               </span></p>
              </td>
              
              <td >
               <p><span>
                
                만족도 (0~5) : ${reviewDTO.score}
                 
               </span></p>
              </td>
   
              
             <td >
               <p><span>
               
                 ${reviewDTO.createDate}
            
               </span></p>
              </td>
              <td>
                 <input type = 'button' value='삭제' name= ${reviewDTO.reviewId}  >
              </td>
          </tr>
          <tr style ="display:none;">
          <td colspan="1" ><div >내용</div></td> 
          <td colspan="4" ><div >${reviewDTO.content } </div>  </td>
          <td colspan="1"><div><input type="button" value="감추기" id="contentHide"></div> </td>
          </tr>
    </c:forEach>
   </c:otherwise>
    </c:choose>
         </tr>
      </table>
      
      <a href="detailReviewInsert.jsp"><button type="button">후기쓰기</button></a>
   </div>
</body>
</html>