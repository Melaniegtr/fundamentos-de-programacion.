import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_7  (Boletín 1, ejercicio 7)
 *
 * Enunciado: Pedir dos números y decir cuál es el mayor.
 */
public class Tarea05_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int n2 = sc.nextInt();
        if (n1 > n2)
            System.out.println(n1 + " es mayor que " + n2);
        else
            System.out.println(n2 + " es mayor o igual que " + n1);

        sc.close();
    }
}
