package a2261330037_practica7;

import javax.swing.JOptionPane;

public class ejercicio_8_1_cuadrodialogo {
    public static void main(String[] args) {
        double tarifaBase, subtotalConIVA, descuento = 0, totalPagar;
        int tipoUsuario;

        tarifaBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la tarifa base:"));
        tipoUsuario = Integer.parseInt(JOptionPane.showInputDialog("Seleccione tipo de usuario:\n1. Profesor (20% desc)\n2. Alumno (10% desc)\n3. General (Sin desc)"));

        subtotalConIVA = tarifaBase * 1.16;

        if (tipoUsuario == 1) {
            descuento = subtotalConIVA * 0.20;
        } else {
            if (tipoUsuario == 2) {
                descuento = subtotalConIVA * 0.10;
            } else {
                descuento = 0;
            }
        }

        totalPagar = subtotalConIVA - descuento;

        String resultado = "Subtotal con IVA (16%): $" + subtotalConIVA + "\n" +
                           "Descuento aplicado: $" + descuento + "\n" +
                           "Total a pagar: $" + totalPagar;

        JOptionPane.showMessageDialog(null, resultado);
    }
}