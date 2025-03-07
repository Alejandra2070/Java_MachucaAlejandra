package ejercicio6;

//principio de responsabilidad única
//Se cumple en una parte y en otra no porque tiene dos responsabilidades
public class Ejercicio6 {
    
    public class Contacto {
        public String Nombre;
        public String CuentaBancaria;
        public String Email;

        public Contacto(String Nombre, String CuentaBancaria, String Email) {
            this.Nombre = Nombre;
            this.CuentaBancaria = CuentaBancaria;
            this.Email = Email;
        }

        @Override
        public String toString() {
            return "Contacto{" + "Nombre=" + Nombre + ", CuentaBancaria=" + CuentaBancaria + ", Email=" + Email + '}';
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public String getCuentaBancaria() {
            return CuentaBancaria;
        }

        public void setCuentaBancaria(String CuentaBancaria) {
            this.CuentaBancaria = CuentaBancaria;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        } 
    }

    public interface IMailSender {
        void Enviar(Contacto contacto, String cuerpoMensaje);
    }
}