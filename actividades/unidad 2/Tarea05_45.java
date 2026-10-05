import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_45  (Boletín 2, ejercicio 23)
 *
 * Enunciado: Pedir 5 números e indicar si alguno es múltiplo de 3.
 */
public class Tarea05_45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        boolean hayMultiplo3 = false;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int n = sc.nextInt();
            if (n % 3 == 0)
                hayMultiplo3 = true;
        }
        if (hayMultiplo3)
            System.out.println("Hay al menos un múltiplo de 3");
        else
            System.out.println("No hay ningún múltiplo de 3");

        sc.close();
    }
}
