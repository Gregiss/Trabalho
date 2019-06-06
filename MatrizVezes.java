package matrizes;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizC = new int[2][2];
        
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
                for(int aux = 0; aux < matrizA.length; aux++){
                matrizC[linha][coluna] = matrizC[linha][coluna] + matrizA[linha][aux] * matrizB[aux][coluna];
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
