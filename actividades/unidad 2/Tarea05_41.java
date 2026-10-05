import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_41  (Boletín 2, ejercicio 19)
 *
 * Enunciado: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
public class Tarea05_41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int aprobados = 0, condicionados = 0, suspensos = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Introduce la nota " + i + " (0 a 10): ");
            double nota = sc.nextDouble();
            if (nota >= 5)
                aprobados++;
            else if (nota == 4)
                condicionados++;
            else
                suspensos++;
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Condicionados (=4): " + condicionados);
        System.out.println("Suspensos: " + suspensos);

        sc.close();
    }
}
