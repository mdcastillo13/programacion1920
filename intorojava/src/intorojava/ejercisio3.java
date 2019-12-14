
package intorojava;

import java.util.Scanner;


public class ejercisio3 {
    public static void main(String[] args){
         Scanner datos=new Scanner(System.in);
         int numero;
         int sig;
         int numero1=0;
         int numero2=1;
         System.out.println("ingrese el numero ");
         numero= datos.nextInt();
         for (int i=1; i<= numero; i++);
         System.out.println(""+ numero1);
         sig= numero1+numero2;
         numero1=numero2;
         numero2=sig;
    }
}
