package a2261330037_practica8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio005 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
        double operando1, operando2, resultado;
        String cadena = "";

        System.out.println("Introduce el valor del operando 1 ");
        operando1 = Double.parseDouble(entrada.readLine());
        System.out.println("Introduce el valor del operando 2 ");
        operando2 = Double.parseDouble(entrada.readLine());

        System.out.println(" Menu de opciones de Operaciones Basicas \n 1.- Suma \n 2.- Resta \n 3.- Multiplicacion \n 4.- Division \n Elige una Opcion [1..2..3..4]\n");
        opcion = Integer.parseInt(entrada.readLine());

        switch (opcion) {
            case 1:
                resultado = operando1 + operando2;
                cadena = "el resultado de la suma es " + String.valueOf(resultado);
                break;
            case 2:
                resultado = operando1 - operando2;
                cadena = "el resultado de la resta es " + String.valueOf(resultado);
                break;
            case 3:
                resultado = operando1 * operando2;
                cadena = "el resultado de la multiplicacion es: " + String.valueOf(resultado);
                break;
            case 4:
                resultado = operando1 / operando2;
                cadena = "el resultado de la division es " + String.valueOf(resultado);
                break;
            default:
                cadena = "opcion no reconocida ";
                break;
        }

        System.out.println(cadena);
    }
}