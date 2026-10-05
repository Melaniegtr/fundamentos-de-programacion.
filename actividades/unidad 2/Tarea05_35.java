import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_35  (Boletín 2, ejercicio 13)
 *
 * Enunciado: Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
 */
public class Tarea05_35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double sumaPos = 0, sumaNeg = 0;
        int cantPos = 0, cantNeg = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double n = sc.nextDouble();
            if (n > 0) {
                sumaPos += n;
                cantPos++;
            } else if (n < 0) {
                sumaNeg += n;
                cantNeg++;
            } else {
                ceros++;
            }
        }
        if (cantPos > 0)
            System.out.println("Media de los positivos: " + sumaPos / cantPos);
        else
            System.out.println("No hay números positivos");
        if (cantNeg > 0)
            System.out.println("Media de los negativos: " + sumaNeg / cantNeg);
        else
            System.out.println("No hay números negativos");
        System.out.println("Cantidad de ceros: " + ceros);

        sc.close();
    }
}
