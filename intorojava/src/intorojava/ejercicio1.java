/*
Algoritmo para calcular el precio de un terreno
 */
package intorojava;

import java.util.Scanner;


public class ejercicio1 {
    
public static void main (String[]args){
    
float precio=0;
float largo;
float ancho;
float area;
double total;
Scanner leer = new Scanner(System.in);

System.out.print("dame lo largo del terrono");
largo=leer.nextFloat();
System.out.print("dame el ancho del terreno");
ancho=leer.nextFloat();
System.out.print("dame el precio por m2");
precio=leer.nextFloat();

area=ancho*largo;
precio=area*precio;

if (area>400){
total= (precio-(precio*0.10));

System.out.println("total a pagar con descuento:"+total);

}
else
System.out.println("total a pagar:n"+precio);
}
}

