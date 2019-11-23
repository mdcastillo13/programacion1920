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
public class ejercisio_while {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numero;
        int cont=1;
        String asterisco="";
        System.out.println("ingrese un numero ");
        numero=datos.nextInt();
        while(cont<=numero){
            asterisco = asterisco+"o";
            System.out.println(asterisco);
            cont ++;
            
        }
               
        
    }
    
    
}
