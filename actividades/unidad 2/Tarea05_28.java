import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_28  (Boletín 2, ejercicio 6)
 *
 * Enunciado: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
 */
public class Tarea05_28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double suma = 0;
        System.out.print("Introduce un número (0 para terminar): ");
        double n = sc.nextDouble();
        while (n != 0) {
            suma += n;
            System.out.print("Introduce un número (0 para terminar): ");
            n = sc.nextDouble();
        }
        System.out.println("La suma es: " + suma);

        sc.close();
    }
}
