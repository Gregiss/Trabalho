package game;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Random sorteio = new Random();
        Scanner leia = new Scanner(System.in);
        int numeroSorteado = sorteio.nextInt(11);
        int numeroQueAcho = -1 , tentativa = 0;
        //Verificar se acertou
        while(true){
            System.out.println("Que número eu sortiei? :3");
            numeroQueAcho = leia.nextInt();
            if(numeroQueAcho == numeroSorteado){
                System.out.println("Você acertou! parabéns, o número de tentativa foi " + tentativa);
                break;
            } else{
                System.out.println("Você errou tente novamente");
                //Verificar se o numero digitado é menor
                if(numeroSorteado < numeroQueAcho){
                    System.out.println("O número sorteado é menor que " + numeroQueAcho);
                } else{
                    System.out.println("O número sorteado é maior que " + numeroQueAcho);
                }
                tentativa++;
            }
        }
    }
    
}
