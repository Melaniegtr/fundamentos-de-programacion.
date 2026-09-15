package a2261330037_practica7;

import java.util.Scanner;

public class ejercicio_8_2_mc_scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double l1, l2, l3;
        String resultado = "Triángulo Escaleno";

        System.out.println("Ingrese el lado 1:");
        l1 = entrada.nextDouble();
        System.out.println("Ingrese el lado 2:");
        l2 = entrada.nextDouble();
        System.out.println("Ingrese el lado 3:");
        l3 = entrada.nextDouble();

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