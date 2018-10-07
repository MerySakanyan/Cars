<%--
  Created by IntelliJ IDEA.
  User: Mery
  Date: 9/28/2018
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=request.getAttribute("user").toString()%>
<%=request.getAttribute("car").toString()%>


</body>
</html>
