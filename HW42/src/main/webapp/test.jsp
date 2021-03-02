  <%@page pageEncoding="UTF-8"%>
<html>
<head>
</head>
   <body>

       <form action="${pageContext.request.contextPath}/User" method="post">
          <p>Login
          <input type="text" name="login">
          </p>
          <p>Password
          <input type="password" name="user_password">
          </p>
          <p>Email
          <input type="text" name="email">
          </p>
          <p>IsMale
          <input type="checkbox" name="gender">
          </p>
          <p>
          <input type="submit" name"submit">
          </p>
       </form>
  </body>