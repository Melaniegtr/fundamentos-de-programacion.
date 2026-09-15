package a2261330037_practica7;

import javax.swing.JOptionPane;

public class ejercicio_8_3_joptionpane {
    public static void main(String[] args) {
        double l1, l2, l3;
        String resultado = "Triángulo Escaleno";

        l1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 1:"));
        l2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 2:"));
        l3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 3:"));

        if (l1 == l2) {
            resultado = "Triángulo Isósceles";
        }
        if (l1 == l3) {
            resultado = "Triángulo Isósceles";
        }
        if (l2 == l3) {
            resultado = "Triángulo Isósceles";
        }

        if (l1 == l2) {
            if (l2 == l3) {
                resultado = "Triángulo Equilátero";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}