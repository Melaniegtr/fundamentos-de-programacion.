import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_40  (Boletín 2, ejercicio 18)
 *
 * Enunciado: Igual que el anterior pero suponiendo que no se introduce el precio por litro. Solo existen tres productos con precios: 1 - 0,6 €/litro, 2 - 3 €/litro y 3 - 1,25 €/litro.
 */
public class Tarea05_40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double facturacionTotal = 0;
        double litrosArticulo1 = 0;
        int facturasMas600 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura " + i);
            System.out.print("  Código del artículo (1, 2 o 3): ");
            int codigo = sc.nextInt();
            while (codigo < 1 || codigo > 3) {
                System.out.print("  Código no válido. Introduce 1, 2 o 3: ");
                codigo = sc.nextInt();
            }
            System.out.print("  Litros vendidos: ");
            double litros = sc.nextDouble();

            double precio;
            if (codigo == 1)
                precio = 0.6;
            else if (codigo == 2)
                precio = 3;
            else
                precio = 1.25;

            double importe = litros * precio;
            facturacionTotal += importe;
            if (codigo == 1)
                litrosArticulo1 += litros;
            if (importe > 600)
                facturasMas600++;
        }
        System.out.println("Facturación total: " + facturacionTotal + " €");
        System.out.println("Litros vendidos del artículo 1: " + litrosArticulo1);
        System.out.println("Facturas de más de 600 €: " + facturasMas600);

        sc.close();
    }
}
