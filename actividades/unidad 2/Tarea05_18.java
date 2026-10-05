import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_18  (Boletín 1, ejercicio 18)
 *
 * Enunciado: Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días).
 */
public class Tarea05_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        int diasMes;
        if (mes == 2)
            diasMes = 28;
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            diasMes = 30;
        else
            diasMes = 31;

        dia++;
        if (dia > diasMes) {
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
