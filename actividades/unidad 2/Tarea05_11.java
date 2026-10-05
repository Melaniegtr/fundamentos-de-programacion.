import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_11  (Boletín 1, ejercicio 11)
 *
 * Enunciado: Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.
 */
public class Tarea05_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número entre 0 y 9999: ");
        int n = sc.nextInt();
        if (n < 0 || n > 9999) {
            System.out.println("Número fuera de rango");
        } else {
            int cifras;
            if (n < 10) cifras = 1;
            else if (n < 100) cifras = 2;
            else if (n < 1000) cifras = 3;
            else cifras = 4;
            System.out.println("El número " + n + " tiene " + cifras + " cifra(s)");
        }

        sc.close();
    }
}
