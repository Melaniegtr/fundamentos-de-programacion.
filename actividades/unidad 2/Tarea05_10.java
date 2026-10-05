import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_10  (Boletín 1, ejercicio 10)
 *
 * Enunciado: Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
public class Tarea05_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int c = sc.nextInt();
        int aux;
        if (a < b) { aux = a; a = b; b = aux; } // ahora a >= b
        if (b < c) { aux = b; b = c; c = aux; } // ahora c es el menor
        if (a < b) { aux = a; a = b; b = aux; } // ahora a >= b >= c
        System.out.println(a + " " + b + " " + c);

        sc.close();
    }
}
