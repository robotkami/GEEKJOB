<%-- 
    Document   : challenge11
    Created on : 2018/06/05, 22:39:06
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
             long total =8;
             for(int i=1; i<20; i++){
                 total *=8;
                 
             }
             out.print(total);
                
        %>
    </body>
</html>
