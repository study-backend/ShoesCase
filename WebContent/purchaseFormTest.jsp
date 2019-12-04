<%--
  Created by IntelliJ IDEA.
  User: ksw
  Date: 04/12/2019
  Time: 5:03 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {width: 740px;}
        td {border: solid red 1px}

    </style>
</head>
<body>
<table>
<tr>
    <td rowspan="2">${purchaseItem.img}</td>
    <td colspan="2">${purchaseItem.name}</td>
    <td rowspan="2">${purchaseItem.state}</td>
</tr>
<tr>
    <td colspan="2">${purchaseItem.price}</td>
</tr>
</table>

</body>
</html>
