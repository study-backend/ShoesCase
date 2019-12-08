<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500|Pacifico&display=swap&subset=korean" rel="stylesheet">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>

<style type="text/css">
	 
/*공통*/
	#header, #container {position: relative;}
	*{color:#000; text-decoration:none; font-family: 'Noto Sans KR', sans-serif;}
/* 	a:hover{color:#000; font-weight:bold;} */
	ul li{list-style: none;}
	h1,h2,h3,h4,h5,p,ul,li{
    margin: 0px;
    padding: 0px;
	}	
	/* container */
	#container{width:1254px; height:1189; margin:auto;}
	
	/* header */
		.headers{
			background-color: white;
		}
		
        #header {
            width: 1200px;
            height: 100px;
			padding-bottom: 40px;
            margin: auto;
        }

        #header #headerlogo {
            display: inline-block;
            margin: auto;
        }

        #header ul {
            float: right;
        }

        #header ul li {
            margin-left: 10px;
            float: left;
        }

        #header #headerlogo {
            margin: auto;
            margin-left: 500px;
            margin-top: 25px;
        }

        /* nav */
        #nav {
            width: 1200px;
            height: 50px;
            margin: auto;
            position: sticky;
            top: 0px;
			background-color: white;
        }

        #nav ul .mL {
            width: 150px;
            height: 50px;
            float: left;
            font-size: 20px;
			margin: 0px;
        }

        #nav .main > li:hover .sub {
            display: block;
        }

        #nav .main .sub {
            position: absolute;
            height: 50px;
            top: 50px;
            left: 40px;
            display: none;
        }

        #nav .main .sub li {
            width: 80px;
            margin-top: 5px;
        }

        #side_search {
            position: absolute;
            right: 220px;
            width: 240px;
            height: 40px;
            border-radius: 18px;
            background-color: #F7F7F7;
        }

        #searchimg {
            position: absolute;
            right: 10px;
            top: 5px;
            width: 40px;
            height: 30px;
        }

        #basketimg {
            position: absolute;
            right: 150px;
            width: 50px;
			bottom: 5px;
            height: 50px;
        }

	/* body */
	#btn{width:354px; height:56px; margin-top:20px; color:#FFFFFF; background-color:#5F0080; border-radius:5px; outline:0;}
	.no-margin{
		margin: 0;
	}
	#centerWindow { position:absolute; width:100px; height:100px; top:50%; left:50%; margin-top:-50px; margin-left:-50px; }


	table, th, td {border: 1px solid #FFFFFF; width:"100%"; background-color:#FFFFFF; border-collapse:collapse;}
	.col2_input{margin-left:20px;}
/* footer */
	.footer{background-color:#FFFFFF; }
    #footerTable{border: none; margin-left:400px;}
    #footerTable td{border: none; }
    .f{padding:8px; font-size: 12px;margin-left: 200px;}
    .s{padding:8px; font-size: 12px;margin-left: 50px;}
    .footerHr{border: 0; height: 1px}
    
</style>

<script type="text/javascript">

$().ready(function() {
	
	$("#btn").click(function() {
		state = true;
		  
		  // 모두 값이 있다면 등록한다
		 /*  if(state) {
			  
			let str = $("#signForm").serializeObject();
			  console.log(str)
			  $.ajax({
				  type: "post" ,
				  url: "/ShoesCase/api/v1"  ,
				  dataType: "json"   ,  // 서버에게 받은 응답결과 type(json, text, xml)
				  data: { data: JSON.stringify(str),
					 	  resource: "Account",
						  route: "account" 
				  		} ,		// 서버에게 전송할 param
				  	success: function(result) {
					  	console.log(result)
					  if(result.statusCode === 'Success') {
						  alert("등록되었습니다 로그인을 진행하세요");
						 
						  location.href='loginReal.jsp?msg=' + result.message;
					  } else {
						  alert("등록되지 않았습니다");
					  }
				  },
				  error: function(err) {
					  console.log(err + "- 오류 발생")
				  }      
			  }); //ajax 끝
		  } */
			  
		  });
	$("#idcheck").click(function(){  
		  $.ajax({
			  type:"post",
		//	  url:"idCheck",
			  url:"/ShoesCase/front?resource=idCheck",
		      dataType: "text",
		      data : {id: $("#signForm > div.boardWrite > table > tbody > tr:nth-child(1) > td.memberCols2 > div > input").val() } ,//서버에게 전송할 parameter
		      success: function(result){
		    	  alert(1);
		    	  alert(result);
		    	  
		    	  
		      } ,
		      error : function(err){
		    	  console.log(err+"=> 오류발생");
		      }
		  });//ajax끝
	  });//click끝
	});

</script>
<script type="text/javascript">
function jusoPopup(){
	var pop = window.open("jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
}

function jusoCallBack(roadFullAddr,roadAddrPart1,addrDetail,roadAddrPart2,engAddr, jibunAddr, zipNo, admCd, rnMgtSn, bdMgtSn,detBdNmList,bdNm,bdKdcd,siNm,sggNm,emdNm,liNm,rn,udrtYn,buldMnnm,buldSlno,mtYn,lnbrMnnm,lnbrSlno,emdNo){
		// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.	
	
		//var addr = roadFullAddr;
		//$("#jusovalue").val() = addr;
		document.form.juso.value = roadFullAddr;
}
</script>

</head>
<body>
<div class="headers">
	<div id="header">
    <ul>
        <li><a href="signupForm.jsp">회원가입</a></li>
        <li><a href="login.html">로그인</a></li>
    </ul>
    <div id="headerlogo">
        <a href="mainTest_1.jsp">
            <img id="logo" src="image/LOGO.png" url="dressShoes.html" alt="로고">
        </a>
    </div>
</div>
<div id="nav">
    <ul class="main">
        <li class="mL" style="margin-left: 48px;"><a href="#"><span style="margin-right: 30px">카테고리</span></a>&nbsp;&nbsp;&nbsp;&nbsp;|
            <ul class="sub">
                <li  class="sub_li"><a href="sneakers.html">운동화</a></li>
                <li  class="sub_li"><a href="#">구두</a></li>
                <li  class="sub_li"><a href="#">샌들</a></li>
                <li  class="sub_li"><a href="#">부츠</a></li>
                <li  class="sub_li"><a href="#">나이키</a></li>
                <li  class="sub_li"><a href="#">아디다스</a></li>
                <li  class="sub_li"><a href="#">퓨마</a></li>
                <li  class="sub_li"><a href="#">반스</a></li>
            </ul>
        </li>
        <li class="mL"><a href="product?categoryName=sneakers"><span style="margin-left: 25px; margin-right: 16px;">운동화</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
        <li class="mL"><a href="product?categoryName=gudu"><span style="margin-left: 25px; margin-right: 16px;">구두</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
        <li class="mL"><a href="product?categoryName=sandal"><span style="margin-left: 16px; margin-right: 25px;">샌들</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
        <li class="mL"><a href="product?categoryName=boots"><span style="margin-left:11px">부츠</span></a>&nbsp;&nbsp;&nbsp;&nbsp;</li>
    </ul>
    <img src="image/basket.png" id="basketimg">
    <div id="side_search">
        <form name="searchBox" method="get" action="#" id="searching">
            <input type="text"
                   style="width:185px; height:36px; border-radius:18px; background-color:#F7F7F7; border: none;">
            <input type="image" src="image/search.png" style="float: right; width: 45px; border-radius: 18px"
                   onclick="goSearch()">
        </form>
    </div>
</div>

</div>
	<body style="margin: 0px; background-color: whitesmoke">
	<div class="signUpTitle" style="margin-top: 100px; margin-bottom: 10px">
    <h2 style="text-align: center; margin: 0px; margin-right:10px;">회원가입</h2>

	<form method="post" id="signForm" action="front?resource=userRegist" name="form">
    <div class="boardWrite" style="margin-top: 30px">
        <table class="inForm" style="width: 700px; height:800px; margin: auto;">
            <tbody>
            <tr>
                <td class="memberCols1" width="140">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp아이디*</td>
                <td class="memberCols2">
                    <div style="height: 40px">
                        <input type="text" class="col2_input" name="id" option="regId" placeholder="6자 이상의 영문 혹은 영문과 숫자를 조합">
                        <span><input type="button" value="중복확인" id="idcheck" style="width: 90px;"></span>
                    </div>
                </td>
            </tr>

            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp비밀번호*</td>
                <td class="memberCols2">
                    <input type="password" class="col2_input" name="pwd" option="regPass" placeholder="비밀번호를 입력해주세요">
                </td>
            </tr>

            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<!-- &nbsp&nbsp -->비밀번호확인*</td>
                <td class="memberCols2">
                    <input type="password" class="col2_input" name="pwdOk" option="regPass" placeholder="비밀번호를 한번 더 입력해주세요">
                </td>
            </tr>

            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp이름*</td>
                <td class="memberCols2">
                    <input type="text" class="col2_input" name="name" placeholder="고객님의 이름을 입력해주세요">
                </td>
            </tr>

            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp이메일*</td>
                <td class="memberCols2">
                    <input type="text" class="col2_input" name="email" size="30" option="regEmail" placeholder="예: marketkurly@kurly.com">
                    <span><input type="button" value="이메일 중복확인"></span>
                </td>

            </tr>
            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp휴대폰*</td>

                <td class="memberCols2">
                    <div class="phone_num">
                        <input type="text" pattern="[0-9]*" class="col2_input" name="mobileNum" placeholder="숫자만 입력해주세요" maxlength="11">
                    </div>
                </td>
            </tr>
            
            
            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp배송 주소</td>
                <td class="memberCols2">
                    <div style="margin-top: 11px; margin-left: 20px;">
                        <input type="text" placeholder="주소 검색" style="margin-bottom: 5px; width:450px; " name="juso"><br>
						<button type="button" onclick="jusoPopup()">주소검색</button>
                    </div>
                    <div>
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp배송가능여부를 확인할 수 있습니다.
                    </div>
                </td>
            </tr>
            <tr class="selectMaleFemale">
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp성별</td>
                <td class="memberCols2">
                    <div class="group_radio">
                        <label class="label_radio">
                            <input type="radio" class="col2_input" name="maleFemale" label="성별" value="m" style="margin-left: 36px;">
                            <span class="text_position">남자</span>
                        </label>
                        <label class="label_radio">
                            <input type="radio" name="maleFemale" label="성별" value="w">
                            <span class="text_position">여자</span>
                        </label>
                    </div>
                </td>
            </tr>

            <tr class="birth field_birth">
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp생년월일</td>
                <td class="memberCols2">
                    <div class="birth_day" style="margin-left:-10px;">
                        <input type="text" name="birthYear" pattern="[0-9]*" value="" label="생년월일" size="5"
                               maxlength="4" placeholder="YYYY" style="margin-top: 14px; margin-left: 36px;">
                        <span class="bar"><span>/</span></span>
                        <input type="text" name="birthMonth" id="birthMonth" pattern="[0-9]*" label="생년월일" size="3"
                               maxlength="2" placeholder="MM">
                        <span class="bar"><span>/</span></span>
                        <input type="text" name="birthDay" id="birthDay" pattern="[0-9]*" label="생년월일" size="3"
                               maxlength="2" placeholder="DD">
                    </div>
                    <p class="txt_guide">
                        <span class="txt bad"></span>
                    </p>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <div style="text-align: center;">
    
    	<input type="submit" value="가입하기" id="btn">
    </div>
    </form>
	</div>


<br><br><br>
<hr class="footerHr" color="gray"  >
<div class="footer"> 
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
</body>
</html>