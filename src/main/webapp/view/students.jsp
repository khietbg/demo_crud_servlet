<%--
  Created by IntelliJ IDEA.
  User: minhkhiet
  Date: 01/05/2023
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Student Manager</h1>
<table border="1">
    <thead>
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
        <th>Phone</th>
    </tr>
    </thead>
    <tbody>
<c:forEach items="${list}" var="st" varStatus="status">
    <tr>
        <td>${status.count}</td>
        <td>${st.id}</td>
        <td>${st.name}</td>
        <td>${st.age}</td>
        <td>${st.address}</td>
        <td>${st.phone}</td>
    </tr>
</c:forEach>

    </tbody>
</table>

</body>
</html>
