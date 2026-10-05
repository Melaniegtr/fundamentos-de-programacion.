import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_25  (Boletín 2, ejercicio 3)
 *
 * Enunciado: Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */
public class Tarea05_25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número entero (0 para terminar): ");
        int n = sc.nextInt();
        while (n != 0) {
            if (n % 2 == 0)
                System.out.println("Par");
            else
                System.out.println("Impar");
            System.out.print("Introduce un número entero (0 para terminar): ");
            n = sc.nextInt();
        }
        System.out.println("Fin del programa");

        sc.close();
    }
}
