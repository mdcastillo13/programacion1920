

package intorojava;

import java.util.Scanner;

public class multiplicacionconsumas {
    public static void main(String[] args) {
         Scanner datos = new Scanner(System.in);
        int numero1;
        int numero2;
        int cont=1;
        int cons = 0;
        System.out.println("ingrese el primer numero ");
        numero1 = datos.nextInt();
        System.out.println("ingresar segundo numero ");
        numero2 = datos.nextInt();
        System.out.println("==========================");
        while(cont <= numero1){
            cons = cons + numero2;
            System.out.println(""+cont);
            cont++;
            
        }
        System.out.println("la suma es "+cons);
        
         
         
       
    }
    
}
