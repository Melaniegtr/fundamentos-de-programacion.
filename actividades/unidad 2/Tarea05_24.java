import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_24  (Boletín 2, ejercicio 2)
 *
 * Enunciado: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
 */
public class Tarea05_24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número (0 para terminar): ");
        double n = sc.nextDouble();
        while (n != 0) {
            if (n > 0)
                System.out.println("Positivo");
            else
                System.out.println("Negativo");
            System.out.print("Introduce un número (0 para terminar): ");
            n = sc.nextDouble();
        }
        System.out.println("Fin del programa");

        sc.close();
    }
}
