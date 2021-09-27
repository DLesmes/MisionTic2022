/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Usuario
 */
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import persistencia.ConexionBD;

public class Contacto {

    private int contacto_id;
    private String nombre;
    private String apellido;
    private String genero;
    private String tipoIdentificacion;
    private String telefono;
    private String direccion;
    private String correo;
    private String identificacion;
    private String edad;
    private ConexionBD conexion;

    public Contacto() {
        this.conexion = new ConexionBD();
    }

    public int getContacto_id() {
        return contacto_id;
    }

    public void setContacto_id(int contacto_id) {
        this.contacto_id = contacto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public boolean guardarContacto() {
        String sentencia = "INSERT INTO contactos(identificacion,nombre,apellido,genero,tipoIdentificacion"
                + ",telefono,direccion,correo,edad) VALUES('" + this.identificacion + "','" + this.nombre + "',"
                + "'" + this.apellido + "','" + this.genero + "','" + this.tipoIdentificacion + "',"
                + "'" + this.telefono + "','" + this.direccion + "','" + this.correo + "','" + this.edad + "');";
        return conexion.insertarBD(sentencia);
    }

    public ArrayList<Contacto> listaContactos() {

        ArrayList<Contacto> listaContactos = new ArrayList<>();
        String sentencia = "SELECT * FROM contactos";
        ResultSet rs = conexion.consultarBD(sentencia);
        Contacto c;
        try {
            while (rs.next()) {
                c = new Contacto();
                c.setContacto_id(rs.getInt("contacto_id"));
                c.setIdentificacion(rs.getString("identificacion"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setGenero(rs.getString("genero"));
                c.setTipoIdentificacion(rs.getString("tipoIdentificacion"));
                c.setTelefono(rs.getString("telefono"));
                c.setDireccion(rs.getString("direccion"));
                c.setCorreo(rs.getString("correo"));
                c.setEdad(rs.getString("edad"));
                listaContactos.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta a la bd: " + ex.getMessage());
        }

        return listaContactos;

    }

    public Contacto obtenerContacto() {

        String sentencia = "SELECT * FROM contactos WHERE identificacion='" + this.identificacion + "'";
        ResultSet rs = conexion.consultarBD(sentencia);
        try {
            if (rs.next()) {
                this.contacto_id = rs.getInt("contacto_id");
                this.nombre = rs.getString("nombre");
                this.apellido = rs.getString("apellido");
                this.genero = rs.getString("genero");
                this.tipoIdentificacion = rs.getString("tipoIdentificacion");
                this.telefono = rs.getString("telefono");
                this.direccion = rs.getString("direccion");
                this.correo = rs.getString("correo");
                this.edad = rs.getString("edad");
                return this;
            }
        } catch (SQLException ex) {
            System.out.println("Error en la consulta a la bd: " + ex.getMessage());
        }
        return null;
    }

    public boolean actualizarContacto() {

        String sentencia = "UPDATE contactos SET nombre='" + this.nombre + "',apellido='" + this.apellido + "', genero='" + this.genero + "'"
                + ",tipoIdentificacion='" + this.tipoIdentificacion + "',telefono='" + this.telefono + "',direccion='" + this.direccion + "'"
                + ",correo='" + this.correo + "', edad='" + this.edad + "', identificacion='" + this.identificacion + "' WHERE contacto_id=" + this.contacto_id + ";";
        return conexion.actualizarBD(sentencia);

    }

    public boolean borrarContacto(int contacto_id) {
        String sentencia = "DELETE FROM contactos WHERE contacto_id=" + contacto_id;
        return conexion.borrarBD(sentencia);
    }

    public static void main(String[] args) {

        /* Contacto ejemploContacto= new Contacto();
        ejemploContacto.setIdentificacion("152252");
        ejemploContacto.setNombre("Juliana");
        ejemploContacto.setApellido("Rodriguez");
        ejemploContacto.setGenero("Femenino");
        ejemploContacto.setTipoIdentificacion("CC");
        ejemploContacto.setTelefono("54642121554");
        ejemploContacto.setDireccion("Carrera 40 # 40");
        ejemploContacto.setCorreo("ing.juli@gma.com");
        ejemploContacto.setEdad("24");
        ejemploContacto.guardarContacto();*/
        
        /*Contacto ejemploContacto = new Contacto();
        ejemploContacto.setIdentificacion("8792252");
        ejemploContacto.setNombre("Leidy");
        ejemploContacto.setApellido("Rodriguez");
        ejemploContacto.setGenero("Femenino");
        ejemploContacto.setTipoIdentificacion("CC");
        ejemploContacto.setTelefono("122121554");
        ejemploContacto.setDireccion("Diagonal 40 # 40");
        ejemploContacto.setCorreo("ing.rodr@gma.com");
        ejemploContacto.setEdad("19");
        ejemploContacto.setContacto_id(2);
        ejemploContacto.actualizarContacto();*/

        /*Contacto ejemploContacto2 = new Contacto();
        ArrayList<Contacto> ejemploListaContactos = ejemploContacto2.listaContactos();

        for (Contacto c : ejemploListaContactos) {

            System.out.println("El nombre del contacto es: " + c.getNombre());

        }*/
        
        /*Contacto ejemploContacto = new Contacto();
        ejemploContacto.setIdentificacion("110252456");
        ejemploContacto= ejemploContacto.obtenerContacto();        
        System.out.println("El nombre del contacto es: "+ejemploContacto.getNombre());*/
        
        Contacto ejemploContacto = new Contacto();
        ejemploContacto.borrarContacto(2);
        
        
        

    }

}
