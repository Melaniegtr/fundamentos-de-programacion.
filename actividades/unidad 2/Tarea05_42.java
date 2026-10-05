import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_42  (Boletín 2, ejercicio 20)
 *
 * Enunciado: Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
 */
public class Tarea05_42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("¿Cuántos sueldos vas a introducir? ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("N debe ser mayor que cero");
        } else {
            System.out.print("Introduce el sueldo 1: ");
            double maximo = sc.nextDouble();
            for (int i = 2; i <= n; i++) {
                System.out.print("Introduce el sueldo " + i + ": ");
                double sueldo = sc.nextDouble();
                if (sueldo > maximo)
                    maximo = sueldo;
            }
            System.out.println("El sueldo máximo es: " + maximo);
        }

        sc.close();
    }
}
