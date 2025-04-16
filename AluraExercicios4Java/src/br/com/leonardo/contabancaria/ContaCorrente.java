package br.com.leonardo.contabancaria;

public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal(){

        saldo -= 30.00;
        System.out.println("Tarifa mensal aplicada " + saldo);
    }

}
