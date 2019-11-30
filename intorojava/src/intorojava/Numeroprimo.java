/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intorojava;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Numeroprimo {
     public static void main(String[] args){
         Scanner entrada = new Scanner (System.in);
         System.out.println("ingrese un nuero para verificarlo si es primo o no ");
         int num = entrada.nextInt();
         int cont = num;
         int acumulador =0;
         while (cont >=1){
             if ( num % cont ==0){
                 acumulador ++;// solo sirve para incrementar en uno 
                 
             }
             cont --;//decrementar en cada ciclo el valor de cont en uno 
         }
         if (acumulador==2){
             System.out.println("");
             
         }else{
             System.out.println("el numero"+ num +"no es primo");
         }

     }
    
}
