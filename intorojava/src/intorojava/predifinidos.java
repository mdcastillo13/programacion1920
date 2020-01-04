
package intorojava;


public class predifinidos {
    public static void main(String[] args){
        //Declaracion de matriz con valores conocidos
        String nombres[][]= {
                           {"Alex","Isa", "Dody", "Mario", "Luis",},
                           { "Genesis","Diego","Ramiro","Anthony","Ariel"}
        };
        //System.out.println(nombres[0][2]);
        //System.out.println(nombres[1][4]);
        System.out.println(nombres.length);
        //vamos a recorrer la matriz con ayuda de 2 indices
        for (int fila = 0; fila< 5 ;fila++) {//recorremos las filas
            //int tam_cola= nombres[fila]. length;//obtenemos el # de columnas de la fila
            for (int col = 0; col < 2 ; col++) {//recorremos columnas
                System.out.print(nombres[col][fila] +"\t");
                
            }
            System.out.println("");
            
        }
    }
}
        
    
    

