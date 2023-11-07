<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Employee</title>
</head>
<body>
<h2>Create Employee</h2>
<form action="/employees" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br>

    <label for="wage">Salary:</label>
    <input type="number" id="wage" name="wage" required><br>

    <button type="submit">Create Employee</button>
</form>
</body>
</html>
