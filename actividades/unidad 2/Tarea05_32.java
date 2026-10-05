import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_32  (Boletín 2, ejercicio 10)
 *
 * Enunciado: Pedir 15 números y escribir la suma total.
 */
public class Tarea05_32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double suma = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduce el número " + i + ": ");
            suma += sc.nextDouble();
        }
        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}
