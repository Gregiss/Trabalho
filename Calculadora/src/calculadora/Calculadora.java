package calculadora;

import java.util.Scanner;
import operacao.operacaoBasica;

public class Calculadora {

    public static void main(String[] args) {
        operacaoBasica op = new operacaoBasica();
        Scanner leia = new Scanner(System.in);
        System.out.print("Oque você quer fazer? \n 1 - Somar\n2 - Multiplicar\n3- Subtrair\n4- Divisão\n");
        int escolha = leia.nextInt();
        System.out.println("Qual o número um?");
        double num1 = leia.nextInt();
        System.out.println("Qual o número dois?");
        double num2 = leia.nextInt();
        double resultado = 0;
        switch (escolha) {
            case 1:
                resultado = op.somar(num1, num2);
                break;
            case 2:
                resultado = op.multiplicar(num1, num2);
                break;
            case 3:
                resultado = op.subtrair(num1, num2);
                break;
            case 4:
                resultado = op.dividir(num1, num2);
                break;
            default:
                break;
        }
        System.out.println("O resultado é " + resultado);
    }   
    
}
