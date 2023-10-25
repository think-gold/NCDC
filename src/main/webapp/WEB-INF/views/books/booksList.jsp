<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Books</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<%@include file="../dynamic/navigation.jspf" %>
<div style="margin-top: 30px; margin-left: 30px">
<h4>Books</h4>
    <!--Add new-->
    <a href='<c:url value="/addBook"/>'
       class="btn btn-outline-primary" role="button">Add new</a>
    <!--Add new END-->

    <!--Table-->
    <table class="table table-striped">
        <thead>
        <tr>

            <th scope="col">Author</th>
            <th scope="col">Title</th>
            <th scope="col">ISBN</th>
        </tr>
        </thead>
        <tbody>

        <!--Komórki - pętla for each-->
        <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Thornton</td>
        </tr>

        </tr>
        <!--koniec pętli-->
        </tbody>
    </table>
    <!--Table END-->
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>