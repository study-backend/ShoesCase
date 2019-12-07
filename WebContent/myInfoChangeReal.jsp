<%--
  Created by IntelliJ IDEA.
  User: ksw
  Date: 06/12/2019
  Time: 8:06 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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
                document.getElementById("loginState").innerHTML="<li>"+inFoObj.name+"님 ㅣ</li><li><a href=\"../myInfoChange.html\">  내 정보 ㅣ</a></li>"+
                    "<li><button type='button' style='background-color:white; border-style:none; font-size:16px;'>로그아웃</button></li>"

            }

        }

        $(document).ready(function () {
            var idInfo = sessionStorage.getItem("user");
            var infoObj = JSON.parse(idInfo);

            document.getElementById("myId").innerText= infoObj.loginId;

        })


        $(document).ready(function(){
            $('#section div').hide();
            $('#section div').first().show();
            $('#section div').css('width',1000);
            $('#section div').css('height',320);
            setInterval(function(){
                $('#section').append($('#section div').first());
                $('#section div').last().hide();
                $('#section div').first().show();
            }, 3000);
        })
        $(function(){
            $("#check").click(function() {

                let str = $("#myInfoForm").serializeObject();
                console.log(str);

                $.ajax({
                    type : "post",
                    url : "/ShoesCase/api/v1",
                    dataType : "json",
                    data : {
                        data : JSON.stringify(str),
                        resource : "Account",
                        route : "checkPassword"
                    },
                    success : function(result) {
                        console.log(result.message);

                        if (result.statusCode === "Success") {
                            location.href = 'inMyInfoChange.jsp?msg=' + result.message;
                        } else {
                            alert("입력이 잘못되었습니다");
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

        $(document).ready(function(){
            let user = sessionStorage.getItem("user");
            if(user === null || user === undefined) {

                //location.href='/ShoesCase/account/login.html';
            } else {

                // id나 특정 정보를 검증해야하는데..... ㅠㅠ 일단 패스
                let json = JSON.parse(user);
                // 아래 데이터를 맵핑 지여나나나
                console.log(json.loginId);

                location.href='/ShoesCase/account/inMyInfoChange.jsp';
            }


        });


    </script>

    <style>
        li {list-style: none; padding: 16px;}
        *{color:#000; text-decoration:none; font-family: 'Noto Sans KR', sans-serif;}
        a:link {text-decoration: none; color: #333333;}
        a:visited {text-decoration: none; color: #333333;}
        a:active {text-decoration: none; color: #333333;}
        a:hover {text-decoration: none; color: gray;}

        #check{color:#FFFFFF; background-color:#5F0080; width:354px; height:56px; margin-top:10px; border-radius:5px; outline:0;}

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

        /* footer */
        .footer{clear: both; margin-left: 400px; margin-top: 10px}
        #footerTable{border: none; }
        #footerTable td{border: none; }
        .f{padding:8px; font-size: 12px;margin-left: 250px; margin-top:-10px;}
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
            <li class="mL"><a href="front?resource=product&categoryName=sneakers"><span style="margin-left: 25px; margin-right: 16px;">운동화</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
            <li class="mL"><a href="front?resource=product&categoryName=dressShoes"><span style="margin-left: 25px; margin-right: 16px;">구두</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
            <li class="mL"><a href="front?resource=product&categoryName=sandal"><span style="margin-left: 16px; margin-right: 25px;">샌들</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|</li>
            <li class="mL"><a href="front?resource=product&categoryName=boots"><span style="margin-left:11px">부츠</span></a>&nbsp;&nbsp;&nbsp;&nbsp;</li>
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

    <div class="main">
        <div class="boardForm1" style="box-sizing: border-box; margin:110px 300px 70px 300px;">

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

            <div style="float:left; margin-left: 160px;">
                <h3 style="padding-bottom: 18px">개인 정보 수정</h3>
                <div style="border-top: 2px solid purple">
                    <div style="text-align: center">
                        <h3>비밀번호 재확인</h3>
                        <h5>회원님의 정보를 안전하게 보호하기 위해 비밀번호를 다시 한 번 확인해주세요.</h5>
                    </div>
                    <form method="post" id="myInfoForm">
                        <div style="border: 2px solid darkgray; text-align: center">
                            <br><br>
                            아이디<br><br>
                            <span id="myId"></span><br><br>
                            비밀번호<br><br>

                            <input type="password" name="password">
                            <br><br>
                        </div>
                        <div style="text-align: center">
                            <br>
                            <button type="submit" class="m_button" id="check"><span>확인</span></button>
                        </div>
                    </form>
                </div>
            </div>

        </div>
    </div>

    <script>
    $(function(){
     	$("#check").click(function() {

    		let str = $("#myInfoForm").serializeObject();
    		console.log(str);

    		
    		$.ajax({
    			type : "post",
    			url : "/ShoesCase/api/v1",
    			dataType : "json",
    			data : {
    				data : JSON.stringify(str),
    				resource : "Account",
    				route : "checkPassword"
    			},
    			success : function(result) {
    				console.log(data);
    				console.log(result.message);

    				if (result.statusCode === "Success") {
    					location.href = 'inMyInfoChangeReal.jsp?msg=' + result.message;
    				} else {
    					//alert("입력이 잘못되었습니다");
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