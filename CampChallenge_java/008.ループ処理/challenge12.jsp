<%-- 
    Document   : challenge12
    Created on : 2018/06/05, 22:57:00
    Author     : ak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String word ="A";
        for(int i=0; i<30; i++){
             word += "A";
        } 
        out.print(word);
        %>
    </body>
</html>
