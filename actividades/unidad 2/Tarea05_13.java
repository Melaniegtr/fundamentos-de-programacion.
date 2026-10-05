import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_13  (Boletín 1, ejercicio 13)
 *
 * Enunciado: Pedir un número entre 0 y 9.999 y decir si es capicúa.
 */
public class Tarea05_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número entre 0 y 9999: ");
        int n = sc.nextInt();
        if (n < 0 || n > 9999) {
            System.out.println("Número fuera de rango");
        } else {
            int alReves;
            if (n < 10) alReves = n;
            else if (n < 100) alReves = (n % 10) * 10 + n / 10;
            else if (n < 1000) alReves = (n % 10) * 100 + ((n / 10) % 10) * 10 + n / 100;
            else alReves = (n % 10) * 1000 + ((n / 10) % 10) * 100 + ((n / 100) % 10) * 10 + n / 1000;

            if (alReves == n)
                System.out.println("El número " + n + " es capicúa");
            else
                System.out.println("El número " + n + " no es capicúa");
        }

        sc.close();
    }
}
