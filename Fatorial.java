package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informeu um número\n -------------------------");
        long number = leia.nextInt();
        long numeroCalculo = 1;
        long menor = number;
        long percentual = 20;
        for(long i = 1; i <= number; i++){
            numeroCalculo = numeroCalculo * i;
        }
        System.out.print(number);
        for(int i = 1; i <= number; i++){
            menor--;
            if(i < number){
                System.out.print(" * " + menor + " ");
            }
        }
        System.out.print("\nFatorial: " + numeroCalculo + "\n");
        numeroCalculo = (numeroCalculo * percentual) / 100;
        System.out.print(percentual + "%: " + numeroCalculo + "\n");
    }

 }
