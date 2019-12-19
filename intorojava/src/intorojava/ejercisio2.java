
package intorojava;

import java.util.Scanner;


public class ejercisio2 {
     public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int dia[] = new int [3];
        int mayor_venta=0;
        int menor_venta=0;
         for (int cont = 0; cont < dia.length; cont++) {
             System.out.println("ingrese su cantidad de venta del dia de hoy");
             dia[cont]= datos.nextInt();
             if (dia[cont]> mayor_venta){
                 mayor_venta = dia [cont];
                 
             }
             if (dia[cont]< menor_venta){
                 menor_venta = dia [cont];
                 
             }
             
         }
         System.out.println("El mayor fue del "+ mayor_venta);
         System.out.println("el mayor fue del "+ menor_venta);
  }  
}
