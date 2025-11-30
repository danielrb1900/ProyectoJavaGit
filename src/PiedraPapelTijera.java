import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) throws Exception {

        int jugador1; 
        int jugador2;
        Scanner sc = new Scanner(System.in);   
        
        System.out.print( "JUGADOR 1, elige: ");
        jugador1 = sc.nextInt();
        System.out.print( "JUGADOR 2, elige: ");
        jugador2 = sc.nextInt();
        sc.close();


        if ( jugador1 == jugador2 ) {
            System.out.println("EMPATE");
        } else if ( jugador1 == 1 && jugador2 == 3 || jugador1 == 2 && jugador2 == 1 || jugador1 == 3 && jugador2 == 2 ) {
            System.out.println("GANA EL JUGADOR 1");
        }  else {
            System.out.println("GANA EL JUGADOR 2");
        }
            
        }
        }
