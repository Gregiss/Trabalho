package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informeu um número\n -------------------------");
        long number = leia.nextInt();
        long numeroCalculo = 1;
        long percentual = 20;
        for(long i = 1; i <= number; i++){
            numeroCalculo = numeroCalculo * i;
        }
        System.out.print(number);
        for(long i = number; i >= 1; i--){
            System.out.print(" * " + i + " ");
        }
        System.out.print("\nFatorial: " + numeroCalculo + "\n");
        numeroCalculo = (numeroCalculo * percentual) / 100;
        System.out.print(percentual + "%: " + numeroCalculo + "\n");
    }

 }
