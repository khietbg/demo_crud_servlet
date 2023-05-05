<%--
  Created by IntelliJ IDEA.
  User: minhkhiet
  Date: 04/05/2023
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/ServletStudent" method="post">
<h2>Create student</h2>
<lable>ID</lable>
<br>
<input type="text" name="id"><br>
<lable>NAME</lable>
<br>
<input type="text" name="name"><br>
<lable>AGE</lable>
<br>
<input type="text" name="age"><br>
<lable>ADDRESS</lable>
<br>
<input type="text" name="address"><br>
<lable>PHONE</lable>
<br>
<input type="text" name="phone">
    <input type="submit" name="action" value="CREATE">
</form>
</body>
</html>
