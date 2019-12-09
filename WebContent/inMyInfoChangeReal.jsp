<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500|Pacifico&display=swap&subset=korean" rel="stylesheet">
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <script type="text/javascript">

        window.onload = function () {
            var inFo = sessionStorage.getItem("user");
            var inFoObj = JSON.parse(inFo);

            if(inFoObj==null){
                document.getElementById("loginState").innerHTML="<li><a href=\"signupForm.jsp\">회원가입</a> ㅣ</li><li><a href=\"loginReal.jsp\"> 로그인</a></li>"
            }else {
                document.getElementById("loginState").innerHTML="<li>"+inFoObj.name+"님 ㅣ</li><li><a href=\"/ShoesCase/myInfoChangeReal.jsp\">  내 정보 ㅣ</a></li>"+
                    "<li><button type='button' style='background-color:white; border-style:none; font-size:16px;'>로그아웃</button></li>"

            }

        }

         $(document).ready(function () {
            var idInfo = sessionStorage.getItem("user");
            var infoObj = JSON.parse(idInfo);
			if(infoObj !== null ) {
				let aaa = document.getElementById("myId");
	            document.getElementById("myId").value = infoObj.loginId;
			}
	
			
			var idInfo = sessionStorage.getItem("user");
			if(user === null || user === undefined) {
				consolelog("aaaa");
				location.href='/ShoesCase/account/login.html';
			} else {
				
				// id나 특정 정보를 검증해야하는데..... ㅠㅠ 일단 패스 
				var infoObj = JSON.parse(idInfo);
				
				$("#id").val(infoObj.loginId);
				$("#name").val(infoObj.name);
				$("#email").val(infoObj.email);
				$("#sex").val(infoObj.sex);
				$("#userTel").val(infoObj.tel);
				$("#delivery_addr").val(infoObj.addr);
				// user = "{"loginId":"1234","name":"1234","phone":"01923344","email":"hankkuu","addr":"a","sex":"\u0000","birthday":"1월 12, 3920"}"
				
				alert("다뿌렸는데 다른거 받아서 update 해야해요!!!!");
				
			}

        })

      
        $(function(){
         	$("#check").click(function() {

        		let str = $("#updateForm").serializeObject();
        		console.log(str);

        		$.ajax({
        			type : "post",
        			url : "/ShoesCase/api/v1",
        			dataType : "json",
        			data : {
        				data : JSON.stringify(str),
        				resource : "Account",
        				route : "setAccount"
        			},
        			success : function(result) {
        				console.log(result.message);

        				if (result.statusCode === "Success") {
        					location.href = 'out_main,html?msg=' + result.message;
        				} else {
                            alert("업데이트가 되지 않았습니다.");
                            console.log(data);
            				console.log(result.message);
        				}

        			},
        			error : function(error) {
        				console.log(error);
        				alert("오류 발생");
        			}
        		});//ajax끝

        	}) 
        });
    </script>
    <title>Title</title>
     <style>
        li {list-style: none;}
        /*공통*/
		#header, #container {position: relative;}
		*{font-family: 'Noto Sans KR', sans-serif;}
		a{color:#000; text-decoration:none;}
		a:hover{color:#000; font-weight:bold;}
		ul li{list-style: none;}
		h1,h2,h3,h4,h5,p,ul,li{
	    margin: 0px;
	    padding: 0px;
		}
	
	 /* header */
        #header {
            width: 1200px;
            height: 100px;
            padding-bottom: 40px;
            margin: auto;
        }

        #header #headerlogo {
            display: inline-block;
            margin: auto;
            margin-left: 450px;
        }

        #header ul {
            float: right;
        }

        #header ul li {
            margin-left: 10px;
            float: left;
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
	.m_button{width:354px; height:56px; margin-top:20px; background-color:purple; border-radius:5px; outline:0;}
	.no-margin{
		margin: 0;
	}
	#centerWindow { position:absolute; width:100px; height:100px; top:50%; left:50%; margin-top:-50px; margin-left:-50px; }


	table, th, td {border: 1px solid black; border-collapse:collapse; }
	th{text-align: center}
	.memberCols1{width:200px; height:50px}
	.memberCols2{width:400px; height:50px;}
	#check{color:#FFFFFF; background-color:#5F0080;}
	.m_button span{width:354px; height:56px; margin-top:20px;font-size:16px; }
	.inForm input{border:none; text-align:left;}

	.tel_text{width:70px; height:50px;}
	/* footer */
    .footer{clear: both; margin-left: 400px; margin-top: 10px}
    #footerTable{border: none; }
    #footerTable td{border: none; }
    .f{padding:8px; font-size: 12px;margin-left: 250px;}
    .s{padding:8px; font-size: 12px;margin-left: 50px;}
    .footerHr{border: 0; height: 1px}
    
    </style>
 
</head>
<body style="margin: 0px;">

<div class="contrainer">
<div id="header">
        <ul id="loginState">
            <!-- <li><a href="signupForm.jsp">회원가입</a></li>
            <li><a href="login.html">로그인</a></li> -->
        </ul>
        <div id="headerlogo">
            <a href="out_main.html"><img src="ima	ge/LOGO.png" id="logo"></a>
        </div>
    </div>
    <div id="nav">
        <ul class="main">
            <li class="mL"><a href="#"><span style="margin-right: 30px">카테고리</span></a>&nbsp;&nbsp;&nbsp;&nbsp;|
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
            <li class="mL"><a href="front?resource=product&categoryName=sneakers"><span style="margin-left: 25px; margin-right: 16px;">운동화</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
            <li class="mL"><a href="front?resource=product&categoryName=dressShoes"><span style="margin-left: 25px; margin-right: 16px;">구두</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
            <li class="mL"><a href="front?resource=product&categoryName=sandal"><span style="margin-left: 16px; margin-right: 25px;">샌들</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
            <li class="mL"><a href="front?resource=product&categoryName=boots"><span style="margin-left:11px">부츠</span></a>&nbsp;&nbsp;&nbsp;&nbsp;</li>
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

<div class="main">
    <div class="boardForm1" style="box-sizing: border-box; margin:110px 300px 70px 300px;">

        <div class="boardName" style="float: left; display: block; width: 23%; margin:50px 300px 70px 300px;">
            <h2>마이슈즈</h2>
            <div class="boardMenu" style="margin-top:20px;">
                <ul class="list_menu" style="padding: 10px">
                    <li style="border: solid 1px gray; width:200px; height:60px; text-align: center; padding-top:20px">
                        <a href="memberOrLi.jsp">주문 내역</a>
                    </li>
                    <li style="border: solid 1px gray; border-top: none; width:200px; height:60px; text-align: center; padding-top:20px">
                        <a href="myInfoChangeReal.jsp">개인 정보 수정</a>
                    </li>
                </ul>
            </div>
        </div>

        <div class="boardForm2" style="float:left; margin-left:-345px;">
    	<h2 style="text-align: center; margin: 0px;">개인정보수정</h2>

	 <form method="post" action="/" name="updateForm">
   	 <div class="boardWrite" style="margin-top: 30px">
        <table class="inForm" style="margin: auto;">
            <tbody>
            <tr>
                <th class="memberCols1" width="140">아이디*</th>
                <td class="memberCols2">
                    <div style="height: 40px">
                        <input type="text" name="id" value="아이디받아서 적기" >                     
                    </div>
                </td>
            </tr>
			
            <tr>
                <th class="memberCols1">새 비밀번호*</th>
                <td class="memberCols2">
                    <input type="password" name="pwd" option="regPass" placeholder="비밀번호를 입력해주세요">
                </td>
            </tr>

            <tr>
                <th class="memberCols1">새 비밀번호확인*</th>
                <td class="memberCols2">
                    <input type="password" name="pwdOk" option="regPass" placeholder="비밀번호를 한번 더 입력해주세요">
                </td>
            </tr>

            <tr>
                <th class="memberCols1">이름*</th>
                <td class="memberCols2">
                    <input type="text" name="name" value="이름받아적기">
                    
                </td>
            </tr>

            <tr>
                <th class="memberCols1">이메일*</th>
                <td class="memberCols2">
                    <input type="text" name="email" size="30" option="regEmail" placeholder="예: marketkurly@kurly.com">
                    <span><input type="button" value="이메일 중복확인"></span>
                </td>

            </tr>
            <tr>
                <th class="telarea">휴대폰*</th>
					<td>
						<input type="text" max-length="10" class="tel_text" id="userTel" name="userTel">
					</td>
            </tr>
            
            
            <tr style="height:90px;">
                <th class="memberCols1">배송 주소</th>
                <td class="memberCols2">
                    <div style="margin-top: 11px; margin-left: 36px;">
                        <input type="text" placeholder="주소 검색" style="margin-bottom: 5px;" name="address_sub">
                    </div>
                    <div>
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp배송가능여부를 확인할 수 있습니다.
                    </div>
                </td>
            </tr>
            <tr class="selectMaleFemale">
                <th class="memberCols1">성별</th>
                <td class="memberCols2">
                    <div class="sexbox">
                       <input type="text" style="margin-bottom: 5px;" name="userSex">
                    </div>
                </td>
            </tr>

            <tr class="birth field_birth">
                <th class="memberCols1">생년월일</th>
                <td class="memberCols2">
                    <div class="birth_day">
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
    
     <input type="button" class="m_button" id="check" href.location="out_main.html"><span>확인</span></button>
    </div>
    </form>
     
</div>
      

    </div>
</div>

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
</div>
</body>
</html>