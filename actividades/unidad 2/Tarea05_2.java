import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_2  (Boletín 1, ejercicio 2)
 *
 * Enunciado: Pedir el radio de un círculo y calcular su área. A = PI * r^2.
 */
public class Tarea05_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el radio de un círculo: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("El área de un círculo de radio " + r + " es: " + area);

        sc.close();
    }
}
