package ligabaloncesto;

import java.util.Scanner;
import java.util.ArrayList;

public class LigaBaloncesto {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<PartidosLiga> listaPartL = new ArrayList<>();
        ArrayList<PartidosPlayOffs> listaPartP = new ArrayList<>();
        
        System.out.println("*****************************");
        System.out.println("            Menu             ");
        System.out.println("*****************************");
        System.out.println("1. Registrar partidos.");
        System.out.println("2. Finalizar partidos.");
        System.out.println("3. Ver partidos.");
        System.out.println("4. Salir.");
        System.out.println("*****************************");
        System.out.println("Elige una de nuestras opciones: ");
        int opc1 = scanner.nextInt();
        
        if (opc1 == 1){
            System.out.println("*****************************");
            System.out.println("1. Registrar partido de liga.");
            System.out.println("2. Registrar partido playOffs.");
            System.out.println("3. Salir.");
            System.out.println("*****************************");
            System.out.println("Elige una de nuestras opciones: ");
            int opc2 = scanner.nextInt();
            
            if(opc2 == 1){
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
                
                PartidosLiga pL1 = new PartidosLiga(jornada, tipo, nombreL, nombreV, fechaP);
                listaPartL.add(pL1);
            }
            if(opc2 == 2){
                
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
                
                PartidosPlayOffs pPO = new PartidosPlayOffs(jornada2, tipo2, nombreL2, nombreV2, fechaP2);
                listaPartP.add(pPO);
                
            }
            if(opc2 == 3){
                System.out.println("Gracias por utilizar nuestro programa. Vuelve pronto! :D");
            }
        }
        if(opc1 == 2){
            System.out.println("Estos son los partidos: ");
            for(int i = 0; i < listaPartL.size(); i++){
                System.out.println("Jornada: "+listaPartL.get(i).getJornada());
                System.out.println(listaPartL.get(i).getTipoRonda());
                System.out.println(listaPartL.get(i).getEquipoLocal());
                System.out.println(listaPartL.get(i).getEquipoVisitante());
                System.out.println(listaPartL.get(i).getFechaPartido());
            }
        }
    }
    
}
