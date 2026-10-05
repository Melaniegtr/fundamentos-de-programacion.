import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_34  (Boletín 2, ejercicio 12)
 *
 * Enunciado: Pedir un número y calcular su factorial.
 */
public class Tarea05_34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número entero (0 a 20): ");
        int n = sc.nextInt();
        if (n < 0 || n > 20) {
            System.out.println("Número fuera de rango");
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++)
                factorial *= i;
            System.out.println(n + "! = " + factorial);
        }

        sc.close();
    }
}
