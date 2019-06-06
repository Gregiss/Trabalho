package paresimpares;

import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int quantidadePar = 0;
        int quantidadeImpar = 0;
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("Qual o número mestre?");
                matriz[linha][coluna] = leia.nextInt();
            }
        }
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                if(matriz[linha][coluna]% 2 == 0){
                    quantidadePar++;
                } else{
                    quantidadeImpar++;
                }
            }
        }
        System.out.println("Quantidade de par é " + quantidadePar + "\n" + "Quantidade de impar é " + quantidadeImpar);
    }
    
}
