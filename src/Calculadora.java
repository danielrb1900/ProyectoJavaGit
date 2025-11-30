import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      int n1, n2;
      char operador;

      System.out.print("Introduce el número 1: ");
      n1 = sc.nextInt();
      sc.nextLine();
      System.out.print("Introduce el número 2: ");
      n2 = sc.nextInt();
      sc.nextLine();
      System.out.print("Introduce el operador ");
      operador = sc.next().charAt(0);
      sc.nextLine();
     
      sc.close();

      switch (operador) {
        case '+':
            int suma = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + suma);
            break;
        case '-':
            int resta = n1 - n2;
            System.out.println(n1 + " - " + n2 + " = " + resta);
            break;
        case '*':
            int multi = n1 * n2;
            System.out.println(n1 + " * " + n2 + " = " + multi);
            break;
        case '/':
            if ( n1 == 0 || n2 == 0) {
                System.out.println("ERROR");
            }
            double div = (double) n1 / n2;
            System.out.println(n1 + " / " + n2 + " = " + div);
            break; 
        default:
            System.out.println("Operación no válida");
            break;
      }
        
    }
}
