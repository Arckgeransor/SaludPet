<%-- 
    Document   : login.jsp
    Created on : 1/12/2024, 9:27:28 p. m.
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de Sesión Corporativo</title>
        <link rel="stylesheet" href="style.css" />
    </head>
    
    <body class="">
        <header class="cabecera_principal">
            <%@include file="banner_principal.jsp" %> 
            <%@include file="barra_navegacion.jsp" %>
            
        </header>
        <form action="Login" method="post" class="center formulario">
            <label for="email">Correo</label>
            <input type="email" name="correo" class="campo_form" required>

            <label for="contrasena">Contraseña</label>
            <input type="password" name="clave" class="campo_form" required>

            <label for="rol_persona">Rol a Iniciar Sesion</label>
            <select name="rol_persona" class="campo_form" required>
                <option value="">Selecciona una opcion . . .</option>
                <option value="1">Administrador</option>
                <option value="2">Veterinario</option>
            </select>
            
            <button type="submit" class="button">Iniciar Sesion</button>
        </form>
            <p style="margin: 0 auto">¿No tienes una cuenta Corporativa? <a href="registro_corporativo.jsp" class="enlace">Registrate</a></p>
            <p style="margin: 0 auto">¿Tienes una cuenta de Cliente?? <a href="login_cliente.jsp" class="enlace">Ingresa Aqui</a></p>
    </body>
</html>
