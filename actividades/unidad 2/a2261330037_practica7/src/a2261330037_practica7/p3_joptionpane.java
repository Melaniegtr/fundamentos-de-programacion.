package a2261330037_practica7;

import javax.swing.JOptionPane;

public class p3_joptionpane {
    public static void main(String[] args) {
        int num;
        String entrada;
        String salida;
        
        entrada = JOptionPane.showInputDialog("Introduce un Numero");
        num = Integer.parseInt(entrada);
        
        salida = "";
        if ((num > 0) && (num % 2 == 0)) {
            salida = "Es Positivo y Par";
        }
        if ((num > 0) && (num % 2 != 0)) {
            salida = "Es Positivo e Impar";
        }
        if ((num < 0) && (num % 2 == 0)) {
            salida = "Es Negativo y Par";
        }
        if ((num < 0) && (num % 2 != 0)) {
            salida = "Es Negativo e ImPar";
        }
        
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
    }
}