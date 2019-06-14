package operacao;


public class operacaoAvancadas {

    public double potencial(double a, double b){
        double soma = 1;
        for(int i = 0; i < b; i++){
            soma *= a;
        }
        return soma;
    }
    
    public double raizQuadrada(double a){
        double soma = Math.sqrt(a);
        return soma;
    }
    
}
