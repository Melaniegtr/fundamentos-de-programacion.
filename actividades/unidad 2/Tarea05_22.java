import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_22  (Boletín 1, ejercicio 22)
 *
 * Enunciado: Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
 */
public class Tarea05_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Introduce un número de 0 a 99: ");
        int n = sc.nextInt();
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince",
                "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
        String[] veintes = {"veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro",
                "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve"};
        String[] decenas = {"", "", "", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};

        if (n < 0 || n > 99) {
            System.out.println("Número fuera de rango");
        } else if (n < 10) {
            System.out.println(unidades[n]);
        } else if (n < 20) {
            System.out.println(especiales[n - 10]);
        } else if (n < 30) {
            System.out.println(veintes[n - 20]);
        } else if (n % 10 == 0) {
            System.out.println(decenas[n / 10]);
        } else {
            System.out.println(decenas[n / 10] + " y " + unidades[n % 10]);
        }

        sc.close();
    }
}
