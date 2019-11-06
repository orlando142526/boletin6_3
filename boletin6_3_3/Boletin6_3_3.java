
package boletin6_3_3;

import java.util.Scanner;
public class Boletin6_3_3 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe un número");
        Scanner sc = new Scanner(System.in);
        Numero num = new Numero(sc.nextFloat());
        System.out.println(num.condicional());
    }
    
}
