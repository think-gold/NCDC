<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
<%@include file="dynamic/navigation.jspf" %>
<div style="margin-top: 30px; margin-left: 30px">
<h4>Home</h4>


    <p style="margin-top: 15px; font-size: large">Instruction:</p>
    <p style="margin-top: 15px; font-size: medium">
        <ol>
    <li>Open tab "Authors</li>
    <li>Add new Author</li>
    <li>Open tab "Books"</li>
    <li>To add new book you need to select author from the list</li>
</ol>
    <p style="margin-top: 15px; font-size: large">H2 database configuration:</p>
    <p style="margin-top: 15px; font-size: medium">
    <ul>
    <li>Driver Class: org.h2.Driver</li>
        <li>JDBC URL: jdbc:h2:mem:testdb</li>
        <li>User Name: sa</li>
        <li>Password: password</li>
</ul>
    </p>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>