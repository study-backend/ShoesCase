<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ksw
  Date: 06/12/2019
  Time: 1:59 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500|Pacifico&display=swap&subset=korean"
          rel="stylesheet">
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <script>
        window.onload = function () {
            var inFo = sessionStorage.getItem("user");
            var inFoObj = JSON.parse(inFo);

            if (inFoObj == null) {
                document.getElementById("loginState").innerHTML = "<li><a href=\"signupForm.jsp\">회원가입</a> ㅣ</li><li><a href=\"loginReal.jsp\"> 로그인</a></li>"
            }  else {
                document.getElementById("loginState").innerHTML = "<li>" + inFoObj.name + "님 ㅣ</li><li><a href=\"inMyInfoChange.jsp\"> 내 정보</a></li></li>"+
                "<li><button type='button' id='logoutb' style='background-color:white; border-style:none; font-size:16px;'>로그아웃</button></li>"

            } 


        }

        function goSearch() {
            document.searchBox.submit();
        }


        $(function(){
            $("#blogin").click(function(){

                let str = $("#loginForm").serializeObject();
                console.log(str);

                $.ajax({
                    type : "post" ,
                    url : "/ShoesCase/api/v1",
                    dataType : "json",
                    data : { data: JSON.stringify(str),
                        resource: "Account",
                        route: "login"
                    },
                    //contentType: 'application/json; charset=utf-8',
                    success : function(result) {
                        console.log(result.statusCode);
                        if(result.statusCode === "Success") {
                            alert("로그인 성공");
                            alert("세션 스토리지 및 세션 정보 : " + result.message)
                            sessionStorage.setItem("user", result.message);
                            location.href='/ShoesCase/out_main.html'
                        } else {
                            alert("아이디 또는 비밀번호를 확인해주세요.");
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
    <style type="text/css">
        /*공통*/
        #header, #container {
            position: relative;
        }

        a {
            color: #000;
            text-decoration: none;
            font-family: 'Noto Sans KR', sans-serif;
        }

        a:hover {
            color: #000;
            font-weight: bold;
        }

        ul li {
            list-style: none;
        }

        h1, h2, h3, h4, h5, p, ul, li {
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

        /* main */

        #main {
            width: 355px;
            height: 600px;
            margin: auto; /* border:1px solid blue; */
        }

        #login {
            height: 100.5px;
            margin-top: 90px;
            font-size: 30px
        }

        #main h3 {
            text-align: center;
        }

        #main .log {
            width: 350px;
            height: 50px;
            border: 0;
            outline: 0;
            border-radius: 5px;
            border: 1px solid gray;
        }

        #search {
            float: right;
        }

        .m_button {
            width: 354px;
            height: 56px;
            margin-top: 20px;
            border-radius: 5px;
            outline: 0;
        }

        #blogin {
            color: #FFFFFF;
            background-color: #5F0080;
        }

        #bsignup {
            color: #5F0080;
            background-color: #FFFFFF;
        }

        .m_button span {
            width: 354px;
            height: 56px;
            margin-top: 20px;
            font-size: 16px;
        }

        /* footer */
        
        #footer{
        	margin-left:600px;
        }
        
        #footerTable {
            border: none;
        }

        #footerTable td {
            border: none;
        }

        .f {
            padding: 8px;
            font-size: 12px;
            margin-left: 200px;
        }

        .s {
            padding: 8px;
            font-size: 12px;
            margin-left: 50px;
        }

        .footerHr {
            border: 0;
            height: 1px
        }

        /*	input#submitIcon {
                background:url(image/search.png);
                background-repeat: no-repeat;
                width:35px;
                height:35px;
                border: 0;
            }*/


    </style>

</head>
<body>
<div id="header">
    <ul id="loginState">
        <%--<li><a href="signupForm.jsp">회원가입</a></li>
        <li><a href="login.html">로그인</a></li>  --%>
    </ul>
    <div id="headerlogo">
        <a href="out_main.html"><img src="image/LOGO.png" id="logo"></a>
    </div>
</div>
<div id="nav">
    <ul class="main">
        <li class="mL" style="margin-left: 48px;"><a href="#"><span style="margin-right: 30px">카테고리</span></a>&nbsp;&nbsp;&nbsp;&nbsp;|
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
        <li class="mL"><a href="product?categoryName=sneakers"><span
                style="margin-left: 25px; margin-right: 16px;">운동화</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|
        </li>
        <li class="mL"><a href="product?categoryName=gudu"><span
                style="margin-left: 25px; margin-right: 16px;">구두</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|
        </li>
        <li class="mL"><a href="product?categoryName=sandal"><span
                style="margin-left: 16px; margin-right: 25px;">샌들</span></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|
        </li>
        <li class="mL"><a href="product?categoryName=boots"><span style="margin-left:11px">부츠</span></a>&nbsp;&nbsp;&nbsp;&nbsp;
        </li>
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

<div id="main">
    <form method="post" id="loginForm">
        <div id="login"><h3>로그인</h3></div>
        <input type="text" name="loginId" class="log" placeholder="아이디를 입력해주세요."><br><br>
        <input type="password" name="loginPwd" class="log" placeholder="비밀번호를 입력해주세요."><br>
        <input type="checkbox"><span>보안접속</span>
        <div id="search">
            <a href="id.html">아이디 찾기</a> | <a href="pwd.html">비밀번호 찾기</a>
        </div>
        <button type="button" class="m_button" id="blogin"><span>로그인</span></button></p>
        <a href="signupForm.jsp">
            <button type="button" class="m_button" id="bsignup"><span>회원가입</span></button>
        </a>
    </form>
</div>

<div id="footer">
    <table id="footerTable">
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
                    <h2 class="tit_type1 fs16"><strong>통합고객센터</strong></h2>
                    <a href="javascript://" class="tel_number">080-701-7770</a>
                    <a href="javascript://" class="tel_number">· 1588-9667</a>
                    <p class="mt15">운영시간 : 월~금 09:00 ~18:00 (12:00 ~13:00 점심시간)<br><em style="margin-left:55px;">주말, 공휴일
                        휴무</em><br>
                        이메일 : <a href="mailto:abcmartcs@abcmartkorea.com">shoesCase@scmartkorea.com</a></p>
                    <div class="clearfix">
                        <div style="margin-left: 15px;"><img
                                src="http://image.abcmart.co.kr/nexti/images/abcmart_new/confirm_01.gif" alt=""></div>
                        <div><img src="http://image.abcmart.co.kr/nexti/images/abcmart_new/confirm_02.gif" alt=""></div>
                    </div>
                </div>
            </td>
        </tr>
    </table>
</div>

</body>
</html>
