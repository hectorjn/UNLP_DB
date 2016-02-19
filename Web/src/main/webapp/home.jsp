<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resources/images/css/style.css/style.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <% response.sendRedirect("pages/public/login.jsf");%>
    </body>
</html>

<h:outputStylesheet library="css" name="theme.css"  />