package matrix4x4;

import java.util.Random;

public class Matrix4x4 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[4][4];
        int maiorNumero = -1;
        int posicaoLinha = -1;
        int posicaoColuna = -1;
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = aleatorio.nextInt(10);
                if(matriz[linha][coluna] > maiorNumero){
                    maiorNumero = matriz[linha][coluna];
                    posicaoLinha = linha;
                    posicaoColuna = coluna;
                }
            }
        }
        
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print(matriz[linha][coluna] +"\t");
            }
            System.out.println("");
        }
        
        System.out.print("O maior número é => " + maiorNumero + " na posição " + "[" + posicaoLinha + "]" + "[" + posicaoColuna + "]");
            
        
    }
    
}
