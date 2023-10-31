<%--
  Created by IntelliJ IDEA.
  User: askrz
  Date: 2023-10-25
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Authors</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<%@include file="../dynamic/navigation.jspf" %>
<div style="margin-top: 30px; margin-left: 30px">
    <h4>Authors</h4>

    <!--Add new-->
    <a href='<c:url value="/addAuthor"/>'
       class="btn btn-outline-primary" role="button">Add new </a>
    <!--Add new END-->

    <!--Table-->
    <table class="table table-striped">
        <thead>

        <tr>
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
        </tr>
        </thead>
        <tbody>
        <!--loop For Each-->
        <c:forEach items="${authorModel}" var="author">
        <tr>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
        </tr>
        </c:forEach>

        <!--loop END-->
        </tbody>
    </table>
    <!--Table END-->
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
