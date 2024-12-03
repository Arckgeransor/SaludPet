<%-- 
    Document   : registro_corporativo
    Created on : 2/12/2024, 10:31:31 p. m.
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Corporativo</title>
    </head>
    <body class="">
        <header class="cabecera_principal">
            <%@include file="banner_principal.jsp" %> 
            <%@include file="barra_navegacion.jsp" %>
            
        </header>
        <form action="RegistroCorporativo" method="post" class="center formulario">
            <label for="nombres_persona">Nombres</label>
            <input type="text" name="nombres_persona" class="campo_form" required>
            
            <label for="apellidos_persona">Apellidos</label>
            <input type="text" name="apellidos_persona" class="campo_form" required>
            
            <label for="documento_persona">Documento de Identidad</label>
            <input type="text" name="documento_persona" class="campo_form" required>

            
            <label for="correo">Correo</label>
            <input type="email" name="correo" class="campo_form" required>
            
            
            <label for="contrasena">Contraseña</label>
            <input type="password" name="contrasena" class="campo_form" required>
            
            <label for="telefono_persona">Telefono</label>
            <input type="text" name="telefono_persona" class="campo_form" required>

            <label for="direccion_persona">Direccion</label>
            <input type="text" name="direccion_persona" class="campo_form" required>
            
            
            
            <label for="rol_persona">Rol a Registrar</label>
            <select name="rol_persona" class="campo_form" required>
                <option value="">Selecciona una opcion . . .</option>
                <option value="1">Administrador</option>
                <option value="2">Veterinario</option>
            </select>
            
            <label for="especialidad_persona">Especialidad</label>
            <input type="text" name="especialidad_persona" class="campo_form" required>
            
            
            <label for="documento_corporativo">Documento Corporativo</label>
            <input type="text" name="documento_corporativo" class="campo_form" required>

            
            <button type="submit" class="button">Guardar Datos</button>
        </form>
        <p style="margin: 0 auto; margin-bottom: 20px;">¿Ya tienes una cuenta Corporativa? <a href="login.jsp" class="enlace">Inicia Sesión</a></p>
    </body>
</html>
