/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.edu.sena.controlador;

import co.edu.sena.conexion.Conexion;
import co.edu.sena.modelo.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "RegisterCliente", urlPatterns = {"/RegisterCliente"})
public class RegisterCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Conexion conexion = new Conexion();           
            Cliente cliente = new Cliente();
            
            
            
            System.out.println("AQUI ESTA EL PROBLEMA?");
            
            
            int documentoCliente = Integer.parseInt(request.getParameter("documento_cliente"));
            int telefonoCliente = Integer.parseInt(request.getParameter("telefono_cliente"));
            
            String fechaNacimiento = request.getParameter("fecha_nacimiento");
            
            System.out.println("PROBLEMA DESPUES DE LAS FECHAS??");
            
            cliente.setNom_cliente(request.getParameter("nombres_cliente"));
            cliente.setApe_cliente(request.getParameter("apellidos_cliente"));
            cliente.setDocu_cliente(documentoCliente);
            cliente.setCorreo_cliente(request.getParameter("correo"));
            cliente.setContrasena(request.getParameter("contrasena"));
            cliente.setTelefono(telefonoCliente);
            cliente.setDireccion(request.getParameter("direccion_cliente"));
            cliente.setEstado_cliente("Activo");
            cliente.setCliente_vip("N");
            cliente.setRol_cliente(3);
            cliente.setIsLogged(0);
            
            System.out.println("PROBLEMA DESPUES DE OBTENER LOS VALORES DEL HTML?");
            
            String sql = "select * from cliente" +
                         " where docu_cliente = " + cliente.getDocu_cliente() + 
                         " or    correo like '%"+cliente.getCorreo_cliente()+"%'";
            
            
            System.out.println("EL SQL PARA BUSCAR SI AY EXISTE EL DOCUMENTO ES: " + sql);
            
            ResultSet rs = conexion.consultar(sql);
            
            try {
                if(rs.next()) {
                    out.println("Documento ya registrado");
                } else {
                    //rs.close();
                    
                    sql = "insert into cliente values (0, '"+cliente.getNom_cliente()+"', '"+cliente.getApe_cliente()+"',"+cliente.getDocu_cliente()+
                          " , '"+cliente.getCorreo_cliente()+"', md5('"+cliente.getContrasena()+"'), "+cliente.getTelefono()+", '"+cliente.getDireccion()+
                          "', '"+fechaNacimiento+"', curdate(), '"+cliente.getEstado_cliente()+"', '"+cliente.getCliente_vip()+"', '"+cliente.getRol_cliente()+
                          "', "+cliente.getIsLogged()+")";
                    
                    
                    System.out.println("SQL CONSTRUIDO: " + sql);
                    
                    
                    
                    
                    int i = conexion.insertarActualizarEliminar(sql);
                    
                    if(i == 1) {
                        out.println("<script>");
                        out.println("alert('Cliente Registrado Exitosamente')");
                        out.println("</script>");
                        response.sendRedirect("index.jsp?v="+ i);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegisterCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
