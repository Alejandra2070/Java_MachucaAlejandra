package mvc;

import mvc.controlador.UsuarioControlador;
import mvc.modelo.UsuarioDAO;
import mvc.vista.UsuarioVista;

public class MVC {

    public static void main(String[] args) {
        UsuarioDAO userDAO = new UsuarioDAO();
        UsuarioVista userVista = new UsuarioVista();
        UsuarioControlador userControlador = new UsuarioControlador(userDAO, userVista);
        
        userControlador.iniciar();
    } 
}
