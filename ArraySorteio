package array;

import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantos participantes terão?");
        int totalParticipantes = leia.nextInt();
        int participante = 0;
        String[] nomes = new String[totalParticipantes];
        for(int i = 0; i < totalParticipantes; i++){
            participante = i + 1;
            System.out.println("Qual o nome do " + participante + " participante");
            nomes[i] = leia.next();
        }
        Random r = new Random();
        int idx = r.nextInt(nomes.length);
        System.out.println("O ganhador é " + nomes[idx]);
    }
    
}
