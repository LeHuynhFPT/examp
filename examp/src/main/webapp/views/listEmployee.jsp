<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Employees</title>
</head>
<body>
<h2>List of Employees</h2>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Wage</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employeeList}">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.wage}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
