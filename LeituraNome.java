package leituranome;

import java.util.Scanner;

public class LeituraNome {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int pessoasCount = 11;
        String names[] = new String[pessoasCount];
        for(int i = 0; i < 11; i++){
            System.out.println("Escreva um nome \nOu digite sair para fechar o programa");
            names[i] = leia.next();
            if(names[i].equals("sair")){
                System.out.println("Finalizado");
                break;
            } else if(i >= 10){
                System.out.println("Legal cheguei ao número 10\n Escreva um nome que talvez esteja na lista");
                String nomeBusca = leia.next();
                System.out.println("Olha oque eu achei :D");
                for(int b = 0; b < 11; b++){
                    while(true){
                    if(nomeBusca.equals(names[b])){
                        System.out.println(nomeBusca + " = " + names[b] + ": Achei :D");
                        break;
                    } else{
                        System.out.println(nomeBusca + " = " + names[b] + ": Não achei :C");
                        break;
                    }
                    }
                }
            }
        }
    }
    
}
