package empresa;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantos funcionarios irá cadastrar?");
        int increment = leia.nextInt();
        System.out.println("Existe os cargos :\n 1- Gerente \n 2- Engenheiro \n 3- Tecnico \n 4 -Outros");
        int[] code = new int[increment];
        String[] nome = new String[increment];
        double[] salario = new double[increment];
        double[] novoSalario = new double[increment];
        int[] tempoServico = new int[increment];
        int[] aumento = new int[increment];
        double[] reajuste = new double[increment];
        String[] cargo = new String[increment];
        String aux = "";
        int totalFuncionariosCadastros = 0;
        for(int i = 0; i < increment; i++){
            System.out.println("Informe o nome do funcionario :D");
            System.out.println("Você pode parar a execução, digitando parar");
            nome[i] = leia.next();
            if(nome[i].equals("parar")){
                System.out.println("Operação cadastro finalizado");
                break;
            }
            System.out.println("Qual é o cargo dele?");
            aux = leia.next();
            cargo[i] = aux;
            System.out.println("Qual é o salario");
            salario[i] = leia.nextDouble();
            System.out.println("Qual é o tempo de serviço dele?");
            tempoServico[i] = leia.nextInt();
            if(tempoServico[i] == 1){
                if(cargo[i].equals("Gerente")){
                    aumento[i] = 10;
                } else if(cargo[i].equals("Engenheiro")){
                    aumento[i] = 15;
                } else if(cargo[i].equals("Tecnico")){
                    aumento[i] = 5;
                }
            } else if(tempoServico[i] == 2){
                if(cargo[i].equals("Gerente")){
                    aumento[i] = 20;
                } else if(cargo[i].equals("Engenheiro")){
                    aumento[i] = 30;
                } else if(cargo[i].equals("Tecnico")){
                    aumento[i] = 10;
                }
            } else if(tempoServico[i] >= 3){
                if(cargo[i].equals("Gerente")){
                    aumento[i] = 25;
                } else if(cargo[i].equals("Engenheiro")){
                    aumento[i] = 35;
                } else if(cargo[i].equals("Tecnico")){
                    aumento[i] = 15;
                } else{
                    aumento[i] = 35;
                }
            }
            reajuste[i] = (salario[i] * aumento[i]) / 100;
            novoSalario[i] = salario[i] + reajuste[i];
            code[i] = i;
            totalFuncionariosCadastros++;
        }
        System.out.print("----------------------------------------------------------------------------------\n");
        System.out.print("  Código|Cod Cargo |  Tem.Servico|  Salario|  Reajuste|  Novo Salario  | \n");
        for(int i = 0; i < totalFuncionariosCadastros; i++){
            System.out.print("   " +code[i] +"   |   " + cargo[i] + "   |   " +  tempoServico[i] + "   |   " + salario[i] + "   |   " + reajuste[i] + "   |   " + novoSalario[i] + "   |   \n");
            System.out.print("----------------------------------------------------------------\n");
        }
    }
    
}

