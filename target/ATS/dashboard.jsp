<%@ page import="com.ats.model.User" %>
<%
    User user = (User) session.getAttribute("user");

    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<h2>Welcome, <%= user.getName() %>!</h2>

<p>You are now logged in.</p>

<a href="logout">Logout</a>

</body>
</html>
