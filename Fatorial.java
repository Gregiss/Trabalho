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
            if(i < number){
            menor--;
            System.out.print(number + " * " + menor + " ");
            }
        }
        System.out.print("Resultado : " + numeroCalculo + "\n");
    }
    
}
