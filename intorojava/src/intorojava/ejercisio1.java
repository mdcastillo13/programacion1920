
package intorojava;

import java.util.Scanner;


public class ejercisio1 {
     public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String personas[]=new String [3];
        int pos;
         for (int cont = 0; cont < personas.length; cont++) {
             System.out.println("iingresar el nombre de las personas");
             personas [cont] = datos.next();
             
             
             
         }
         for (int i = 0; i < personas. length;i++) {
             System.out.println("ingrese la posicion a consultar");
             pos = datos.nextInt();
             if(pos <=3)
             System.out.println(""+personas[pos]);
             
             
             
         }
        
        
    
   } 
}
