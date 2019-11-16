

package intorojava;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class tablademultiplicar {
    public static void main(String[] args){
        System.out.println("GENERACION DE TABLA DE MULTIPLICAR ");
        System.out.println("INGRESA EL NUMERO PARA GENERAR TABLA DE MULTIPLICAR");
        Scanner entrada = new Scanner (System.in);
        int numero =entrada.nextInt();
        int cnt = 1 ;
        while (cnt <=10){ 
            System.out.println(numero + "x"+cnt+"="+ numero*cnt );
            cnt++;
           
        }
        
    }
    
}
