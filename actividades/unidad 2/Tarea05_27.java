import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_27  (Boletín 2, ejercicio 5)
 *
 * Enunciado: Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando "mayor" o "menor" según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.
 */
public class Tarea05_27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Jugador 1, introduce el número a adivinar: ");
        int secreto = sc.nextInt();
        // Se dejan líneas en blanco para que el jugador 2 no lo vea
        for (int i = 0; i < 30; i++)
            System.out.println();

        System.out.print("Jugador 2, adivina el número: ");
        int intento = sc.nextInt();
        int intentos = 1;
        while (intento != secreto) {
            if (intento > secreto)
                System.out.println("El número es menor");
            else
                System.out.println("El número es mayor");
            System.out.print("Prueba otra vez: ");
            intento = sc.nextInt();
            intentos++;
        }
        System.out.println("¡Acertaste en " + intentos + " intento(s)!");

        sc.close();
    }
}
