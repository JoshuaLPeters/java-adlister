<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    if(request.getMethod().equalsIgnoreCase("post")){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("admin") && password.equals("password")){
            response.sendRedirect("/profile.jsp");
        }
    }

%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ include file="partials/head.jsp" %>
    <title>Login Page</title>
</head>
<body>

<%@ include file="partials/navbar.jsp" %>

<h1>Please login</h1>

<form method="post" action="/login.jsp" >
    Username: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
    <input type="submit" />
</form>

<%@ include file="partials/footer.jsp"%>
<%@ include file="partials/scripts.jsp" %>

</body>
</html>