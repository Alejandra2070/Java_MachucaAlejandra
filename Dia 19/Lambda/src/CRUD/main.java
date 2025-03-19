package CRUD;

import Controlador.ControladorUsuario;
import Modelo.Consultas;
import Modelo.Usuarios;
import Vista.FrameU;

public class main {
    public static void main(String[] args) {
        Usuarios us = new Usuarios();
        Consultas cons = new Consultas();
        FrameU fr = new FrameU();
        
        ControladorUsuario cu = new ControladorUsuario(us, cons, fr);
        cu.iniciar();
        fr.setVisible(true);
    }
}
