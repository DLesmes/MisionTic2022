/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author asf
 */
public class ConsultasContacto extends Conexion {
    
    public boolean registrar(Contactos contacts){
        PreparedStatement insertStatement = null;
        Connection conexion = getConexion();
        
        String sql = "INSERT INTO contactos (identificacion, nombre, apellido, genero, tipoidentificacion, telefono, direccion, correo) VALUES(?,?,?,?,?,?,?,?)";
        try {
            insertStatement = conexion.prepareStatement(sql);
            insertStatement.setInt(1, contacts.getIdentificacion());
            insertStatement.setString(2, contacts.getNombre());
            insertStatement.setString(3, contacts.getApellido());
            insertStatement.setString(4, contacts.getGenero());
            insertStatement.setString(5, contacts.getTipoIdentificacion());
            insertStatement.setString(6, contacts.getTelefono());
            insertStatement.setString(7, contacts.getDireccion());
            insertStatement.setString(8, contacts.getCorreo());
            insertStatement.execute();
            return true;
        } catch (SQLException sqlex){
            System.err.println("Error al insertar un contacto "+sqlex.getMessage());
            return false;
        } finally {
            try{
                conexion.close();
            } catch (SQLException sqlerror) {
                System.err.println("Error al cerrar la conexión insertando "+sqlerror.getMessage());
            }
        }
        
    }
    
    public boolean modificar(Contactos contacts){
        PreparedStatement updateStatement = null;
        Connection conexion = getConexion();
        String sql = "UPDATE contactos SET identificacion=?, nombre=?, apellido=?, genero=?, tipoidentificacion=?, telefono=?, direccion =?, correo=? WHERE identificacion=?";
        
        try {
            updateStatement = conexion.prepareStatement(sql);
            updateStatement.setInt(1, contacts.getIdentificacion()); 
            updateStatement.setString(2, contacts.getNombre());
            updateStatement.setString(3, contacts.getApellido());
            updateStatement.setString(4, contacts.getGenero());
            updateStatement.setString(5, contacts.getTipoIdentificacion());
            updateStatement.setString(6, contacts.getTelefono());
            updateStatement.setString(7, contacts.getDireccion());
            updateStatement.setString(8, contacts.getCorreo());
            updateStatement.setInt(9, contacts.getIdentificacion());
            updateStatement.execute();
            return true;
            
        } catch (SQLException e) {
            System.err.println("Error al actualizar un contacto "+e.getMessage());
            return false;
        } finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println("Error al intentar cerrar la conexion al actualizar" + e.getMessage());
            }
        }
    }   
    
    public boolean eliminar(Contactos contacts){
        PreparedStatement deleteStatement = null;
        Connection conexion = getConexion();
        
        String sql = "DELETE FROM contactos WHERE identificacion =?";
        
        try {
            deleteStatement = conexion.prepareStatement(sql);
            deleteStatement.setInt(1, contacts.getIdentificacion());
            deleteStatement.execute();
            return true;
        } catch (Exception e) {
            System.err.println("Error al eliminar el contacto"+ e.getMessage());
            return false;
        } finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexion al eliminar un contacto"+e.getMessage());
            }
        }
    }
    
    public boolean seleccionar(Contactos contacts)  {
        PreparedStatement selectStatement = null;
        Connection conexion = getConexion();
        
        String sql = "SELECT * FROM contactos WHERE identificacion =?";
        
        try {
            selectStatement = conexion.prepareStatement(sql);
            selectStatement.setInt(1, contacts.getIdentificacion());
            ResultSet query = selectStatement.executeQuery();
                  while (query.next()){
                      contacts.setApellido(query.getString(3));
                      contacts.setCorreo(query.getString(8));
                      contacts.setDireccion(query.getString(7));
                      contacts.setGenero(query.getString(4));
                      contacts.setIdentificacion(query.getInt(1));
                      contacts.setNombre(query.getString(2));
                      contacts.setTelefono(query.getString(6));
                      contacts.setTipoIdentificacion(query.getString(5));
                  }
            return true;
        
        } catch (Exception e) {
            System.err.println("Error al consultar el usuario"+e.getMessage());
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error al cerrar la conexion al consultar un contacto"+ex.getMessage());
            }
        }
    }
    
}
