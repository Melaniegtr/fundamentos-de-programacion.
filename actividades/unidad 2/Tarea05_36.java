import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_36  (Boletín 2, ejercicio 14)
 *
 * Enunciado: Pedir 10 sueldos. Mostrar su suma y cuántos hay mayores de 1000 €.
 */
public class Tarea05_36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double suma = 0;
        int mayores = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el sueldo " + i + ": ");
            double sueldo = sc.nextDouble();
            suma += sueldo;
            if (sueldo > 1000)
                mayores++;
        }
        System.out.println("Suma de los sueldos: " + suma + " €");
        System.out.println("Sueldos mayores de 1000 €: " + mayores);

        sc.close();
    }
}
