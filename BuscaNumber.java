package buscanumber;

import java.util.Scanner;

public class BuscaNumber {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numberCount = 20;
        int[] a = new int[numberCount];
        int[] b = new int[(a.length - 1)];
        int aux = 0;
        int posicao = -1;
        for(int i = 0; i < a.length; i++){
            System.out.println("Escreva o " + (i + 1) + "º número");
            a[i] = leia.nextInt();
        }
        System.out.println("Escreva um número que desejas eliminar:");
        aux = leia.nextInt();
        
        //Localiza a posicao do elemento que desejas eliminar
        for(int i = 0; i < a.length; i++){
            if(a[i] == aux){
                posicao = i;
                break;
            }
        }
        System.out.println("--------------------------------");
        //Popula vetor B
        int indiceAlternativo = 0;
        for(int i = 0; i < b.length; i++){
            if(indiceAlternativo == posicao){
                indiceAlternativo++;
            }
            b[i] = a[indiceAlternativo];
            System.out.println(a[indiceAlternativo]);
            indiceAlternativo++;
        }
        
    }
    
}
