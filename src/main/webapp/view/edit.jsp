<%--
  Created by IntelliJ IDEA.
  User: minhkhiet
  Date: 04/05/2023
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>UPDATE STUDENT</h1>
<form action="<%=request.getContextPath()%>/ServletStudent" method="post">
  <h2>Create student</h2>
  <lable>ID</lable>
  <br>
  <input type="text" name="id" readonly value="${studentEdit.getId()}"><br>
  <lable>NAME</lable>
  <br>
  <input type="text" name="name" value="${studentEdit.getName()}"><br>
  <lable>AGE</lable>
  <br>
  <input type="text" name="age" value="${studentEdit.getAge()}"><br>
  <lable>ADDRESS</lable>
  <br>
  <input type="text" name="address" value="${studentEdit.getAddress()}"><br>
  <lable>PHONE</lable>
  <br>
  <input type="text" name="phone" value="${studentEdit.getPhone()}">
  <input type="submit" name="action" value="UPDATE">
</form>
</body>
</html>
