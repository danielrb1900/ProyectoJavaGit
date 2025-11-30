import java.util.Scanner;

public class CalcularPrimo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1;
        boolean flag = true;

        System.out.print("Introduce el número: ");
        n1 = sc.nextInt();
        sc.nextLine();

        sc.close();

        for ( int div = 2; div < n1 && flag; div++ ) { 

            if ( n1 % div == 0) {

                flag = false; 
            }
        }

        if ( flag) {
            System.out.println("El número es pirmo");
        } else {
            System.out.println("No es primo");
        }
        
        }
       }