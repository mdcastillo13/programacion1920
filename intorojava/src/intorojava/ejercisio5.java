
package intorojava;

import java.util.Scanner;


public class ejercisio5 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String nombre [] = new String[1];
        int produccion[] = new int[4];
        int estacion[] = new int[4];
        for (int cont = 0; cont < nombre.length; cont++) {
            System.out.println("Ingrese la estacion mas productiva(00)");
            estacion[cont] =  Integer.parseInt(datos.nextLine());
            System.out.println("Ingrede el nombre del encargado de estacion: ");
            nombre[cont] = datos.nextLine();
            System.out.println("Ingrese la cantidad producida:(0000)");
            produccion[cont] = Integer.parseInt(datos.nextLine());    
        }for (int cont = 0; cont < nombre.length; cont++) {
            System.out.println("           ANALISIS DE PRODUCCION");
            System.out.println("================================================");
            System.out.println("EDTACION MAS PRODUCTIVA: ---> " + estacion[cont]);
            System.out.println("ENCARGADO DE LA ESTACION:---> "+ nombre[cont]);
            System.out.println("CANTIDAD PRODUCIDA       ---> "+ produccion[cont]);
        }
    }
}
        
    

