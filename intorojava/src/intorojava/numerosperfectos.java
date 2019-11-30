package intorojava;

import java.util.Scanner;

public class numerosperfectos {

    public static void main(String[] args) {

        int num = 0;
        int div = 0;
        int acum;
            while (num<= 4) {
                num++;
                for (num = 1; num <= 10000; num++) {
                    acum = 0;
                    for(div = 1; div < num; div++) {
                        if (num % div==0) {
                            acum = acum + div;
                        }
                    }
                    if (num == acum) {
                        System.out.println("\t" + num);
                    }
                }
            
        }

    }

}
