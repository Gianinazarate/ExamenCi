<%-- 
    Document   : index
    Created on : 14-abr-2019, 20:11:49
    Author     : User
--%>

<%@page import="Objetos.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Alumnos</title>
    </head>
    <body>
        <form action="Controlador" method="POST">
            <table>
                <tr>
                    <td>ID Alumno</td><td><input type="number" placeholder="id" name="id"/></td>
                </tr>
                <tr>
                    <td>Nombre</td><td><input type="text" placeholder="Nombre" name="nombre"/></td>
                </tr>
                <tr>
                    <td>Apellido</td><td><input type="text" placeholder="Apellido" name="apellido"/></td>
                </tr>
                <tr>
                    <td>Documento</td><td><input type="text" placeholder="Documento" name="nro_documento"/></td>
                </tr>
                <tr>
                    <td>ID Carrera</td><td><input type="text" placeholder="Carrera" name="carrera_id"/></td>
                </tr>
                <tr>
                    <td><button type="submit">Registrar</button></td>
                </tr>             
            </table>
        </form>
    </body>
</html>

