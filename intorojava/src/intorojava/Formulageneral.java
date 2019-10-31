/*
Deber de Formula General 
 */
package intorojava;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Formulageneral {
    public static void main(String[] args) {
        
        
       int a;
       int b;
       int c;
       double x1;
       double x2;
       
        Scanner comenzar= new Scanner (System.in);
        System.out.println(" ingrese la variable a: ");
        a=comenzar.nextInt();
        System.out.println("ingrese la variable b: "); 
        b=comenzar.nextInt();
        System.out.println("ingrese la variable c: ");
        c=comenzar.nextInt();
        
        x1=(-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("valor de x1 "+ x1);
        x2=(-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("valor de x2"+ x2 );
       
        
        
        
        
        
        
        
    }
}
