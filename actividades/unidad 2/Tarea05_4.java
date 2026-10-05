import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_4  (Boletín 1, ejercicio 4)
 *
 * Enunciado: Pedir dos números y decir si son iguales o no.
 */
public class Tarea05_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int n2 = sc.nextInt();
        if (n1 == n2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");

        sc.close();
    }
}
