import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_17  (Boletín 1, ejercicio 17)
 *
 * Enunciado: Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. Suponer que todos los meses tienen 30 días.
 */
public class Tarea05_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        dia++;
        if (dia > 30) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
        System.out.println("El día siguiente es: " + dia + "/" + mes + "/" + anio);

        sc.close();
    }
}
