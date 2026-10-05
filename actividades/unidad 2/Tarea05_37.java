import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_37  (Boletín 2, ejercicio 15)
 *
 * Enunciado: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
 */
public class Tarea05_37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int sumaEdades = 0, mayores18 = 0, altos = 0;
        double sumaAlturas = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Alumno " + i + " - edad: ");
            int edad = sc.nextInt();
            System.out.print("Alumno " + i + " - altura (m): ");
            double altura = sc.nextDouble();
            sumaEdades += edad;
            sumaAlturas += altura;
            if (edad > 18)
                mayores18++;
            if (altura > 1.75)
                altos++;
        }
        System.out.println("Edad media: " + (double) sumaEdades / 5);
        System.out.println("Estatura media: " + sumaAlturas / 5);
        System.out.println("Alumnos mayores de 18 años: " + mayores18);
        System.out.println("Alumnos que miden más de 1.75: " + altos);

        sc.close();
    }
}
