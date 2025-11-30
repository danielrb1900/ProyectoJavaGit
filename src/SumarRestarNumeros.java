import java.util.Scanner;

public class SumarRestarNumeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y, suma, resta;

        System.out.print("Introduce el primer número: ");
        x = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el segundo número: ");
        y = sc.nextInt();

        sc.close();

        suma = x + y;
        resta = x - y;

        System.out.println(x + " + " + y + " = " + suma);
         System.out.println(x + " - " + y + " = " + resta);
    }
}
