<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
    <title>JSP Todos Page</title>
</head>
<body>
<div class="container">
<table class="table"><thread><tr>
    <th>Description</th>
    <th>Target Date</th>
    <th>is Done?</th>
    <th>Delete</th>
    <th>Update</th>
</tr></thread>
<tbody><c:forEach items="${todos}" var="todo">
    <tr>
        <td>${todo.description}</td>
        <td>${todo.targetDate}</td>
        <td>${todo.done}</td>
        <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a> </td>
        <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a> </td>
    </tr>
</c:forEach></tbody>
</table><a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">
    $('#targetDate').datepicker({
    format: 'yyyy-mm-dd'
    });
</script>
</body>
</html>