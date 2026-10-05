import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_43  (Boletín 2, ejercicio 21)
 *
 * Enunciado: Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
 */
public class Tarea05_43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        boolean hayNegativo = false;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double n = sc.nextDouble();
            if (n < 0)
                hayNegativo = true;
        }
        if (hayNegativo)
            System.out.println("Se ha introducido algún número negativo");
        else
            System.out.println("No se ha introducido ningún número negativo");

        sc.close();
    }
}
