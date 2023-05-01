<%-- 
    Document   : resposta
    Created on : 29/04/2023, 18:40:07
    Author     : fabio
--%>
<%@page import="Connection.Conexao"%>
<%@page import="VO.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.Empresa"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css.css"> 
        <title>formulario</title>
    </head>
    <body>
        <h1>Lista de produtos</h1>
           
        <table>
            
                <tr>
                    <th>id</th>
                    <th>Nome</th>
                    <th>Preço</th>
                </tr>
                <%
                     
                    try{
                    Empresa p = new Empresa();
                  ArrayList<Produto> lista = p.buscar();
                  
                  
                  for(int num = 0; num < lista.size();num ++){
                  out.println("<tr>");
                    out.println("<th>"+lista.get(num).getId()+"</th>");
                    out.println("<th>"+lista.get(num).getNome()+"</th>");
                    out.println("<th>"+lista.get(num).getValor()+"</th>");
                    out.println("</tr>");
                    }
                   
                    }catch(Exception e){
                    
                    } 
                  
                %>
             
        
        </table>
             
    </body>
    
</html>
