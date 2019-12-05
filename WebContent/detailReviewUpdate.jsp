<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name=updateForm method=post action="elec" onSubmit="return checkValid()">
    <input type="hidden" name="command" value="update" >
    <input type='hidden' name='modelNum' value="${elec.modelNum}">
   <table align="center" cellpadding="5" cellspacing="1" width="600" border="1">
    <tr>
        <td width="1220" height="20" colspan="2" bgcolor="#00cc00">
            <p align="center"><font color="white" size="3"><b>  게시물 수정하기</b></font></p>
        </td>
    </tr>
    <tr>
        <td width="150" height="20">
            <p align="right"><b><span style="font-size:9pt;">모델이름</span></b></p>
        </td>
        <td width="450" height="20"><b><span style="font-size:9pt;">
      <input type=text name="model_name" size="30"
       value="${elec.modelName}"></span></b></td>
    </tr>
    <tr>
        <td width="150" height="20">
            <p align="right"><b><span style="font-size:9pt;">가격</span></b></p>
        </td>
        <td width="450" height="20" ><b><span style="font-size:9pt;">
      <input type=text name="price" size="30"
       value="${elec.price}"></span></b></td>
    </tr>
    
    <tr>
        <td width="150" height="20" >
            <p align="right"><b><span style="font-size:9pt;">내 용</span></b></p>
        </td>
        <td width="450" height="20" ><b><span style="font-size:9pt;">
      <textarea name="description" cols="50" rows="10">${elec.description}</textarea></span></b></td>
    </tr>
    <tr>
        <td width="150" height="20" >
            <p align="right"><b><span style="font-size:9pt;">비밀번호</span></b></p>
        </td>
        <td width="450" height="20"><b><span style="font-size:9pt;"><input type=password name="password" size="12"> 
            (비밀번호가 맞아야 수정이 가능합니다.)</span></b></td>
    </tr>
    <tr>
        <td width="450" height="20" colspan="2" align="center"><b><span style="font-size:9pt;">
      <input type="submit" value="수정하기"> <input type="reset" value="다시쓰기"></span></b></td>
    </tr>
</table>
</form>
<hr>
<div align=right><span style="font-size:9pt;">&lt;<a href="${path}/elec">리스트로 돌아가기</a>&gt;</span></div>


</body>
</html>