import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_44  (Boletín 2, ejercicio 22)
 *
 * Enunciado: Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */
public class Tarea05_44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        boolean haySuspenso = false;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la calificación " + i + " (0 a 10): ");
            double nota = sc.nextDouble();
            if (nota < 5)
                haySuspenso = true;
        }
        if (haySuspenso)
            System.out.println("Hay al menos un suspenso");
        else
            System.out.println("No hay ningún suspenso");

        sc.close();
    }
}
