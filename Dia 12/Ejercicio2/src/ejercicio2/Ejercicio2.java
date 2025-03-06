package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    
    public void transferenciaRealizada(Transferencia transferencia) {
        if(esTransferenciaImportante(transferencia)) {
            String auditor=obtenerDireccionMailAuditor();
            String mensaje=componerMensajeAviso(transferencia);
            
            enviarEmail(auditor ,  mensaje);
        }
    }
    private boolean esTransferenciaImportante(Transferencia transferencia) {
       return transferencia.importe()>50000;
    }
    private String obtenerDireccionMailAuditor() {
       return "mail-auditor";
    }
    private String componerMensajeAviso(Transferencia transferencia) {
       return "aviso-transferencia-importante";    
    }
    private ConexionMail abrirConexionMail() {
       return ConexionMail.getInstance();
    }

    public void enviarEmail(String destinatario, String mensaje){
        ConexionMail conexionMail=null;
        try {
            conexionMail = this.abrirConexionMail();
            conexionMail.enviar(new Mail().to(destinatario).withBody(mensaje));
        } finally {
        if(conexionMail!=null)
          conexionMail.cerrar();
        }
    }
    static class ConexionMail {
	
	private static ConexionMail instance;
	
	private ConexionMail() {}
	
	public static ConexionMail getInstance() {
		if(instance == null) {
                    instance = new ConexionMail();
		}
		return instance;
	}
	
	private List<Mail> queue =  new ArrayList<Mail>();

	public void cerrar() {
		// dummy
	}

	public void enviar(Mail mail) {
		queue.add(mail);		
	}
	
	public List<Mail> getQueue() {
		return queue;
	}
    }

    static class Mail {
	
	private String auditor;
	private String mensaje;

	public Mail to(String auditor) {
		this.auditor = auditor;
		return this;
	}

	public Mail withBody(String mensaje) {
		this.mensaje = mensaje;
		return this;
	}

	public String getAuditor() {
		return auditor;
	}

	public String getMensaje() {
		return mensaje;
	} 
    }

    static class Transferencia {
	
	private int importe;

	public Transferencia(int importe){
		this.importe = importe;
	}
	
	public int importe() {
		return importe;
	}

    }

    public static void main(String[] args) {
        
    }  
}
