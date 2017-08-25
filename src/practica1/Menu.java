
package practica1;

import java.util.Scanner;


public class Menu {
    
    int op;
    int longitud;
    Scanner scanner;
    Jugador jugador;
    Tablero tablero;
    
    public Menu(){
         scanner = new Scanner(System.in);
         op=0;
         longitud=3;
         jugador = new Jugador();
         tablero = new Tablero();
         jugador.setPuntuacion(0);
        opciones();
    }
    
    private void opciones() {

        while (op != 2) {
            System.out.println("Bienvenido! \n"
                    + "Escoja una opción: \n"
                    + "1. Jugar \n"
                    + "2. Salir");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    opciones1();
                    break;
                case 2:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Ingresa solo opciones validas por favor");
                    break;

            }
        }
    }
    
    private void opciones1(){
             
        System.out.println("Ingresa nombre de jugador: ");
        jugador.setNombre(scanner.nextLine());
        if(jugador.getNombre().equals("")){
            System.out.println("Debes ingresar un nombre por favor");
        }else{
            opciones3();
        }
        
        
    }
    
    private void opciones2(){
        System.out.println("Ingresa la anchura del tablero (maximo 30, minimo 10)");
        tablero.setM(scanner.nextInt());
        scanner.nextLine();
        if(tablero.getM()<10 || tablero.getM()>30){
            opciones2();
            
        }
        dibujartablero(tablero.getM());
    }
    
    private void opciones3(){
        System.out.println("Ingresa la longitud inicial de la serpiente (maximo 8, minimo 2)");
        longitud=scanner.nextInt();
        if(longitud<2 || longitud>8){
            opciones3();
        }else{
            opciones2();
        }
    }

    void dibujartablero(int tam) {
        System.out.println("\n"
                + jugador.getNombre()+
                "\n");
        
        for (int col = 1; col <= tam; col++) {
            System.out.print(" *");
        }

        System.out.print("\n");

        for (int fila = 2; fila < tam; fila++) {
            System.out.print(" *");
            for (int col = 2; col < tam; col++) {
                System.out.print("  ");
            }

            System.out.print(" * \n");
        }
        for (int col = 1; col <= tam; col++) {
            System.out.print(" *");
        }
        System.out.println("\n");
    }

}

