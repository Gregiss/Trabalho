package prefeitura;

import java.util.Scanner;

public class Prefeitura {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double salario = 0, mediaSalario = 0, maiorSalario = 0, percentualSalario = 0, salarioCalculo = 0, percentualMenor150 = 0;
        int filhos = 0, mediaFilho = 0, atual = 1, cadastrarNovo = 0, pessoas = 0;
        String aux = "";
        System.out.println("Ao digitar sair, você irá sair do programa");
        while(true){
            cadastrarNovo = 0;
            System.out.println("Qual o salario?");
            aux = leia.next();
            if(aux.equals("sair")){
                System.out.println("Processo encerrado");
                break;
            }
            else{
                salario = Double.parseDouble(aux);
                salarioCalculo += salario;
                mediaSalario = salarioCalculo / atual;
                System.out.println("Quantos filhos você tem?");
                filhos = leia.nextInt();
                mediaFilho = filhos / atual;
                if(salario > maiorSalario){
                    maiorSalario = salario;
                }
                System.out.println("Seu salario é " + salario + "\nA média atual é " + mediaSalario + "\nMédia de número de filhos é " + mediaFilho + "\nMaior salario é " + maiorSalario);
                if(salario <= 150){
                pessoas++;
                }
                percentualMenor150 = (pessoas*100) / atual;
                System.out.println("Percentual com menor de 150 reais é " + percentualMenor150 + "%");
                System.out.println("Deseja cadastrar um novo usuario? \n 1 para sim");
                cadastrarNovo = leia.nextInt();
                if(cadastrarNovo == 0){
                    System.out.println("Processo encerrado");
                    break;
                } else{
                    atual++;
                }
                
        }
    }
}
}
