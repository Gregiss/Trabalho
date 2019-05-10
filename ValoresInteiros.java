
package valoresinteiros;

import java.util.Scanner;

public class ValoresInteiros {

   
    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
     System.out.println("Qual valor de N?");
     int n = leia.nextInt();
     System.out.println("-------------------");
     for(int i = 1; i <= n; i++){
         System.out.println(i);
     }
    }
    
}
