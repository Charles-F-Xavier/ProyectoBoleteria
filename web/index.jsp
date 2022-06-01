<%-- 
    Document   : index
    Created on : 31-05-2022, 02:30:24
    Author     : jr972
--%>

<%@page import="model.T_User"%>
<%@page import="service.DaoT_User"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Optional"%>
<%@page import="java.util.List"%>

<%@page import="db.ConexionSingleton"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>
    <body>
        <%
            ConexionSingleton oConexionSingleton = ConexionSingleton.getIntance();

            if (oConexionSingleton.getCon() != null) {
                out.print("Conectado");
            } else {
                out.print("nonono");
            };

            DaoT_User oDaoT_User = new DaoT_User(oConexionSingleton);

            List<T_User> all = oDaoT_User.getAll();
            
            T_User oT_User1=oDaoT_User.get(1);
            
            out.print("<br>"+oT_User1+"<br>");

            //out.print("<br>" + all);
            if (!all.isEmpty()) {
                out.print(all);
            }

            for (T_User oT_User : all) {
                out.print(oT_User.getId());
            }

        %>
        <div class="navbar-fixed">
            <nav>
                <div class="nav-wrapper">
                    <a href="#" class="brand-logo">Logo</a>
                    <ul id="nav-mobile" class="right hide-on-med-and-down">
                        <li><a href="#">Sass</a></li>
                        <li><a href="#">Components</a></li>
                        <li><a href="Log.do">Login</a></li>
                    </ul>
                </div>
            </nav>
        </div>

    </body>
</html>
