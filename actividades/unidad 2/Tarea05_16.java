import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_16  (Boletín 1, ejercicio 16)
 *
 * Enunciado: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.
 */
public class Tarea05_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce el día: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        boolean correcta = false;
        if (anio >= 1 && mes >= 1 && mes <= 12) {
            int diasMes;
            if (mes == 2)
                diasMes = 28;
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
                diasMes = 30;
            else
                diasMes = 31;
            correcta = dia >= 1 && dia <= diasMes;
        }
        if (correcta)
            System.out.println("La fecha es correcta");
        else
            System.out.println("La fecha es incorrecta");

        sc.close();
    }
}
