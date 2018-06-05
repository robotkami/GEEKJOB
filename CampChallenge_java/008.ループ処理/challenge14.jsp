<%-- 
    Document   : challenge14
    Created on : 2018/06/05, 23:20:59
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
            int num = 1000;
            while(num>100 ){
                num = num/2;
            }
                out.print(num);
        %>
    </body>
</html>
