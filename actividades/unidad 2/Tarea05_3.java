import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_3  (Boletín 1, ejercicio 3)
 *
 * Enunciado: Pedir el radio de una circunferencia y calcular su longitud. L = 2 * PI * r.
 */
public class Tarea05_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el radio de una circunferencia: ");
        double r = sc.nextDouble();
        double l = 2 * Math.PI * r;
        System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);

        sc.close();
    }
}
