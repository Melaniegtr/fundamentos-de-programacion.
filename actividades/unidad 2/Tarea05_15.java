import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_15  (Boletín 1, ejercicio 15)
 *
 * Enunciado: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
 */
public class Tarea05_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();
        if (anio >= 1 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30)
            System.out.println("La fecha es correcta");
        else
            System.out.println("La fecha es incorrecta");

        sc.close();
    }
}
