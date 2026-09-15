package a2261330037_practica7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_1_mc_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double tarifaBase, subtotalConIVA, descuento = 0, totalPagar;
        int tipoUsuario;

        System.out.println("Ingrese el monto de la tarifa base:");
        tarifaBase = Double.parseDouble(entrada.readLine());

        System.out.println("Seleccione tipo de usuario (1: Profesor, 2: Alumno, 3: General):");
        tipoUsuario = Integer.parseInt(entrada.readLine());

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

        System.out.println("Subtotal con IVA (16%): $" + subtotalConIVA);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}