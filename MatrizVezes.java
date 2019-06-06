package matrizes;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a quantidade de linhas da matriz");
        final int linhas = leia.nextInt();
        System.out.println("Informe a quantidade de colunas da matriz");
        final int colunas = leia.nextInt();
        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];
        int[][] matrizC = new int[linhas][colunas];
        
        matrizA[0][0] = 1;
        matrizA[0][1] = 2;
        matrizA[1][0] = 3;
        matrizA[1][1] = 4;
        
        matrizB[0][0] = -1;
        matrizB[0][1] = 3;
        matrizB[1][0] = 4;
        matrizB[1][1] = 2;

        for(int linha = 0; linha < matrizA.length; linha++){
            for(int coluna = 0; coluna < matrizA[linha].length; coluna++){
                matrizC[linha][coluna] = 0;
                for(int aux = 0; aux < matrizA[linha].length; aux++){
                matrizC[linha][coluna] += matrizB[linha][aux] * matrizA[aux][coluna];
                }
            }
        }
          
        for(int linha = 0; linha < matrizC.length; linha++){
            for (int coluna = 0; coluna < matrizC.length; coluna++) {
                System.out.print(matrizC[linha][coluna] + "\t");
            }
            System.out.println("");
        }
    }
    
}
