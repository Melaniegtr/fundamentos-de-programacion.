import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_23  (Boletín 2, ejercicio 1)
 *
 * Enunciado: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 */
public class Tarea05_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número (negativo para terminar): ");
        double n = sc.nextDouble();
        while (n >= 0) {
            System.out.println("Su cuadrado es: " + n * n);
            System.out.print("Introduce un número (negativo para terminar): ");
            n = sc.nextDouble();
        }
        System.out.println("Fin del programa");

        sc.close();
    }
}
