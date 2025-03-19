package Controlador;

import Modelo.Consultas;
import Modelo.Usuarios;
import Vista.FrameU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorUsuario implements ActionListener{
    
    private final Usuarios modelo;
    private final Consultas consultas;
    private final FrameU vista;
    
    public ControladorUsuario(Usuarios modelo, Consultas consultas, FrameU vista){
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.insertar.addActionListener(this);
        this.vista.modificar.addActionListener(this);
        this.vista.eliminar.addActionListener(this);
        this.vista.limpiar.addActionListener(this);
        this.vista.buscar.addActionListener(this);
    }
    
    public void iniciar() {
        vista.setTitle("Usuarios");
        vista.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == vista.insertar){
            modelo.setNombre(vista.txtName.getText());
            modelo.setEmail(vista.txtEmail.getText());
            
            if(consultas.agregar(modelo)){
                JOptionPane.showMessageDialog(null, "Usuario agregado.");
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al agregar usuario.");
                limpiar();
            }
        }
        
        if(e.getSource() == vista.modificar){
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            modelo.setNombre(vista.txtName.getText());
            modelo.setEmail(vista.txtEmail.getText());
            
            if(consultas.actualizar(modelo)){
                JOptionPane.showMessageDialog(null, "Usuario actualizado.");
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar.");
                limpiar();
            }
        }
        
        if(e.getSource() == vista.eliminar){
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            
            if (consultas.eliminar(modelo)){
                JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");
                limpiar();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar usuario.");
                limpiar();
            }
        }
        
        if(e.getSource() == vista.buscar){
            modelo.setId(Integer.parseInt(vista.txtId.getText()));
            
            if(consultas.obtener(modelo)){
                vista.txtName.setText(modelo.getNombre());
                vista.txtEmail.setText(modelo.getEmail());
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró al usuario.");
            }
        }
        
        if(e.getSource() == vista.limpiar){
            limpiar();
        }
    }
    
    public void limpiar() {
        vista.txtId.setText(null);
        vista.txtName.setText(null);
        vista.txtEmail.setText(null);
    }
}
