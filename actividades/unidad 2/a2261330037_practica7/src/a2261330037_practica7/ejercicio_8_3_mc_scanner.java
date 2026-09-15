package a2261330037_practica7;

import java.util.Scanner;

public class ejercicio_8_3_mc_scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double l1, l2, l3;
        String resultado;

        System.out.println("Ingrese el lado 1:");
        l1 = entrada.nextDouble();
        System.out.println("Ingrese el lado 2:");
        l2 = entrada.nextDouble();
        System.out.println("Ingrese el lado 3:");
        l3 = entrada.nextDouble();

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