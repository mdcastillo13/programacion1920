

package intorojava;
import java.util.Scanner;


public class numerosperfectos {
        public static void main(String[] args) {

        int i = 0;
        int j = 0;
        int max = 10000;
        int acum;
        while (i <=max){
            i++;
            for(i = 1; i <= max; i++ ) {
                acum = 0;
                for (j = 1; j< i; j++) {
                    if (i % j == 0) {
                        acum = acum + j;
                     }
                }
                if (i == acum){
                    System.out.println("\t"+i);
                }
            }
        }
    }
        
}       


    
    

