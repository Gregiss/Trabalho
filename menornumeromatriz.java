package menornumeromatriz;

import java.util.Random;

public class MenorNumeroMatriz {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[10][10];
        int maiorNumero = -1;
        int maiorNumero2 = -1;
        int posicaoLinha = -1;
        int posicaoColuna = -1;
        int menorNumero = 11;
        int menorNumero2 = 11;
        int posicaoLinha2 = -1;
        int posicaoColuna2 = -1;
        int posicaoLinha3 = -1;
        int posicaoColuna3 = -1; 
        int posicaoLinha4 = -1;
        int posicaoColuna4 = -1;         
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = aleatorio.nextInt(10);
                if(matriz[5][coluna] > maiorNumero){
                    maiorNumero = matriz[5][coluna];
                    posicaoLinha2 = linha;
                    posicaoColuna2 = coluna;
                }
                else if(matriz[linha][7] > maiorNumero2){
                    maiorNumero2 = matriz[linha][coluna];
                    posicaoLinha3 = linha;
                    posicaoColuna3 = coluna;
                }
                else if(matriz[5][coluna] < menorNumero){
                    menorNumero = matriz[linha][coluna];
                    posicaoLinha = linha;
                    posicaoColuna = coluna;
                }
                else if(matriz[linha][7] < menorNumero2){
                    menorNumero2 = matriz[linha][coluna];
                    posicaoLinha4 = linha;
                    posicaoColuna4 = coluna;
                }
            }
        }
        
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print("[" + linha + "]" + "[" + coluna + "] => " + matriz[linha][coluna] +"\t");
            }
            System.out.println("");
        }

        
        System.out.print("O maior número é => " + maiorNumero + " na posição " + "[" + posicaoLinha + "]" + "[" + posicaoColuna + "]\n");
        System.out.print("O menor número é => " + menorNumero + " na posição " + "[" + posicaoLinha2 + "]" + "[" + posicaoColuna2 + "]\n");
        System.out.print("O maior número é => " + maiorNumero2 + " na posição " + "[" + posicaoLinha3 + "]" + "[" + posicaoColuna3 + "]\n");
        System.out.print("O menor número é => " + menorNumero2 + " na posição " + "[" + posicaoLinha4 + "]" + "[" + posicaoColuna4 + "]\n");
            
    }
    
}
