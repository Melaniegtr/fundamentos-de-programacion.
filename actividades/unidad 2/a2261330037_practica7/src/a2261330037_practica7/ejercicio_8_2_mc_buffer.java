package a2261330037_practica7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_2_mc_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double l1, l2, l3;
        String resultado = "Triángulo Escaleno";

        System.out.println("Ingrese el lado 1:");
        l1 = Double.parseDouble(entrada.readLine());
        System.out.println("Ingrese el lado 2:");
        l2 = Double.parseDouble(entrada.readLine());
        System.out.println("Ingrese el lado 3:");
        l3 = Double.parseDouble(entrada.readLine());

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

        System.out.println(resultado);
    }
}