package a2261330037_practica7;

import javax.swing.JOptionPane;

public class ejercicio_8_2_cuadrodialogo {
    public static void main(String[] args) {
        double l1, l2, l3;
        String resultado = "";

        l1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 1:"));
        l2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 2:"));
        l3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 3:"));

        if (l1 == l2 && l2 == l3) {
            resultado = "Triángulo Equilátero";
        }
        if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1)) {
            resultado = "Triángulo Isósceles";
        }
        if (l1 != l2 && l1 != l3 && l2 != l3) {
            resultado = "Triángulo Escaleno";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}