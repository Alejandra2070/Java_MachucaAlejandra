package poo;

import java.util.Scanner;
import java.util.ArrayList;

public class POO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Personas> listaPersonas = new ArrayList<>();
        ArrayList<Pabellon> listaPabellon = new ArrayList<>();
        ArrayList<Personal> listaPersonal = new ArrayList<>();
        ArrayList<Departamento> listaDepar = new ArrayList<>();
        
        Personas persona1 = new Personas("Dra. Maria Gomez", "Calle #13 Los Andes");
        Pabellon pabellon1 = new Pabellon("Quirurgico", 33);
        Personal personal1 = new Personal("Dra. Maria Gomez", "Calle #13 Los Andes","Administrativo", 1800);
        Departamento depar1 = new Departamento("Emergencias");
        
        listaPersonas.add(persona1);
        listaPabellon.add(pabellon1);
        listaPersonal.add(personal1);
        listaDepar.add(depar1);
        
        System.out.println("                  Menu                 ");
        System.out.println("***************************************");
        boolean salir = false;
        while (salir == false){
            System.out.println("1. Agregar una nueva persona.");
            System.out.println("2. Ver personas.");
            System.out.println("3. Actualizar informacion de la persona.");
            System.out.println("4. Agregar un nuevo pabellon.");
            System.out.println("5. Ver pabellones.");
            System.out.println("6. Actualizar pabellones.");
            System.out.println("7. Eliminar pabellon.");
            System.out.println("8. Agregar un departamento");
            System.out.println("9. Ver los departamentos.");
            System.out.println("10. Actualizar un departamento");
            System.out.println("11. Eliminar un departamento.");
            System.out.println("12. Agregar un nuevo personal.");
            System.out.println("13. Ver personal.");
            System.out.println("14. Actualizar informacion del personal.");
            System.out.println("15. Eliminar personal.");
            System.out.println("16. Salir del programa.");
            System.out.println("Elige una de nuestras opciones: ");
            int opc = scanner.nextInt();

            switch(opc){

                case 1:
                    System.out.println("***************************************");
                    System.out.println("Ingresa los datos de la nueva persona: ");
                    System.out.println("***************************************");

                    System.out.println("1. Nombre: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();

                    System.out.println("2. Direccion: ");
                    String dir = scanner.nextLine();

                    Personas newPerson1 = new Personas(nombre, dir);
                    listaPersonas.add(newPerson1);
                    
                    System.out.println("La nueva persona fue registrada correctamente.");
                    break;

                case 2:

                    System.out.println("***************************************");
                    System.out.println("Estas son las personas en el hospital: ");
                    System.out.println("***************************************");
                    for(int i = 0; i < listaPersonas.size(); i++){
                        System.out.println("Id: " + listaPersonas.get(i).id_persona);
                        System.out.println("Nombre: " + listaPersonas.get(i).nombre);
                        System.out.println("Direccion: " + listaPersonas.get(i).direccion);
                        System.out.println("Id del hospital: " + listaPersonas.get(i).id_hospital);
                        System.out.println("***************************************");
                    }
                    break;
                    
                case 3:
                    
                    System.out.println("***************************************");
                    System.out.println("Ingresa el id de la persona: ");
                    int idP = scanner.nextInt();
                    
                    boolean persona = false; //------------------------------------------------------------------Revisar bucle
                    for(int i = 0; i < listaPersonas.size(); i++){
                        if(listaPersonas.get(i).id_persona == idP){
                            persona = true;
                            System.out.println("***************************************");
                            System.out.println("¿Que te gustaria actualizar de la persona?");
                            System.out.println("1. Nombre.");
                            System.out.println("2. Direccion.");
                            System.out.println("***************************************");
                            System.out.println("Elige una opcion: ");
                            int opc2 = scanner.nextInt();
                            
                            if(opc2 == 1){
                                System.out.println("***************************************");
                                System.out.println("Ingresa el nuevo nombre: ");
                                scanner.nextLine();
                                String nom = scanner.nextLine();
                                listaPersonas.get(i).setNombre(nom);
                                System.out.println("***************************************");
                                System.out.println("El nombre fue actualizado a: " + nom);
                                System.out.println("***************************************");
                            }
                            else if(opc2 == 2){
                                System.out.println("***************************************");
                                System.out.println("Ingresa la nueva direccion: ");
                                String dire = scanner.nextLine();
                                listaPersonas.get(i).setDireccion(dire);
                                System.out.println("***************************************");
                                System.out.println("La direccion fue actualizada a: " + dire);
                                System.out.println("***************************************");
                            }
                        }
                    }
                    break;
                    
                case 4:
                    
                    System.out.println("***************************************");
                    System.out.println("Ingresa los datos del nuevo pabellon: ");
                    System.out.println("***************************************");
                    
                    System.out.println("1. Tipo de pabellon: ");
                    scanner.nextLine();
                    String pab = scanner.nextLine();
                    
                    System.out.println("2. Capacidad: ");
                    int cap = scanner.nextInt();
                    
                    Pabellon newpab = new Pabellon(pab, cap);
                    listaPabellon.add(newpab);
                    
                    System.out.println("***************************************");
                    System.out.println("El nuevo pabellon fue registrado correctamente.");
                    System.out.println("***************************************");
                    break;
                    
                case 5:
                    
                    System.out.println("***************************************");
                    System.out.println("Estos son los pabellones: ");
                    System.out.println("***************************************");
                    for(int i = 0; i < listaPabellon.size(); i++){
                        System.out.println("Id: "+ listaPabellon.get(i).id_pabellon);
                        System.out.println("Tipo: " + listaPabellon.get(i).tipo);
                        System.out.println("Capacidad: " + listaPabellon.get(i).capacidad);
                        System.out.println("Id del departamento: " + listaPabellon.get(i).id_departamento);
                        System.out.println("Id del personal: " + listaPabellon.get(i).id_personal);
                        System.out.println("***************************************");
                    }
                    break;
                    
                case 6:
                    
                    System.out.println("***************************************");
                    System.out.println("Ingresa el id del pabellon: ");
                    int idPa = scanner.nextInt();
                    
                    boolean pabe = false; //------------------------------------------------------------------Revisar bucle
                    for(int i = 0; i < listaPabellon.size(); i++){
                        if(listaPabellon.get(i).id_pabellon == idPa){
                            pabe = true;
                            System.out.println("***************************************");
                            System.out.println("¿Que te gustaria actualizar del pabellon?");
                            System.out.println("1. Tipo");
                            System.out.println("2. Capacidad");
                            System.out.println("***************************************");
                            System.out.println("Elige una opcion: ");
                            int opc3 = scanner.nextInt();
                            
                            if(opc3 == 1){
                                System.out.println("***************************************");
                                System.out.println("Ingresa el nuevo tipo: ");
                                scanner.nextLine();
                                String tipp = scanner.nextLine();
                                listaPabellon.get(i).setTipo(tipp);
                                System.out.println("***************************************");
                                System.out.println("El tipo de pabellon fue actualizado a: " + tipp);
                                System.out.println("***************************************");
                            }
                            else if(opc3 == 2){
                                System.out.println("***************************************");
                                System.out.println("Ingresa la nueva capacidad: ");
                                int capp = scanner.nextInt();
                                listaPabellon.get(i).setCapacidad(capp);
                                System.out.println("***************************************");
                                System.out.println("La capacidad fue actualizada a: " + capp);
                                System.out.println("***************************************");
                            }
                        }
                    }
                    break;
                    
                case 7:
                    
                    System.out.println("***************************************");
                    System.out.println("Ingresa el id del pabellon que quieres eliminar: ");
                    int idr = scanner.nextInt();
                    
                    for(int i = 0; i < listaPabellon.size(); i++){
                        if(listaPabellon.get(i).id_pabellon == idr){
                            listaPabellon.remove(i);
                        }
                    }
                    
                    System.out.println("***************************************");
                    System.out.println("El pabellon fue eliminado correctamente.");
                    System.out.println("***************************************");
                    break;
                    
                case 8:
                    
                    System.out.println("***************************************");
                    System.out.println("Ingresa los datos del nuevo departamento: ");
                    System.out.println("***************************************");
                    
                    System.out.println("1. Tipo de departamento: ");
                    scanner.nextLine();
                    String tipo = scanner.nextLine();
                    
                    Departamento newDepar2 = new Departamento(tipo);
                    listaDepar.add(newDepar2);
                    
                    System.out.println("***************************************");
                    System.out.println("El nuevo departamento fue registrado correctamente.");
                    System.out.println("***************************************");
                    break;
                    
                case 9:
                    
                    System.out.println("***************************************");
                    System.out.println("Estos son los departamentos: ");
                    System.out.println("***************************************");
                    for(int i = 0; i < listaDepar.size(); i++){
                        System.out.println("Id: " + listaDepar.get(i).id_departamento);
                        System.out.println("Tipo: " + listaDepar.get(i).tipo);
                        System.out.println("Id del personal: " + listaDepar.get(i).id_personal);
                        System.out.println("***************************************");
                    }
                    break;
                    
                case 10:
                    
                    System.out.println("***************************************");
                    System.out.println("Ingresa el id del departamento: ");
                    int idDe = scanner.nextInt();
                    
                    boolean depar = false; //------------------------------------------------------------------Revisar bucle
                    for(int i = 0; i < listaDepar.size(); i++){
                        if(listaDepar.get(i).id_departamento == idDe){
                            System.out.println("Solo puedes actualizar el tipo de departamento.");
                            System.out.println("Ingresa el nuevo tipo: ");
                            scanner.nextLine();
                            
                            String tippo = scanner.nextLine();
                            
                            listaDepar.get(i).setTipo(tippo);
                            System.out.println("***************************************");
                            System.out.println("El tipo de departamento fue actualizado a: " + tippo);
                            System.out.println("***************************************");
                        }
                    }
                    break;
                    
                case 11:
                    
                    System.out.println("***************************************");
                    System.out.println("Ingresa el id del departamento que quieres eliminar: ");
                    int idEl = scanner.nextInt();
                    for(int i = 0; i < listaDepar.size(); i++){
                        if(listaDepar.get(i).id_departamento == idEl){
                            listaDepar.remove(i);
                        }
                    }
                    
                    System.out.println("***************************************");
                    System.out.println("El departamento fue eliminado correctamente.");
                    System.out.println("***************************************");
                    break;
                    
                case 12:
                    
                    System.out.println("***************************************");
                    System.out.println("Ingresa los datos del nuevo personal: ");
                    System.out.println("***************************************");
                    
                    System.out.println("1. Nombre.");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    
                    System.out.println("2. Direccion.");
                    String direc = scanner.nextLine();
                    
                    System.out.println("3. Tipo de trabajo: ");
                    String tra = scanner.nextLine();
                    
                    System.out.println("4. Salario: ");
                    int salario = scanner.nextInt();
                    
                    Personal newPersonal1 = new Personal(name, direc, tra, salario);
                    listaPersonal.add(newPersonal1);
                    
                    System.out.println("***************************************");
                    System.out.println("El nuevo personal fue registrado correctamente.");
                    System.out.println("***************************************");
                    break;
                    
                case 13:
                    
                    System.out.println("***************************************");
                    System.out.println("Este es el personal del hospital: ");
                    System.out.println("***************************************");
                    for(int i = 0; i < listaPersonal.size(); i++){
                        System.out.println("Id: " + listaPersonal.get(i).id_personal);
                        System.out.println("Tipo de trabajo: " + listaPersonal.get(i).tipo_trabajo);
                        System.out.println("Salario: " + listaPersonal.get(i).salario);
                        System.out.println("Id del departamento: " + listaPersonal.get(i).id_departamento);
                        System.out.println("***************************************");
                    }
                    break;
                    
                case 14:
                    
                    System.out.println("***************************************");
                    System.out.println("Ingresa el id del personal que quieres actualizar: ");
                    int ides = scanner.nextInt();
                    
                    for(int i = 0; i < listaPersonal.size(); i++){
                        if(listaPersonal.get(i).id_personal == ides){
                            System.out.println("***************************************");
                            System.out.println("¿Que te gustaria actualizar del personal?");
                            System.out.println("1. Tipo de trabajo.");
                            System.out.println("2. Salario.");
                            System.out.println("***************************************");
                            System.out.println("Elige una opcion: ");
                            int opc4 = scanner.nextInt();
                            
                            if(opc4 == 1){
                                System.out.println("***************************************");
                                System.out.println("Ingresa el nuevo tipo de trabajo: ");
                                scanner.nextLine();
                                String tipt = scanner.nextLine();
                                listaPersonal.get(i).setTipo_trabajo(tipt);
                                System.out.println("***************************************");
                                System.out.println("El tipo de trabajo fue actualizado a: " + tipt);
                                System.out.println("***************************************");
                            }
                            else if(opc4 == 2){
                                System.out.println("***************************************");
                                System.out.println("Ingresa el nuevo salario: ");
                                int sala = scanner.nextInt();
                                listaPersonal.get(i).setSalario(sala);
                                System.out.println("***************************************");
                                System.out.println("El salario fue actualizado a: " + sala);
                                System.out.println("***************************************");
                            }
                        }
                    }
                    break;
                    
                case 15:
                    
                    System.out.println("***************************************");
                    System.out.println("Ingresa el id del personal: ");
                    int pers = scanner.nextInt();
                    for(int i = 0; i < listaPersonal.size(); i++){
                        if(listaPersonal.get(i).id_personal == pers){
                            listaPersonal.remove(i);
                        }
                    }
                    
                    System.out.println("***************************************");
                    System.out.println("El personal fue eliminado correctamente.");
                    System.out.println("***************************************");
                    break;
                    
                case 16:
                    System.out.println("***************************************************************");
                    System.out.println("Muchas gracias por utilizar nuestro programa. Vuelve pronto! :D");
                    System.out.println("***************************************************************");
                    salir = true;
                    break;
            }
        }
        
    }
    
}