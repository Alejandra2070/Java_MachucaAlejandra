package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    
    public class Cliente {
	public String nombre;
	public Localidad localidad;
	public float saldo;
	
	public String getNombre() {
            return nombre;
	}
	public void setNombre(String nombre) {
            this.nombre = nombre;
	}
	public Localidad getLocalidad() {
            return localidad;
	}
	public void setLocalidad(Localidad localidad) {
            this.localidad = localidad;
	}
	public float getSaldo() {
            return saldo;
	}
	public void setSaldo(float saldo) {
            this.saldo = saldo;
	}
    }
    
    public enum Localidad {
        NONE,
        BAHIA_BLANCA,
        TRES_ARROYOS
    }
    
    public interface Filtro{
        List<Cliente> filtrar(List<Cliente> clientes);
    }
    
    public class FiltroClientes {

        public static class filtroPorLocalidad implements Filtro{
            
            private Localidad localidad;
            
            public filtroPorLocalidad(Localidad localidad){
                this.localidad = localidad;
            }
        
            public List<Cliente> filtrar(List<Cliente> clientes) {
                List<Cliente> filteredList = new ArrayList<>();
                for (Cliente cliente : clientes) {
                    if (cliente.localidad == localidad) {
                        filteredList.add(cliente);
                    }
                }
                return filteredList;
            }
        }
        
        public static class filtroPorNombre implements Filtro{
            
            private String nombre;
            
            public filtroPorNombre(String nombre){
                this.nombre = nombre;
            }
            
            public List<Cliente> filtrar(List<Cliente> clientes) {
                List<Cliente> filteredList = new ArrayList<>();
                for (Cliente cliente : clientes) {
                    if (cliente.nombre.equals(nombre)) {
                        filteredList.add(cliente);
                    }
                }
                return filteredList;
            }
        }
        
        public static class filtroConSaldo implements Filtro{
            public List<Cliente> filtrar(List<Cliente> clientes) {
                List<Cliente> filteredList = new ArrayList<>();
                for (Cliente cliente : clientes) {
                    if (cliente.saldo > 0) {
                        filteredList.add(cliente);
                    }
                }
                return filteredList;
            }   
        }  
    }
    
    public class LogicaClientes {

        private List<Cliente> clientes =  new ArrayList<Cliente>();

        public List<Cliente> getClientes() {
            return clientes;
        }
        
        public List<Cliente> aplicarFiltro(Filtro filtro){
            return filtro.filtrar(clientes);
        }
    }

    public static void main(String[] args) {
        
    }
    
}
