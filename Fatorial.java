package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informeu um número");
        long number = leia.nextInt();
        long fatorial = 1;
        long percentual = 20;
        for(long i = number; i >= 1; i--){
            fatorial = fatorial * i;
        }
        fatorial = (fatorial * percentual) / 100;
        System.out.println(fatorial);
    }
    
}
