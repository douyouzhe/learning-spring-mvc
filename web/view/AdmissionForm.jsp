<%--
  Created by IntelliJ IDEA.
  User: YOUZHE
  Date: 11/26/2017
  Time: 5:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admission page</title>
</head>
<body>

    <form action="/submitAdmissionForm.html" method="post">
        <p>
            Student Name: <input type="text" name="studentName"/>
        </p>
        <p>
            Student Hobby: <input type="text" name="studentHobby"/>
        </p>
        <input type="submit" value="submit"/>
    </form>
</body>
</html>
