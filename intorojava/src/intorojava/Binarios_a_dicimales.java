
package intorojava;

import java.util.Scanner;


public class Binarios_a_dicimales {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);

        int suma = 0;
        int bin = 0;

        System.out.println("Ingrese el numero de elementos");
        int n = datos.nextInt();
        int[] binario = new int[n];
        for (int i = binario.length - 1; i >= 0; i--) {
            System.out.println("Ingrese un valor");
            binario[i] = datos.nextInt();
        }

        for (int i = binario.length - 1; i >= 0; i--) {
            bin = (binario[i] * 2 ^ i);
            suma = suma + bin;

        }
        for (int i = binario.length - 1; i >= 0; i--) {
            System.out.print("El termino ingresado es: " + binario[i] + ":la poscion es:" + i);
            System.out.println("");
        }
        System.out.print("El numero decimal es:" + bin);
        System.out.print("El numero decimal es:" + suma);

    }
    }
        
   