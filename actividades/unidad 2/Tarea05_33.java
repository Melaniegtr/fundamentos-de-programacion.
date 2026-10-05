import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_33  (Boletín 2, ejercicio 11)
 *
 * Enunciado: Diseñar un programa que muestre el producto de los 10 primeros números impares.
 */
public class Tarea05_33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        long producto = 1;
        int impar = 1;
        for (int i = 1; i <= 10; i++) {
            producto *= impar;
            impar += 2;
        }
        System.out.println("El producto de los 10 primeros impares es: " + producto);

        sc.close();
    }
}
