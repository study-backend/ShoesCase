<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">

	/*공통*/
	a{color:white; text-decoration:none;}
	a:hover{color:white; font-weight:bold;}
	ul li{list-style: none; margin:0; padding:0;}
	body{height:100%;}


	#review {width:1100px; margin:auto; }
	#review table {display:inline-block;}
	#review table th {background-color:#CBA3E9; text-align:center; width:1100px; height:35px; font-size:20px; color:white;}
	#review table td {background-color:#F5F5F5; padding:10px;}
	#review table tr td:nth-child(1) {width:200px; text-align:center;}
	#review table tr td input {width:300px; height:20px;}
	#review table tr td	select {width:300px; height:20px;}
	#review table tr td textarea {width:600px; height:400px; resize:none;} 

	button{width:200px; height:50px; color:white; background-color:#CBA3E9; border-radius:5px;}
</style>
</head>
<body>

	<div id="review">
	    <table>
	    	<tr>
	    		<th colspan='2'>리뷰 수정하기</td>
	    	</tr>
	    	<tr>
	    		<td>제목</td>
	    		<td><input type="text"></td>
	    	</tr>
	    	<tr>
	    		<td>만족도</td>
	    		<td>
					<select>
						<option>5</option>
						<option>4</option>
						<option>3</option>
						<option>2</option>
						<option>1</option>						
					</select>
				</td>
	    	</tr>
	    	<tr>
	    		<td>내용</td>
	    		<td><textarea></textarea></td>
	    	</tr>
	    	<tr>
	    		<td colspan='2'>
	    			<a href ="detailPage.html"><button type="button">수정하기</button></a>
	    			<a href ="detailPage.html"><button type="button">취소하기</button></a>
	    		</td>
	    	</tr>
	    </table>
	</div>

</body>
</html>