package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    
    public interface NotificacionConfirmacion{
        void enviarMensajeDeConfirmacion(Orden orden);
    }

    public class NotificarPorMail implements NotificacionConfirmacion {
        
        @Override
        public void enviarMensajeDeConfirmacion(Orden orden){}

        private static NotificarPorMail instance;

        private NotificarPorMail() {}

        public static NotificarPorMail getInstance() {
            if (instance == null) {
                instance = new NotificarPorMail();
            }
            return instance;
        }

        public List<Orden> ordenes = new ArrayList<Orden>();

    }
    
    public class Orden {
	public boolean Isvalid() {
            return true;
	}
    }
    
    public class ProcesadorDeOrdenes {

	public void procesar(Orden orden) {
            if (orden.Isvalid() && new Repositorio().grabar(orden)) {
                NotificarPorMail.getInstance().enviarMensajeDeConfirmacion(orden);
            }
	}
    }
    
    public class Repositorio {

	public boolean grabar(Orden orden) {
            return true;
	}
    }
    
}
