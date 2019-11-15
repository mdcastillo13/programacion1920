
package intorojava;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class operadorswtich {
    public static void main (String[]args){
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("nota del alumno ");
        nota= entrada.nextInt();
     
        switch (nota){
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("insuficiente");
            break;
        case 5:
        case 6:
             System.out.println("suficiente ");
        case 7:
        case 8 :
            System.out.println("bien");
            break;
        case 9:
        case 10: 
            System.out.println("notable");
            break;
        default: 
            System.out.println("ingrese un numero correcto");
            
        }
        
      
              
    }
             
        
        
        
    }
    

