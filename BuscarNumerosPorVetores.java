package vetor;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] a = new int[11];
        int x;
        int[] m = new int[11];
        int[] calculoM = new int[11];
        int total = (a.length - 1);
        for(int i = 0; i < a.length;i++){
            System.out.println("Informe um número");
            x = leia.nextInt();
            System.out.println("Informe mais um número");
            a[i] = leia.nextInt();
            calculoM[i] = a[i] * x;
            System.out.println(calculoM[i]);
            if(i >= total){
                System.out.println("Todos os resultados da soma");
                for(int b = 0; b < a.length; b++){
                    System.out.println("Soma " + (b + 1) + "|" + calculoM[i]);
                }
                break; 
            }
        }
    }
    
}
