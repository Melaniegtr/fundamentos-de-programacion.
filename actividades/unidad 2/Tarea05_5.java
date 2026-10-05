import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_5  (Boletín 1, ejercicio 5)
 *
 * Enunciado: Pedir un número e indicar si es positivo o negativo.
 */
public class Tarea05_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("Positivo");
        else if (num < 0)
            System.out.println("Negativo");
        else
            System.out.println("Es cero (ni positivo ni negativo)");

        sc.close();
    }
}
