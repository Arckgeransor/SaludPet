<%-- 
    Document   : registro_clientes
    Created on : 2/12/2024, 12:50:07 p. m.
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Clientes</title>
        <link rel="stylesheet" href="style.css" />
    </head>
    <body class="">
        <header class="cabecera_principal">
            <%@include file="banner_principal.jsp" %> 
            <%@include file="barra_navegacion.jsp" %>
            
        </header>
        <form action="RegisterCliente" method="post" class="center formulario">
            <label for="nombres_cliente">Nombres del Cliente</label>
            <input type="text" name="nombres_cliente" class="campo_form" required>
            
            <label for="apellidos_cliente">Apellidos del Cliente</label>
            <input type="text" name="apellidos_cliente" class="campo_form" required>
            
            <label for="documento_cliente">Documento de Identidad</label>
            <input type="number" name="documento_cliente" class="campo_form" required>

            
            <label for="correo">Correo</label>
            <input type="email" name="correo" class="campo_form" required>
            
            
            <label for="contrasena">Contraseña</label>
            <input type="password" name="contrasena" class="campo_form" required>
            
            <label for="telefono_cliente">Telefono de Cliente</label>
            <input type="number" name="telefono_cliente" class="campo_form" required>

            <label for="direccion_cliente">Direccion del Cliente</label>
            <input type="text" name="direccion_cliente" class="campo_form" required>
            
            <label for="apellidos_cliente">Fecha de Nacimiento del Cliente</label>
            <input type="date" name="fecha_nacimiento" class="campo_form" required>

            
            <button type="submit" class="button">Guardar Datos</button>
        </form>
        <p style="margin: 0 auto; margin-bottom: 20px;">¿Ya tienes una cuenta de Cliente? <a href="login.jsp" class="enlace">Inicia Sesión</a></p>
    </body>
</html>
