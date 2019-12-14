
package ejercisios_for;

import java.util.Scanner;

public class promedio {
    public static void main(String[] args){
         Scanner datos=new Scanner(System.in);
         int num = 0,na1,sum=0,pro=0,cont;
         System.out.println(" ingrese el numero de alunos");
         na1 = datos.nextInt();
         for (cont=1; cont<=na1;cont++){
             System.out.println("ingrese un numero ");
             num = datos.nextInt();
             sum=sum+num;
             
         }
         pro=sum/na1;
         System.out.println("el promedio es "+ pro);
         
         
   } 
}
    

