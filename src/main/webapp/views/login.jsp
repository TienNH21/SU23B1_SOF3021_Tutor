<%@ page pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Tutor SOF3021</title>
</head>
<body>
<h2>${ message }</h2>
<form method="POST" action="/login">
    <div>
        <label>Username</label>
        <input type="text" name="username" />
    </div>
    <div>
        <label>Password</label>
        <input type="password" name="password" />
    </div>
    <button>Login</button>
</form>

</body>
</html>
