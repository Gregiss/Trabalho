package buscanumber;

import java.util.Scanner;

public class BuscaNumber {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numberCount = 20;
        int number[] = new int[numberCount];
        boolean achei = false;
        for(int i = 0; i < number.length; i++){
            System.out.println("Escreva um numbero \nOu digite sair para fechar o programa");
            number[i] = leia.nextInt();
            int total = number.length - 1;
            if(i >= total){
                System.out.println("Legal cheguei ao número " + number.length + "\n Escreva um nome que talvez esteja na lista");
                int numberBusca = leia.nextInt();
                System.out.println("Olha oque eu achei :D");
                for(int b = 0; b < number.length; b++){
                    if(numberBusca == number[b]){
                        achei = true;
                        break;
                    }
                }
            }
        }
        if(achei){
            System.out.println("Achei :D");
        } else{
            System.out.println("Não achei :C");
        }
    }
    
}