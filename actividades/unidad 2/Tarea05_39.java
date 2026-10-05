import java.util.Locale;
import java.util.Scanner;

/**
 * Tarea05_39  (Boletín 2, ejercicio 17)
 *
 * Enunciado: Una empresa que vende desinfectantes necesita gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide, de 5 facturas introducidas: facturación total, cantidad en litros vendidos del artículo 1 y cuántas facturas se emitieron de más de 600 €.
 */
public class Tarea05_39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double facturacionTotal = 0;
        double litrosArticulo1 = 0;
        int facturasMas600 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura " + i);
            System.out.print("  Código del artículo: ");
            int codigo = sc.nextInt();
            System.out.print("  Litros vendidos: ");
            double litros = sc.nextDouble();
            System.out.print("  Precio por litro (€): ");
            double precio = sc.nextDouble();

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
