import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_9  (Boletín 1, ejercicio 9)
 *
 * Enunciado: Pedir dos números y mostrarlos ordenados de mayor a menor.
 */
public class Tarea05_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int n2 = sc.nextInt();
        if (n1 >= n2)
            System.out.println(n1 + " " + n2);
        else
            System.out.println(n2 + " " + n1);

        sc.close();
    }
}
