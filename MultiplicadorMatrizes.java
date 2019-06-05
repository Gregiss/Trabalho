package matrizes;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int linhas = 0;
        int colunas = 0;
        int numeroX = 0;
        System.out.println("Informe a quantidade de linhas da matriz");
        linhas = leia.nextInt();
        System.out.println("Informe a quantidade de colunas da matriz");
        colunas = leia.nextInt();
        System.out.println("Informe o número X");
        numeroX = leia.nextInt();
        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];
        
        for(int linha = 0; linha < matrizA.length; linha++){
            for(int coluna = 0; coluna < matrizA[linha].length; coluna++){
                System.out.println("Informe um número para " + "[" + linha + "]" + "[" + coluna + "]=>");
                matrizA[linha][coluna] = leia.nextInt();
            }
        }
        
        for(int linha = 0; linha < matrizB.length; linha++){
            for(int coluna = 0; coluna < matrizB[linha].length; coluna++){
                matrizB[linha][coluna] = numeroX * matrizA[linha][coluna];
            }
        }
        
        for(int linha = 0; linha < matrizB.length; linha++){
            for(int coluna = 0; coluna < matrizB[linha].length; coluna++){
                System.out.print(matrizB[linha][coluna] + "\t");
            }
            System.out.println("");
        }
    }
    
}
