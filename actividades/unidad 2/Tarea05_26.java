import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_26  (Boletín 2, ejercicio 4)
 *
 * Enunciado: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */
public class Tarea05_26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int contador = 0;
        System.out.print("Introduce un número (negativo para terminar): ");
        double n = sc.nextDouble();
        while (n >= 0) {
            contador++;
            System.out.print("Introduce un número (negativo para terminar): ");
            n = sc.nextDouble();
        }
        System.out.println("Se han introducido " + contador + " número(s) (sin contar el negativo)");

        sc.close();
    }
}
