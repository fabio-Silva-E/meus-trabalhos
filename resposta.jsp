<%-- 
    Document   : resposta
    Created on : 15/04/2023, 20:12:53
    Author     : fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultdo</title>
    </head>
    <body>
        <%
            int resultado= Integer.parseInt(request.getParameter("resultado"));
            if(resultado==1){
            out.println("<cente><h2>operação realizada com sucesso<h2><center>");
            }
            else{
            out.println("<cente><h2>erro ao tentar gravar<h2><center>");
            }
            
            %>
    </body>
</html>
