import java.util.Scanner;

public class SumarNumeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y, suma;

        System.out.print("Introduce el primer número: ");
        x = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el segundo número: ");
        y = sc.nextInt();

        sc.close();

        suma = x + y;

        System.out.println(x + " + " + y + " = " + suma);
    }
}
