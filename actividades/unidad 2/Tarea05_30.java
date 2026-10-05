import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_30  (Boletín 2, ejercicio 8)
 *
 * Enunciado: Pedir un número N, y mostrar todos los números del 1 al N.
 */
public class Tarea05_30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.println(i);

        sc.close();
    }
}
