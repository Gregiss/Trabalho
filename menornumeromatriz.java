package menornumeromatriz;

import java.util.Random;

public class MenorNumeroMatriz {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[10][10];
        int maiorNumero = -1;
        int posicaoLinha = -1;
        int posicaoColuna = -1;
        int menorNumero = -1;
        int posicaoLinha2 = -1;
        int posicaoColuna2 = -1;
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = aleatorio.nextInt(10);
                if(matriz[5][coluna] < maiorNumero){
                    menorNumero = matriz[5][coluna];
                    posicaoLinha2 = 5;
                    posicaoColuna2 = coluna;
                }
                else if(matriz[linha][7] > maiorNumero){
                    maiorNumero = matriz[linha][7];
                    posicaoLinha = linha;
                    posicaoColuna = 7;
                }
            }
        }
        
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println("[" + linha + "]" + "[" + coluna + "] => " +  matriz[linha][coluna]);
            }
        }
        
        System.out.print("O maior número é => " + maiorNumero + " na posição " + "[" + posicaoLinha + "]" + "[" + posicaoColuna + "]\n");
        System.out.print("O menor número é => " + menorNumero + " na posição " + "[" + posicaoLinha2 + "]" + "[" + posicaoColuna2 + "]\n");
            
    }
    
}
