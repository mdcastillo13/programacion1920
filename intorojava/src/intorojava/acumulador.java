/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intorojava;

/**
 *
 * @author LENOVO
 */
public class acumulador {
    public static void main(String[] args){
        System.out.println("trabajando con acomuladores");
        int contador = 1 ;
        int acumulador = 1;// va a acumular la suma de los numeros del 1 al 5
        while (contador <=5) {
          acumulador = acumulador * contador; 
           contador ++;
            
        }
        System.out.println("valor del contador: "+contador);
        System.out.println("valor del acumulador:"+acumulador);
        
    }
}
