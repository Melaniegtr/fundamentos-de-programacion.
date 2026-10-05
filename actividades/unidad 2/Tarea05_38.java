import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_38  (Boletín 2, ejercicio 16)
 *
 * Enunciado: Pedir un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.
 */
public class Tarea05_38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número entre 0 y 10: ");
        int n = sc.nextInt();
        while (n < 0 || n > 10) {
            System.out.print("Debe estar entre 0 y 10. Inténtalo de nuevo: ");
            n = sc.nextInt();
        }
        for (int i = 0; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + n * i);

        sc.close();
    }
}
