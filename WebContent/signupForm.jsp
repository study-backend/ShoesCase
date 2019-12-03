<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
	button{width:354px; height:56px; margin-top:20px; background-color:purple; border-radius:5px; outline:0;}
	.no-margin{
		margin: 0;
	}
	#centerWindow { position:absolute; width:100px; height:100px; top:50%; left:50%; margin-top:-50px; margin-left:-50px; }

table, th, td {border: 1px solid black; width:"100%" }
</style>
</head>
<body>


<body style="margin: 0px; background-color: whitesmoke">
<div style="height: 180px; width: 100%; background-color: #0c5460; text-align: center;"> Header 자리</div>

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
                <td class="memberCols1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp비밀번호확인*</td>
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