
package co.edu.sena.conexion;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private Connection conexion; //Crear la conexion a la base de datos
    private Statement stm; //Crear sentencias sql

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/saludpet", "root", "");
            stm=conexion.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public int insertarActualizarEliminar(String sql) {
       
        try { //Intenta ejecutar sentencias sql si esta mal muestra error en consola pero sigue eejcutando el programa
             // Convertir el texto a bytes con la codificación UTF-8
            byte[] textBytes = sql.getBytes("UTF-8");

            // Crear una nueva cadena de texto a partir de los bytes con la codificación UTF-8
            sql = new String(textBytes, "UTF-8");

            stm.execute(sql);
            return 1;
        } catch (SQLException | UnsupportedEncodingException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ResultSet consultar(String sql) {
        ResultSet r=null;
        try {//Si el sql esta mal hecho
            System.out.println(sql);
            r=stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    public void cerrar(){
        try {
            stm.close(); //Cerrar los statements usados
            conexion.close(); //Cerrar conexion: Puede que el sistema se realentice y la idea es que se cierren conexiones
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

