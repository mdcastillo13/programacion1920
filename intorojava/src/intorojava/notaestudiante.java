
 
package intorojava;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class notaestudiante {
     public static void main(String[] args){
         double nota;
         Scanner datos=new Scanner(System.in);
         System.out.println("ingresa nota");
         nota=datos.nextDouble();
         if (nota>0 && nota<10){
             if (nota>0 && nota<=4) {
                 System.out.println("insuficiente");
                 
             }else if (nota>=5 && nota<=6) {
                 System.out.println("suficiente");
             }else if (nota>7 && nota<=8) {
                 System.out.println("bien");
             }else if (nota>9 && nota<=10) {
                 System.out.println("notable");
                 
             }else {
                 System.out.println("ingrese un numero correcto");
             }
             
         }
         
     }
    
}
