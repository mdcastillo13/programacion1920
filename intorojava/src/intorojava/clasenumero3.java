/*
   esta clase voy a realizar la operacion del area del  triangulo
 
*/
package intorojava;

import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class clasenumero3 {
 public static void main (String[]args){
     
 
    double altura;
    double base;
    double area;
    
    System.out.println("ingresa la altura");
    Scanner comenzar= new Scanner (System.in);
    altura =comenzar.nextDouble();
    
     System.out.println("ingrese la base");
     Scanner comenzar1=new Scanner (System.in);
     base= comenzar1.nextDouble();
     
     area=(base*altura)/2;
     
     System.out.println("El area del triangulo es "+ area);
     
    
   
            
            
            
            }           
    
}
