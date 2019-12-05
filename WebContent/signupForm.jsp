<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500|Pacifico&display=swap&subset=korean" rel="stylesheet">
<title>Insert title here</title>

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
	.headers{background-color:white;}
	#header{width:1254px; height:180px; /* border:1px solid red; */ margin:auto;}
	#usermenu{width:1050px; height:37px; margin-left:162px; margin-right:40px;}
	#headerlogo{width:1050px; height:63px; margin-left:102px; margin-right:102px; position: relative;}
	#logo {display: block; width:200px; height:80px; margin-left:440px; margin-right:500px; margin-bottom: 20px }
	#header ul {float:right;}
	#header ul>li {margin-top: 15px; margin-left:10px;}
	#gnb{width:1254px; height:56px; /* border:1px solid blue; */ }
	#gnbin{position:relative; width:1150px; height:56px; /* border:1px solid blue; */ margin:0 auto; }
	.gnb_ul{width:1150px; height:56px; float:left; height:55px; }
	.gnb_li {float:left; width:190; height:55;}
	.gnb_li a{width:190; height:55; padding: 16px 50px 0 48px; font-size:18px;}

	.gnb_ul:hover .sub{display: block;}
	.gnb_ul .sub{position:absolute;  height:50px; top:50px; left:40px; display:none; color: black;}
	.gnb_ul .sub li{width:60px;}
	
	#side_search{position: absolute; right:135px; top:110px; width:240px; height:40px; /* border:1px solid green */; border-radius:18px; background-color:#F7F7F7;}
	#searchimg{position:absolute; right:10px; top:5px; width:40px; height:30px;}
	#basketimg{position:absolute; right:75px; top:106px; width:50px; height:50px;}
	
	/* body */
	button{width:354px; height:56px; margin-top:20px; background-color:purple; border-radius:5px; outline:0;}
	.no-margin{
		margin: 0;
	}
	#centerWindow { position:absolute; width:100px; height:100px; top:50%; left:50%; margin-top:-50px; margin-left:-50px; }

	table, th, td {border: 1px solid black; width:"100%";}
	
</style>
</head>
<body>
<!-- <body style="margin: 0px; background-color: whitesmoke"> -->
<div class="headers">
	<div id="header">
		<div id="usermenu">
			<ul id="headerul">
				<li><a href="signupForm.jsp">회원가입</a>   || <a href="login.html">로그인</a></li>
				<li> </li>
			</ul>
		</div>
		<div id="headerlogo">
			<img id="logo" src="image/LOGO.png" alt="로고">
		</div>	
		<div id="gnb">
			<div id="gnbin">
			<ul class="gnb_ul">
				<li class="gnb_li"><a href="#"><span>전체카테고리</span></a>  |</li>
				<ul class="sub">
					<li><a href="#">운동화</a></li>
					<li><a href="#">구두</a></li>
					<li><a href="#">샌들</a></li>
					<li><a href="#">부츠</a></li>
    			</ul>
				<li class="gnb_li"><a href="#"><span>운동화</span></a>  |</li>
				<li class="gnb_li"><a href="#"><span>구두</span></a>  |</li>
				<li class="gnb_li"><a href="#"><span>샌들</span></a>  |</li>
				<li class="gnb_li"><a href="#"><span>부츠</span></a>  |</li>
			</ul>
			</div>
			<img src="image/basket.png" id="basketimg">
			<div id="side_search">
				<img src="image/search.png" id="searchimg">
			</div>
			
		</div>
	</div>
</div>
	<body style="margin: 0px; background-color: whitesmoke">
	<div class="signUpTitle" style="margin-top: 100px; margin-bottom: 10px">
    <h2 style="text-align: center; margin: 0px;">회원가입</h2>

    <div class="boardWrite" style="margin-top: 30px">
    <form method="post" action="<%= application.getContextPath() %>/front?key=userRegist">
        <table class="inForm" style="width: 63%; margin: auto;">
            <tbody>
            <tr>
                <td class="memberCols1" width="140">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp아이디*</td>
                <td class="memberCols2">
                    <div style="height: 40px">
                        <input type="text" name="id" option="regId" placeholder="6자 이상의 영문 혹은 영문과 숫자를 조합">
                        <span><input type="button" value="중복확인" style="width: 90px;"></span>
                    </div>
                </td>
            </tr>

            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp비밀번호*</td>
                <td class="memberCols2">
                    <input type="password" name="pwd" option="regPass" placeholder="비밀번호를 입력해주세요">
                </td>
            </tr>

            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<!-- &nbsp&nbsp -->비밀번호확인*</td>
                <td class="memberCols2">
                    <input type="password" name="pwdOk" option="regPass" placeholder="비밀번호를 한번 더 입력해주세요">
                </td>
            </tr>

            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp이름*</td>
                <td class="memberCols2">
                    <input type="text" name="name" placeholder="고객님의 이름을 입력해주세요">
                </td>
            </tr>

            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp이메일*</td>
                <td class="memberCols2">
                    <input type="text" name="email" size="30" option="regEmail" placeholder="예: marketkurly@kurly.com">
                    <span><input type="button" value="이메일 중복확인"></span>
                </td>

            </tr>
            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp휴대폰*</td>

                <td class="memberCols2">
                    <div class="phone_num">
                        <input type="text" pattern="[0-9]*" name="mobileNum" placeholder="숫자만 입력해주세요" maxlength="11">
                    </div>
                </td>
            </tr>
            
            
            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp배송 주소</td>
                <td class="memberCols2">
                    <div style="margin-top: 11px; margin-left: 36px;">
                        <input type="text" value="주소 검색" style="margin-bottom: 5px;" name="address_sub">
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
                            <input type="radio" name="maleFemale" label="성별" value="m" style="margin-left: 36px;">
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
    
    <input type="submit" value="가입하기">
    </form>
    </div>
</div>

</body>
</html>