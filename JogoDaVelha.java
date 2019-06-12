package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int linhas, colunas = 0, vez = 1;
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                for(int i = 0; i < matriz.length; i++){
                    for(int b = 0; b < matriz[i].length; b++){
                        if(matriz[i][b] == 1){
                            System.out.print("X \t");
                        } else if(matriz[i][b] == 2){
                            System.out.print("O \t");
                        } else{
                            System.out.print("- \t");
                        }
                    }
                    System.out.println("");
                }
                //Verificar se algum jogador X ganhou
                if(matriz[0][0] == 1 & matriz[0][1] == 1 & matriz[0][2] == 1){
                    System.out.println("Jogador X ganhou");
                    break;
                } else if(matriz[1][0] == 1 & matriz[1][1] == 1 & matriz[1][2] == 1){
                    System.out.println("Jogador X ganhou");
                    break;
                } else if(matriz[2][0] == 1 & matriz[2][1] == 1 & matriz[2][2] == 1){
                    System.out.println("Jogador X ganhou");
                    break;
                } else if(matriz[0][0] == 1 & matriz[1][1] == 1 & matriz[2][2] == 1){
                    System.out.println("Jogador X ganhou");
                    break;
                } else if(matriz[2][0] == 1 & matriz[1][1] == 1 & matriz[0][2] == 1){
                    System.out.println("Jogador X ganhou");
                    break;
                }
                //Verificar se o jogador O ganhou
                //Verificar se algum jogador ganhou
                if(matriz[0][0] == 2 & matriz[0][1] == 2 & matriz[0][2] == 2){
                    System.out.println("Jogador O ganhou");
                    break;
                } else if(matriz[1][0] == 2 & matriz[1][1] == 2 & matriz[1][2] == 2){
                    System.out.println("Jogador O ganhou");
                    break;
                } else if(matriz[2][0] == 2 & matriz[2][1] == 2 & matriz[2][2] == 2){
                    System.out.println("Jogador O ganhou");
                    break;
                } else if(matriz[0][0] == 2 & matriz[1][1] == 2 & matriz[2][2] == 2){
                    System.out.println("Jogador O ganhou");
                    break;
                } else if(matriz[2][0] == 2 & matriz[1][1] == 2 & matriz[0][2] == 2){
                    System.out.println("Jogador O ganhou");
                    break;
                } else if(matriz[0][1] == 2 & matriz[1][1] == 2 & matriz[2][1] == 2){
                    System.out.println("Jogador O ganhou");
                    break;
                } else if(matriz[2][0] == 2 & matriz[1][1] == 2 & matriz[0][2] == 2){
                    System.out.println("Jogador X ganhou");
                    break;
                }
                //Logica
                System.out.println("-----------------\n");
                System.out.println("Informe um número para linha");
                linhas = leia.nextInt();
                System.out.println("Informe um número para coluna");
                colunas = leia.nextInt();
                if(vez == 1){
                 matriz[linhas][colunas] = 1;
                 vez = 2;
                } else{
                    matriz[linhas][colunas] = 2;
                    vez = 1;
                }
                }
                System.out.println("-----------------\n");
            }
            }
        }
