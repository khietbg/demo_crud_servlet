<%--
  Created by IntelliJ IDEA.
  User: minhkhiet
  Date: 04/05/2023
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Student Detail</h1>
<lable>ID</lable>
<br>
<input type="text" name="id" readonly value="${studentD.getId()}"><br>
<lable>NAME</lable>
<br>
<input type="text" name="name" readonly value="${studentD.getName()}"><br>
<lable>AGE</lable>
<br>
<input type="text" name="age" readonly value="${studentD.getAge()}"><br>
<lable>ADDRESS</lable>
<br>
<input type="text" name="address" readonly value="${studentD.getAddress()}"><br>
<lable>PHONE</lable>
<br>
<input type="text" name="phone" readonly value="${studentD.getPhone()}">
<br>
<a href="/ServletStudent?action=SHOW">Back</a>
</body>
</html>
