/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.edu.sena.controlador;

import co.edu.sena.conexion.Conexion;
import co.edu.sena.modelo.Cliente;
import co.edu.sena.modelo.PersonaCorporativa;
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
@WebServlet(name = "LoginCliente", urlPatterns = {"/LoginCliente"})
public class LoginCliente extends HttpServlet {

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
            Cliente a = new Cliente();
            
            
            
            
            a.setCorreo_cliente(request.getParameter("correo"));
            a.setContrasena(request.getParameter("clave"));
            a.setRol_cliente(3);
            
            
            Conexion conexion = new Conexion();
            
            boolean isLogged = false;
            
            System.out.println("El correo ingresado es de: " + a.getCorreo_cliente());
            System.out.println("La clave ingresada es de: " + a.getContrasena());
            System.out.println("El rol de la persona es de: " + a.getRol_cliente());
            
            //SQL para consultar si existe el usuario en la base de datos
            String sql = "select * from cliente where correo = '"+a.getCorreo_cliente()+"'"
                         + " and contrasena = md5('"+a.getContrasena()+"')"
                         + " and rol_cliente = '"+a.getRol_cliente()+"' ";
            
            
            System.out.println("El sql es: " + sql);
            
            //Envio de datos a consultas
            ResultSet r = conexion.consultar(sql);
            
            //Envolver if dentro de try catch
            try {
                if(r.next()) {
                    
                    isLogged = true;
                    
                    
                    response.sendRedirect("index.jsp?v=1");
                } else {
                    
                    out.println("No se encontro el usuario en la base de datos");
                    conexion.cerrar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
