package br.com.leonardo.primo;

//Crie uma classe NumerosPrimos com métodos como verificarPrimalidade()
// e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo
// e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um
// método específico para cada uma das subclasses, como
//  verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo()
// para o GeradorPrimo.

public class GeradorPrimo extends NumerosPrimos{
    public int gerarProximoPrimo(int ultimoPrimoConhecido){
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)){
            proximoNumero++;
        }
        return proximoNumero;
    }
}
