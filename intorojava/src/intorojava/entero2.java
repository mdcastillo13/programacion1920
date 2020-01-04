
package intorojava;

import java.util.Scanner;


public class entero2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Programa para crear y escribir en una matriz");
        System.out.println("ingrese el nmumero de filas de la matriz");
        int filas = teclado.nextInt();
        teclado.nextLine();
        //Creacion de una matriz vacia.
        String nombres [][]= new String [2][5]; //dimencion 2x5
        //vamos a colocar elementos dentro de nuesta matriz
        for (int fila = 0; fila < nombres.length; fila++) {
            int tam_cols = nombres [fila].length;
            for (int col = 0; col < tam_cols; col++) {//recorre columnas
                System.out.println("ingrese un valor");
                String valor = teclado.nextLine();
                nombres[fila][col] = valor;
                
                
            }
            
        }
        System.out.println("lectura de los elementos de la matriz");
        //vamos a recorrer la matriz, filas y columnas.
        for (int fila = 0; fila < nombres.length; fila++) {
            int tam_cols =nombres [fila].length;
            for (int col = 0; col < tam_cols; col++) {//recorre columnas
                System.out.print(nombres[fila][col]+ "\t");
                
                
            }
            System.out.println("");
            
        }
    }
    
}
