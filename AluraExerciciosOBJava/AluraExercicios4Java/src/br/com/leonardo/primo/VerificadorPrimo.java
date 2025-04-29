package br.com.leonardo.primo;

public class VerificadorPrimo extends NumerosPrimos{
    public void verifivarSeEPrimo(int numero){
        if(verificarPrimalidade(numero)){
            System.out.println("É primo");
        }
        else {
            System.out.println("Não é primo");
        }
    }
}
