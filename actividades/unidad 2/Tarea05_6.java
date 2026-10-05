import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_6  (Boletín 1, ejercicio 6)
 *
 * Enunciado: Pedir dos números y decir si uno es múltiplo del otro.
 */
public class Tarea05_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce otro número: ");
        int n2 = sc.nextInt();
        if (n1 == 0 || n2 == 0) {
            System.out.println("No se puede dividir entre cero");
        } else if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("Uno es múltiplo del otro");
        } else {
            System.out.println("Ninguno es múltiplo del otro");
        }

        sc.close();
    }
}
