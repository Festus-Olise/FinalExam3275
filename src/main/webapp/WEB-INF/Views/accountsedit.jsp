<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12/11/2021
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="https:/>/maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body>

<div class="container">
    <h1>
        Edit entry
    </h1>
    <form method="POST">
        <fieldset class="form-group">
            <label> Customer Number: </label>
            <input name="id" type="text" class="form-control" required />
            <label> Customer Name :</label>
            <input name="name" type="text" class="form-control" required />
            <label> Customer Initial Deposit :</label>
            <input name="dep" type="number" class="form-control" required />
            <label> Number of Years :</label>
            <input name="years" type="text" class="form-control" required />
            <label> Savings Type :</label>
            <input name="savtype" type="text" class="form-control" required />
            <select id="savtype" name="savtype">
                <option value="Savings-Deluxe">Savings-Deluxe</option>
                <option value="Savings-Regular">Savings-Regular</option>
            </select>
        </fieldset>
        <input class="btn btn-success" type="submit" value="Edit" />
    </form>

</div>


</body>

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</html>
