
package ejercisios_for;

import java.util.Scanner;


public class puente_2D {
    public static void main(String[] args){
         Scanner teclado=new Scanner(System.in);
         System.out.print("introdusca la distancia");
         int d= teclado.nextInt();
         System.out.print("introdcue el numero de columnas");
         int c = teclado.nextInt();
         System.out.print("ingrese el espacio");
         int e = teclado.nextInt();
         String acumulador ="";
         for(int i=0; i < d; i++){
             acumulador = acumulador +"_";
         }
         acumulador = acumulador + "\n";
         
         
         
   } 
}
