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
public class ejercisios_while {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String usuario = "mdtcastillo1234";
        String password ="mario123";
        boolean autenticacion = false;
        while(!autenticacion){
            System.out.println("AUNTENTIQUESE CON SU USUARIO Y CLAVE");
            String us = datos.next();
            String pass = datos .next();
            if(usuario.equals(us)&& password.equals(pass)){
                System.out.println("BIENVENIDO AL SISTEMA ");
                autenticacion= true;
             }else{
                System.out.println("autenticacion incorrecta t");
                
            
                
                    
                
            }
            
            
        }
        
       
      
        
        
        
     }
    
}
