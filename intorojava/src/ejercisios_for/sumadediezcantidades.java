
package ejercisios_for;

import java.util.Scanner;


public class sumadediezcantidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int numero,suma=0,cont;
         for(cont=1; cont <=10; cont++){
             System.out.println("ingrese un numero");
             numero = sc.nextInt();
             
             suma=suma+numero;
             
    }
         System.out.println("la sum es "+ suma);
         
      }      
   }  

        
        
    

