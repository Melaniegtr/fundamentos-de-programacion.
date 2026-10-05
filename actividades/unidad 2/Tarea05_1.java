import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_1  (Boletín 1, ejercicio 1)
 *
 * Enunciado: Pedir los coeficientes de una ecuación de 2º grado y mostrar sus soluciones reales. Si no existen, indicarlo.
 */
public class Tarea05_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduzca primer coeficiente (a): ");
        double a = sc.nextDouble();
        System.out.print("Introduzca segundo coeficiente (b): ");
        double b = sc.nextDouble();
        System.out.print("Introduzca tercer coeficiente (c): ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Error: el coeficiente a debe ser diferente de cero");
        } else {
            double d = b * b - 4 * a * c; // discriminante
            if (d < 0) {
                System.out.println("No existen soluciones reales");
            } else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Solución 1: " + x1);
                System.out.println("Solución 2: " + x2);
            }
        }

        sc.close();
    }
}
