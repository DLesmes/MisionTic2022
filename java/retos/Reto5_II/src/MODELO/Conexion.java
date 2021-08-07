/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author asf
 */
public class Conexion {
    //jdbc:postgresql://localhost:5432/postgres
    //org.postgresql.Driver
    
    private final String nombreDB="postgres";
    private final String usuario="postgres";
    private final String contrasena="toor";
    private final String url="jdbc:postgresql://localhost:5432/"+nombreDB;
    
    public Connection conexion=null;

    public Connection getConexion() {
        try{
            System.out.println("Coneccion a la base de datos postgresql exitosa");
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(this.url, this.usuario, this.contrasena);
            
        
        } catch (SQLException e){
            System.err.println("Error sql "+e.getMessage());
        }
        catch (ClassNotFoundException ex){
            System.err.println("Error Clase no encontrada exepcion "+ex.getMessage());
        }
        
        return conexion;
    }
    
}
