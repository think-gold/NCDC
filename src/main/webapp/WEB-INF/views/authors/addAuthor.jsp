<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Author</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
<%@include file="../dynamic/navigation.jspf" %>

<div style="margin-top: 30px; margin-left: 30px">
    <h4>Add Author</h4>
    <!--Form-->
    <form method="post" style="margin-top: 15px" action='<c:url value="/addAuthor"/>'>
        <div class="col-6">
            <label class="form-label">First Name:</label>
            <input type="text" class="form-control" name="firstName" placeholder="First Name"/>
        </div>

        <div class="col-6" style="margin-top: 5px">
            <label class="form-label">Last Name:</label>
            <input type="text" class="form-control" name="lastName" placeholder="Last Name"/>
        </div>

        <div class="col-12" style="margin-top: 15px">
            <input class="btn btn-primary" type="submit" value="Submit"></input>
        </div>
    </form>
<!--Form END-->

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>

</body>
</html>