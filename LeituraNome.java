package leituranome;

import java.util.Scanner;

public class LeituraNome {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int pessoasCount = 5;
        String names[] = new String[pessoasCount];
        boolean achei = false;
        for(int i = 0; i < names.length; i++){
            System.out.println("Escreva um nome \nOu digite sair para fechar o programa");
            names[i] = leia.next();
            int total = names.length - 1;
            if(names[i].equals("sair")){
                System.out.println("Finalizado");
                break;
            } else if(i >= total){
                System.out.println("Legal cheguei ao número " + names.length + "\n Escreva um nome que talvez esteja na lista");
                String nomeBusca = leia.next();
                System.out.println("Olha oque eu achei :D");
                for(int b = 0; b < names.length; b++){
                    if(nomeBusca.equals(names[b])){
                        achei = true;
                        break;
                    }
                }
            }
        }
        if(achei){
            System.out.println("Achei :D");
        } else{
            System.out.println("Nãa achei :C");
        }
    }
    
}