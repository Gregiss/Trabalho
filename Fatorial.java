package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informeu um número");
        int number = leia.nextInt();
        int fatorial = 1;
        int percentual = 20;
        for(int i = number; i >= 1; i--){
            fatorial = fatorial * i;
        }
        fatorial = (fatorial * percentual) / 100;
        System.out.println(fatorial);
    }
    
}
