package a2261330037_practica7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_3_mc_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double l1, l2, l3;
        String resultado;

        System.out.println("Ingrese el lado 1:");
        l1 = Double.parseDouble(entrada.readLine());
        System.out.println("Ingrese el lado 2:");
        l2 = Double.parseDouble(entrada.readLine());
        System.out.println("Ingrese el lado 3:");
        l3 = Double.parseDouble(entrada.readLine());

        // Cuenta cuántas parejas de lados son iguales
        int coincidencias = 0;
        coincidencias += (l1 == l2) ? 1 : 0;
        coincidencias += (l1 == l3) ? 1 : 0;
        coincidencias += (l2 == l3) ? 1 : 0;

        switch (coincidencias) {
            case 3:
                resultado = "Triángulo Equilátero";
                break;
            case 1:
                resultado = "Triángulo Isósceles";
                break;
            default:
                resultado = "Triángulo Escaleno";
                break;
        }

        System.out.println(resultado);
    }
}