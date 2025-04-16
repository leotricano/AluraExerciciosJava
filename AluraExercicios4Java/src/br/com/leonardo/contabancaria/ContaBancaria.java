package br.com.leonardo.contabancaria;
//Crie uma classe ContaBancaria com métodos para realizar
// operações bancárias como depositar(), sacar() e consultarSaldo().
// Em seguida, crie uma subclasse ContaCorrente que herda da classe
// ContaBancaria. Adicione um método específico para a subclasse, como
//  cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

public class ContaBancaria {
    public double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        if (deposito <= 0) {
            System.out.println("Desposito insuficiente por favor revisar");
        } else {
            saldo += deposito;
        }
    }

    public  void  sacar(double saque){
        if (saque <= 0){
            System.out.println("Erro");
        }
        else{
            saldo -= saque;
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo atual = " + getSaldo());

    }
}