<%--
  Created by IntelliJ IDEA.
  User: minhkhiet
  Date: 01/05/2023
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center">Student Manager</h1>
<table border="1" style="width: 100%">
    <thead>
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
        <th>Phone</th>
        <th colspan="3">action</th>
    </tr>
    </thead>
    <tbody>

<c:forEach items="${list}" var="st">
    <tr>
        <td>${list.indexOf(st) +1}</td>
        <td>${st.getId()}</td>
        <td>${st.getName()}</td>
        <td>${st.getAge()}</td>
        <td>${st.getAddress()}</td>
        <td>${st.getPhone()}</td>
        <td><a href="ServletStudent?action=DELETE&id=${st.getId()}">Delete</a></td>
        <td><a href="ServletStudent?action=EDIT&id=${st.getId()}">Edit</a></td>
        <td><a href="ServletStudent?action=WATCH&id=${st.getId()}">Detail</a></td>
    </tr>
</c:forEach>

    </tbody>1

</table>
<br>
<a href="view/newStudent.jsp">Create Student</a>
</body>
</html>
