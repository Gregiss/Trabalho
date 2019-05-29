package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informeu um número");
        int number = leia.nextInt();
        int numeroCalculo = 1;
        int menor = number;
        for(int i = 1; i <= number; i++){
            numeroCalculo = numeroCalculo * i;
        }
        System.out.print(number);
        for(int i = 1; i <= number; i++){
            menor--;
            System.out.print(" * " + menor + " ");
        }
        System.out.print("= " + numeroCalculo + "\n");
    }
    
}
