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
public class decirsisoniguales {
     public static void main(String[] args){
         Scanner datos=new Scanner(System.in);
         int n1;
         int n2;
         System.out.println("ingresar n1");
         n1=datos.nextInt();
         System.out.println("ingresar n2");
         n2=datos.nextInt();
         if (n1==n2) {
             System.out.println("los numeros son iguales");    
         }else{
             System.out.println("no son iguales");
         }
                 
                 }
         
            
     }
    

