/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.edu.sena.controlador;

import co.edu.sena.conexion.Conexion;
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
@WebServlet(name = "RegistroCorporativo", urlPatterns = {"/RegistroCorporativo"})
public class RegistroCorporativo extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            Conexion conexion = new Conexion();           
            PersonaCorporativa p = new PersonaCorporativa();
            
            
            
            System.out.println("AQUI ESTA EL PROBLEMA?");
            System.out.println("------NUEVA LINEA-------");
            System.out.println("NUMERO DE DOCUMENTO: " + request.getParameter("documento_persona"));
            int documentoPersona = Integer.parseInt(request.getParameter("documento_persona"));
                int telefonoPersona = Integer.parseInt(request.getParameter("telefono_persona"));
                int rolPersona = Integer.parseInt(request.getParameter("rol_persona"));
                
                System.out.println(documentoPersona);
                System.out.println(telefonoPersona);
                System.out.println(rolPersona);
            
            
            
            System.out.println("DOCUMENTO PERSONA " + documentoPersona);
            System.out.println("TELEFONO PERSONA " + telefonoPersona);
            System.out.println("ROL PERSONA " + telefonoPersona);
            
            System.out.println("PROBLEMA DESPUES DE LAS FECHAS??");
            
            p.setNom_persona(request.getParameter("nombres_persona"));
            p.setApe_persona(request.getParameter("apellidos_persona"));
            p.setDoc_persona(documentoPersona);
            p.setCorreo(request.getParameter("correo"));
            p.setContrasena(request.getParameter("contrasena"));
            p.setTelefono(telefonoPersona);
            p.setDireccion(request.getParameter("direccion_persona"));
            p.setEstado_persona("Activo");
            p.setDoc_corporativo(request.getParameter("documento_corporativo"));
            p.setEspecialidad_persona(request.getParameter("especialidad_persona"));
            p.setRol_persona(rolPersona);
            p.setIsLogged(0);
            
            System.out.println("PROBLEMA DESPUES DE OBTENER LOS VALORES DEL HTML?");
            
            String sql = "select * from personas_corporativas" +
                         " where doc_persona = " + p.getDoc_persona() + 
                         " or    correo like '%"+p.getCorreo()+"%'";
            
            
            System.out.println("EL SQL PARA BUSCAR SI AY EXISTE EL DOCUMENTO ES: " + sql);
            
            ResultSet rs = conexion.consultar(sql);
            
            try {
                if(rs.next()) {
                    out.println("Documento ya registrado");
                } else {
                    //rs.close();
                    
                    sql = "insert into personas_corporativas values (0, '"+p.getNom_persona()+"', '"+p.getApe_persona()+"',"+p.getDoc_persona()+
                          " , '"+p.getCorreo()+"', md5('"+p.getContrasena()+"'), "+p.getTelefono()+", '"+p.getDireccion()+
                          "', "+p.getRol_persona()+ ",'"+p.getEspecialidad_persona()+"', '"+p.getDoc_corporativo() + "', '"+p.getEstado_persona()+"'" +
                          ", "+p.getIsLogged()+")";
                    
                    
                    System.out.println("SQL CONSTRUIDO INSERTAR PERSONAS CORPORATIVAS: " + sql);
                    
                    
                    
                    
                    int i = conexion.insertarActualizarEliminar(sql);
                    
                    if(i == 1) {
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
