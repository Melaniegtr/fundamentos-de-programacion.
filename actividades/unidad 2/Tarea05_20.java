import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_20  (Boletín 1, ejercicio 20)
 *
 * Enunciado: Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
 */
public class Tarea05_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce la hora (0-23): ");
        int h = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int m = sc.nextInt();
        System.out.print("Introduce los segundos (0-59): ");
        int s = sc.nextInt();

        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Hora no válida");
        } else {
            s++;
            if (s == 60) {
                s = 0;
                m++;
                if (m == 60) {
                    m = 0;
                    h++;
                    if (h == 24)
                        h = 0;
                }
            }
            System.out.printf("Un segundo después: %02d:%02d:%02d%n", h, m, s);
        }

        sc.close();
    }
}
