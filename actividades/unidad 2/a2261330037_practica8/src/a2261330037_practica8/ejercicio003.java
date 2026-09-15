package a2261330037_practica8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio003 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String opc = "";
        String cadena = "";

        System.out.println(" Menu de Opciones \n 1.-Opcion 1 \n 2.-Opcion 2 \n 3.-Opcion 3 \n 4.-Opcion 4 \n Eliga una opcion [1..4] --> ");
        opc = entrada.readLine();

        switch (opc) {
            case "1": cadena = "Elegiste la opcion 1"; break;
            case "2": cadena = "Elegiste la opcion 2"; break;
            case "3": cadena = "Elegiste la opcion 3"; break;
            case "4": cadena = "Elegiste la opcion 4"; break;
            default: cadena = "Elegiste una opcion que no existe"; break;
        }

        System.out.println("\n" + cadena);
    }
}