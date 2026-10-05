import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_14  (Boletín 1, ejercicio 14)
 *
 * Enunciado: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
 */
public class Tarea05_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce una nota (0 a 10): ");
        double nota = sc.nextDouble();
        if (nota < 0 || nota > 10)
            System.out.println("Nota no válida");
        else if (nota < 5)
            System.out.println("Insuficiente");
        else if (nota < 6)
            System.out.println("Suficiente");
        else if (nota < 7)
            System.out.println("Bien");
        else if (nota < 9)
            System.out.println("Notable");
        else
            System.out.println("Sobresaliente");

        sc.close();
    }
}
