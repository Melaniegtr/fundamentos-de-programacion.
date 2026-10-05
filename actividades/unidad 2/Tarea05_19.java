import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_19  (Boletín 1, ejercicio 19)
 *
 * Enunciado: Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.
 */
public class Tarea05_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Primera fecha");
        System.out.print("Día: ");
        int d1 = sc.nextInt();
        System.out.print("Mes: ");
        int m1 = sc.nextInt();
        System.out.print("Año: ");
        int a1 = sc.nextInt();

        System.out.println("Segunda fecha");
        System.out.print("Día: ");
        int d2 = sc.nextInt();
        System.out.print("Mes: ");
        int m2 = sc.nextInt();
        System.out.print("Año: ");
        int a2 = sc.nextInt();

        // Cada año tiene 12 * 30 = 360 días
        int dias1 = a1 * 360 + m1 * 30 + d1;
        int dias2 = a2 * 360 + m2 * 30 + d2;
        int diferencia = dias1 - dias2;
        if (diferencia < 0)
            diferencia = -diferencia;
        System.out.println("Hay " + diferencia + " días de diferencia");

        sc.close();
    }
}
