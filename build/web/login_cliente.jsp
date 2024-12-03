<%-- 
    Document   : login_cliente
    Created on : 2/12/2024, 9:38:39 p. m.
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de Sesion para Clientes</title>
        <link rel="stylesheet" href="style.css" />
    </head>
    <body class="">
        <header class="cabecera_principal">
            <%@include file="banner_principal.jsp" %> 
            <%@include file="barra_navegacion.jsp" %>
            
        </header>
        <form action="LoginCliente" method="post" class="center formulario">
            <label for="email">Correo</label>
            <input type="email" name="correo" class="campo_form" required>

            <label for="contrasena">Contraseña</label>
            <input type="password" name="clave" class="campo_form" required>

            
            <button type="submit" class="button">Iniciar Sesion</button>
        </form>
            <p style="margin: 0 auto">¿No tienes una cuenta de Cliente? <a href="registro_clientes.jsp" class="enlace">Registrate</a></p>
            <p style="margin: 0 auto">¿Tienes una cuenta corporativa?? <a href="login.jsp" class="enlace">Ingresa Aqui</a></p>
    </body>
</html>
