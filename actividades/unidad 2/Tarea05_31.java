import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_31  (Boletín 2, ejercicio 9)
 *
 * Enunciado: Escribir todos los números del 100 al 0 de 7 en 7.
 */
public class Tarea05_31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 100; i >= 0; i -= 7)
            System.out.println(i);

        sc.close();
    }
}
