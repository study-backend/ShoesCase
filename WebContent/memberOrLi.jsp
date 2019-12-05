<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ksw
  Date: 04/12/2019
  Time: 2:19 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        li {list-style: none; padding: 16px;}

        a:link {text-decoration: none; color: #333333;}
        a:visited {text-decoration: none; color: #333333;}
        a:active {text-decoration: none; color: #333333;}
        a:hover {text-decoration: none; color: gray;}

    </style>

</head>
<body style="margin: 0px;">
<div style="height: 180px; width: 100%; background-color: #0c5460; text-align: center;">
    Header 자리
</div>

<div class="boardForm1" style="box-sizing: border-box; margin-left: 300px; margin-right: 300px; margin-top: 150px">

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
    <div style="float: left; margin-left: 30px;">
        <h3 style="padding-bottom: 18px">주문 내역</h3>

        <c:choose>
        <c:when test="${empty list}">
        <div style="width: 740px; padding-top: 40px; padding-bottom : 40px; border-top: 2px solid purple; border-bottom: 1px solid lightgray; text-align: center">
            주문내역이 없습니다.
        </div>
        </c:when>
        <c:otherwise>
        <div style="width: 740px; padding-top: 40px; padding-bottom : 40px; border-top: 2px solid purple; border-bottom: 1px solid lightgray;">
            <table>

                <c:forEach var="purchaseItem" items="${list}">
                    <tr>
                        <td rowspan="2"><c:out value="${purchaseItem.img}"/></td>
                        <td colspan="2"><c:out value="${purchaseItem.name}"/></td>
                        <td rowspan="2"><c:out value="${purchaseItem.state}"/></td>
                    </tr>
                    <tr>
                        <td colspan="2">${purchaseItem.price}</td>
                    </tr>
                </c:forEach>

        </c:otherwise>
        </c:choose>
            </table>
        </div>
    </div>

</div>
</body>
</html>