package vetor;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] a = new int[10];
        int x = 0;
        int[] m = new int[10];
        int[] calculoM = new int[10];
        int total = (a.length - 1);
        for(int i = 0; i < a.length;i++){
            System.out.println("Informe o " + (i+1) + "º número");
            a[i] = leia.nextInt();
        }
        for(int i = 0; i < a.length;i++){
            if(i == 0){
            System.out.println("Informe mais um número");
            x = leia.nextInt();
            }
            calculoM[i] = (a[i] * x);
            if(i >= total){
                System.out.println("Todos os resultados da multiplicacao");
                for(int b = 0; b < a.length; b++){
                    System.out.println("Soma " + (b + 1)  + "|" + calculoM[b]);
                }
                break; 
            }
        }
    }
    }
    

