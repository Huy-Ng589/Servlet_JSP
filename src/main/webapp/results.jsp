<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: huynqy
  Date: 17/06/2020
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bear Documentation JSP</title>
</head>
<body>
    <h1 align="center">Bear Recommendation</h1>
    <p>
    <%
        ArrayList style = (ArrayList) request.getAttribute("style");
        Iterator it = style.iterator();
        while (it.hasNext())
            out.println("</br> try: " + it.next());
    %>
</body>
</html>
