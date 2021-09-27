/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author asf
 */
import java.sql.*;

public class Conexion_bd {

    private String url = "";
    private String DB_driver = "";
    private String host = "";
    private String db = "";
    private String username = "";
    private String password = "";
    public Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private boolean local;

    public Conexion_bd() {

        local = false;
        DB_driver = "com.mysql.jdbc.Driver";
        if (local) {
            host = "localhost:3306";
            db = "S33Prueba";
            url = "jdbc:mysql://" + host + "/" + db;
            username = "root";
            password = "root";
        } else {
            host = "167.99.168.84:3306";
            db = "S33Prueba";
            url = "jdbc:mysql://" + host + "/" + db;
            username = "mision";
            password = "tics";
        }

        try {
            Class.forName(DB_driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver de la base de datos: " + ex);
        }

        try {
            con = DriverManager.getConnection(url);
            if (con != null) {
                DatabaseMetaData meta = con.getMetaData();
                System.out.println("Base de datos conectada " + meta.getDriverName());
            }
        } catch (SQLException ex) {
            System.out.println("Error en la conexión a la base de datos " + ex.getMessage());
        }

    }

    public ResultSet consultarBD(String sentencia) {
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sentencia);
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
        } catch (RuntimeException rex) {
            System.out.println(rex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }
    public boolean insertarBD(String sentencia) {

        try {
            stmt = con.createStatement();
            stmt.execute(sentencia);
        } catch (SQLException | RuntimeException sqlex) {
            System.out.println("Error en insertar: " + sqlex.getMessage());
            return false;
        }
        return true;

    }

    public boolean actualizarBD(String sentencia) {
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(sentencia);
        } catch (SQLException | RuntimeException sqlex) {
            System.out.println("Error en actualizar: " + sqlex.getMessage());
            return false;
        }
        return true;
    }

    public boolean borrarBD(String sentencia) {
        try {
            stmt = con.createStatement();
            stmt.execute(sentencia);
        } catch (SQLException | RuntimeException sqlex) {
            System.out.println("Error en borrar: " + sqlex.getMessage());
            return false;
        }
        return true;
    }
    
    public  static void main(String[] args){
    
        ConexionBD ejemplo= new ConexionBD();
    
    }
}
