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
public class ejercicio {

    public static void main(String args[]) {
        int n = 10;
        int cont = 1;
        String resul = "";
        String operador = "";        
        while (cont <= n) {
            resul += operador + "1/" + cont;
            if (cont == 1) {
                operador = " + ";
            }
            cont+=1;
        }
        System.out.println(resul);
    }
}
