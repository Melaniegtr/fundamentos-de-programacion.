import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_29  (Boletín 2, ejercicio 7)
 *
 * Enunciado: Pedir números hasta que se introduzca uno negativo, y calcular la media.
 */
public class Tarea05_29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double suma = 0;
        int contador = 0;
        System.out.print("Introduce un número (negativo para terminar): ");
        double n = sc.nextDouble();
        while (n >= 0) {
            suma += n;
            contador++;
            System.out.print("Introduce un número (negativo para terminar): ");
            n = sc.nextDouble();
        }
        if (contador == 0)
            System.out.println("No se introdujo ningún número, no hay media");
        else
            System.out.println("La media es: " + suma / contador);

        sc.close();
    }
}
