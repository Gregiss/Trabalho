package leituranome;

import java.util.Scanner;

public class LeituraNome {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int pessoasCount = 10;
        String names[] = new String[pessoasCount];
        boolean achei = false;
        for(int i = 0; i < names.length; i++){
            System.out.println("Informe o " + (i + 1)+ "º nome\nOu digite sair para fechar o programa");
            names[i] = leia.nextLine();
            int total = names.length - 1;
            if(names[i].equals("sair")){
                System.out.println("Finalizado");
                break;
            }
        }
        //Pesquisa nome entre array
        System.out.println("Legal cheguei ao número " + names.length + "\n Escreva um nome que talvez esteja na lista");
            String nomeBusca = leia.nextLine();
            System.out.println("Olha oque eu achei :D");
            for (String name : names) {
                if (nomeBusca.equals(name)) {
                    achei = true;
                    break;
                }
        }
        //Informa se achou ou não achou o nome
        if(achei){
            System.out.println("Achei :D");
        } else{
            System.out.println("Não achei :C");
        }
    }
    
}
