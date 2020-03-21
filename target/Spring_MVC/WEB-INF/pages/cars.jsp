<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: FOX
  Date: 21.03.2020
  Time: 7:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${handler}</title>
</head>
<body>
    <h1>List of Cars</h1>
    <table>
        <tr>
            <th>Model</th>
            <th>Series</th>
            <th>Cost</th>
        </tr>
        <c:forEach var="car" items="${list}">
            <tr>
                <td>${car.model}</td>
                <td>${car.series}</td>
                <td>${car.cost}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
