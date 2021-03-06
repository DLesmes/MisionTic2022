/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.ConsultasContacto;
import MODELO.Contactos;
import VISTA.JFContactos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author asf
 */
public class ControladorContactos implements ActionListener{
    
    private Contactos contacts;
    private ConsultasContacto consultasBD;
    private JFContactos vista;

    public ControladorContactos(Contactos contacts, ConsultasContacto consultasBD, JFContactos vista) {
        this.contacts = contacts;
        this.consultasBD = consultasBD;
        this.vista = vista;
        
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnCrear.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
    }
    
    public void iniciaVista() {
        vista.setTitle("Contactos BD!!");
        vista.setLocationRelativeTo(null);
    }
    
    public void limpiarTxtFields(){
        vista.txtApellido.setText(null);
        vista.txtNombre.setText(null);
        vista.txtNumIndetificacion.setText(null);
        vista.txtBuscar.setText(null);
        vista.txtCorreo.setText(null);
        vista.txtDireccion.setText(null);
        vista.txtGenero.setText(null);
        vista.txtTelefono.setText(null);
        vista.txtTipoID.setText(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        if (e.getSource() == vista.btnCrear) {
            contacts.setIdentificacion(Integer.parseInt(vista.txtNumIndetificacion.getText()));
            contacts.setNombre(vista.txtNombre.getText());
            contacts.setApellido(vista.txtApellido.getText());
            contacts.setGenero(vista.txtGenero.getText());
            contacts.setTipoIdentificacion(vista.txtTipoID.getText());
            contacts.setTelefono(vista.txtTelefono.getText());
            contacts.setDireccion(vista.txtDireccion.getText());
            contacts.setCorreo(vista.txtCorreo.getText());
            
            if (consultasBD.registrar(contacts)){
                JOptionPane.showMessageDialog(null, "El registro del contacto fue almacenado exitosamente en la base de datos");
                limpiarTxtFields();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el contacto en la base de datos");
            }
        }
        
        if (e.getSource() == vista.btnActualizar) {
            //contacts.setId(Integer.parseInt(vista.txtBuscar.getText()));
            contacts.setIdentificacion(Integer.parseInt(vista.txtNumIndetificacion.getText()));
            contacts.setNombre(vista.txtNombre.getText());
            contacts.setApellido(vista.txtApellido.getText());
            contacts.setGenero(vista.txtGenero.getText());
            contacts.setTipoIdentificacion(vista.txtTipoID.getText());
            contacts.setTelefono(vista.txtTelefono.getText());
            contacts.setDireccion(vista.txtDireccion.getText());
            contacts.setCorreo(vista.txtCorreo.getText());
            
            if (consultasBD.modificar(contacts)) {
                JOptionPane.showMessageDialog(null, "El contacto fue actualizado correctamente");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el contacto en la base de datos");
            }
            
        }
        
        if (e.getSource() == vista.btnEliminar) {
            contacts.setId(Integer.parseInt(vista.txtBuscar.getText()));
            if (consultasBD.eliminar(contacts)) {
                JOptionPane.showMessageDialog(null, "El contacto fue eliminado corectamente de la base de datos");
                limpiarTxtFields();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el contacto en la base de datos");
            }
        }
        
        if (e.getSource() == vista.btnBuscar) {
            contacts.setIdentificacion(Integer.parseInt(vista.txtBuscar.getText()));
            if (consultasBD.seleccionar(contacts)) {
                //vista.txtBuscar.setText(String.valueOf(contacts.getId()));
                vista.txtNumIndetificacion.setText(String.valueOf(contacts.getIdentificacion()));
                vista.txtNombre.setText(contacts.getNombre());
                vista.txtApellido.setText(contacts.getApellido());
                vista.txtGenero.setText(contacts.getGenero());
                vista.txtTipoID.setText(contacts.getTipoIdentificacion());
                vista.txtTelefono.setText(contacts.getTelefono());
                vista.txtDireccion.setText(contacts.getDireccion());
                vista.txtCorreo.setText(contacts.getCorreo());
            } else {
                JOptionPane.showMessageDialog(null, "No hay registros en la base de datos con esa identificaci??n");
                limpiarTxtFields();
            }
        }

        if (e.getSource() == vista.btnLimpiar) {
            limpiarTxtFields();
        }

    }
}
