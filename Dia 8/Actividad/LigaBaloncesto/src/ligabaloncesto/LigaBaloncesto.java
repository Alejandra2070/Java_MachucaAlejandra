package ligabaloncesto;

import java.util.Scanner;

public class LigaBaloncesto {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Partidos partido=new Partidos();
        boolean holi = true;
        
        System.out.println("*****************************");
        System.out.println("            Menu             ");
        System.out.println("*****************************");
        
        while(holi){
            System.out.println("1. Registrar partido de liga.");
            System.out.println("2. Registrar partido playOffs.");
            System.out.println("3. Agregar puntos.");
            System.out.println("4. Finalizar partidos.");
            System.out.println("5. Ver partidos.");
            System.out.println("6. Salir.");
            System.out.println("*****************************");
            System.out.println("Elige una de nuestras opciones: ");
            int opc1 = scanner.nextInt();

            if (opc1 == 1){

                System.out.println("Ingresa la informacion: ");
                System.out.println("1. Jornada: ");
                int jornada = scanner.nextInt();
                System.out.println("2. Tipo de ronda: ");
                scanner.nextLine();
                String tipo = scanner.nextLine();
                System.out.println("3. Nombre del equipo local: ");
                String nombreL = scanner.nextLine();
                System.out.println("4. Nombre del equipo visitante: ");
                String nombreV = scanner.nextLine();
                System.out.println("5. Fecha del partido: ");
                String fechaP = scanner.nextLine();

                partido = new PartidosLiga(jornada, tipo, nombreL, nombreV, fechaP);
                    
            }
            if(opc1 == 2){

                System.out.println("Ingresa la informacion: ");
                System.out.println("1. Jornada: ");
                int jornada2 = scanner.nextInt();
                System.out.println("2. Tipo de ronda: ");
                scanner.nextLine();
                String tipo2 = scanner.nextLine();
                System.out.println("3. Nombre del equipo local: ");
                String nombreL2 = scanner.nextLine();
                System.out.println("4. Nombre del equipo visitante: ");
                String nombreV2 = scanner.nextLine();
                System.out.println("5. Fecha del partido: ");
                String fechaP2 = scanner.nextLine();

                partido = new PartidosPlayOffs(jornada2, tipo2, nombreL2, nombreV2, fechaP2);
                    
            }
            if(opc1 == 3){
                
                System.out.println("*****************************************************");
                System.out.println("Ingresa los puntos del equipo local: ");
                int puntL = scanner.nextInt();

                partido.puntoL(puntL);

                System.out.println("*****************************************************");
                System.out.println("Ingresa los puntos del equipo visitante: ");
                int puntV = scanner.nextInt();

                partido.puntoV(puntV);
                
            }
            if(opc1 == 4){
                
                System.out.println("*****************************");
                System.out.println("Se finalizó el partido.");
                System.out.println("*****************************");
                partido.finPartido();

            }
            if(opc1 == 5){
                partido.mostrarInfo();
            }
            if(opc1 == 6){
                System.out.println("*****************************************************");
                System.out.println("Gracias por utilizar nuestro programa. Vuelve pronto!");
                System.out.println("*****************************************************");
                holi=false;
            }
        }
        
    }
    
}
