import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_8  (Boletín 1, ejercicio 8)
 *
 * Enunciado: Pedir dos números y decir cuál es el mayor o si son iguales.
 */
public class Tarea05_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int n2 = sc.nextInt();
        if (n1 == n2)
            System.out.println("Son iguales");
        else if (n1 > n2)
            System.out.println(n1 + " es mayor que " + n2);
        else
            System.out.println(n2 + " es mayor que " + n1);

        sc.close();
    }
}
