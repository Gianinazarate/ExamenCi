/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author User
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD{
        
    public Connection getConnection() throws SQLException {
        String url= "jdbc:postgresql://localhost:5433/examen_ci";
        String user = "CI";
        String pass = "cambiar123";
        //try catch por si acaso no encuentre la base
        try {
            Class.forName("org.postgresql.Driver");    
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection result_conexion = DriverManager.getConnection(url, user, pass);
        return result_conexion;
    }
    public void closeConnection(Connection conex) {
        if (conex != null) {
            try {
                conex.close();
            }
            catch (SQLException ex) {
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
