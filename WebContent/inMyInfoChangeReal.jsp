<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500|Pacifico&display=swap&subset=korean" rel="stylesheet">

    <title>Title</title>
     <style>
        li {list-style: none; padding: 16px;}
        a{color:#000; text-decoration:none; font-family: 'Noto Sans KR', sans-serif;}
        a:link {text-decoration: none; color: #333333;}
        a:visited {text-decoration: none; color: #333333;}
        a:active {text-decoration: none; color: #333333;}
        a:hover {text-decoration: none; color: gray;}
        .main{background-color: aqua}
        #check{color:#FFFFFF; background-color:#5F0080; width:354px; height:56px; margin-top:10px; border-radius:5px; outline:0;}
	
	/* body */
	button{width:354px; height:56px; margin-top:20px; background-color:purple; border-radius:5px; outline:0;}
	.no-margin{
		margin: 0;
	}
	#centerWindow { position:absolute; width:100px; height:100px; top:50%; left:50%; margin-top:-50px; margin-left:-50px; }


	table, th, td {border: 1px solid black; border-collapse:collapse; }
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
<div style="height: 180px; width: 100%; background-color: #0c5460; text-align: center;">
    Header 자리
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

        <div class="boardForm2" style="float:left; margin-left:45px;">
    	<h2 style="text-align: center; margin: 0px;">개인정보수정</h2>

   		 <div class="boardWrite" style="margin-top: 30px">
   		 <form method="post" action="/">
        <table class="inForm" style="margin: auto;">
            <tbody>
            <tr>
                <td class="memberCols1" width="140">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp아이디*</td>
                <td class="memberCols2">
                    <div style="height: 40px">
                        <input type="text" name="id" value="아이디받아서 적기" >                     
                    </div>
                </td>
            </tr>
			
			<tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp현재 비밀번호*</td>
                <td class="memberCols2">
                    <input type="password" name="pwd" option="regPass" placeholder="비밀번호를 입력해주세요">
                </td>
            </tr>
			
            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp새 비밀번호*</td>
                <td class="memberCols2">
                    <input type="password" name="pwd" option="regPass" placeholder="비밀번호를 입력해주세요">
                </td>
            </tr>

            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp새 비밀번호확인*</td>
                <td class="memberCols2">
                    <input type="password" name="pwdOk" option="regPass" placeholder="비밀번호를 한번 더 입력해주세요">
                </td>
            </tr>

            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp이름*</td>
                <td class="memberCols2">
                    <input type="text" name="name" value="이름받아적기">
                    
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
                <th class="telarea">휴대폰*</th>
					<td><input type="text" max-length="3" class="tel_text" >
						<span> - </span>
						<input type="text" max-length="4" class="tel_text"> 
						<span> - </span>
						<input type="text" max-length="4" class="tel_text"></td>
            </tr>
            
            
            <tr>
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp배송 주소</td>
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
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp성별</td>
                <td class="memberCols2">
                    <div class="group_radio">
                        <label class="label_radio">
                            <input type="radio" name="maleFemale" label="성별" value="m" style="margin-left: 36px;">
                            <span class="text_position">받아서적기</span>
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
    
     <button type="submit" class="m_button" id="check" href.location="inMyInfoChange.jsp"><span>확인</span></button>
    </form>
    </div>
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