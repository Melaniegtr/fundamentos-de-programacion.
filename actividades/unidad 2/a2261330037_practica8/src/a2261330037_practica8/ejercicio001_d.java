package a2261330037_practica8;

import java.util.Scanner;

public class ejercicio001_d {
    public static void main(String[] args) {
        int num;
        int unidades, decenas;
        Scanner entrada = new Scanner(System.in);
        String cadena="";
        System.out.print("Introduzca un número (0 a 99): ");
        num=entrada.nextInt();
        unidades = num% 10;
        decenas = num/10;
        switch(decenas){
            case 0: cadena=""; break;
            case 1: cadena="diez"; break;
            case 2: cadena="veinte"; break;
            case 3: cadena="treinta"; break;
            case 4: cadena="cuarenta"; break;
            case 5: cadena="cincuente"; break;
            case 6: cadena="sesente"; break;
            case 7: cadena="setenta"; break;
            case 8: cadena="ochenta"; break;
            case 9: cadena="noventa"; break;
        }
        switch(unidades){
            case 0 :cadena = cadena + "";
            break;
            case 1: if (decenas==1)
            cadena = "once";
            else if (decenas>1)
            cadena = cadena+" y uno";
            else cadena = "uno";
            break;
            case 2:if (decenas==1)
            cadena = "doce";
            else if (decenas>1)
            cadena = cadena+" y dos";
            else cadena = "dos";
            break;
            case 3:if (decenas==1)
            cadena="trece";
            else if (decenas>1)
            cadena = cadena+" y tres";
            else cadena = "tres";
            break;
            case 4:if (decenas==1)
            cadena="catorce";
            else if (decenas>1)
            cadena = cadena+" y cuatro";
            else cadena = "cuatro";
            break;
            case 5:if (decenas==1)
            cadena = "quince";
            else if (decenas>1)
            cadena = cadena+" y cinco";
            else cadena = "cinco";
            break;
            case 6:if (decenas>1)
            cadena = cadena+" y seis";
            else cadena = "seis";
            break;
            case 7:if (decenas>1)
            cadena = cadena+" y siete";
            else cadena = "siete";
            break;
            case 8: if (decenas>1)
            cadena = cadena+" y ocho";
            else cadena = "ocho";
            break;
            case 9:if (decenas > 1)
            cadena = cadena+" y nueve";
            else cadena = "nueve";
            break;
        }
        System.out.println(cadena);
    }
}