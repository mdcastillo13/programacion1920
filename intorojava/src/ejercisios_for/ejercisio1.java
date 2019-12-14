
package ejercisios_for;

import java.util.Scanner;


public class ejercisio1 {
    public static void main(String[] args){
         Scanner datos=new Scanner(System.in);
         int num=5;
         int acumulador_fact=1;
         for(int cnt = num; cnt>=1; cnt--){
             acumulador_fact*= cnt;
         }
             System.out.println("factorial ="+ acumulador_fact);
    }
}
