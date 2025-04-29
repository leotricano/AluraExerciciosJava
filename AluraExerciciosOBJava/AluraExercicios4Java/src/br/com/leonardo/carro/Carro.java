/* 1 - Crie uma classe Carro com métodos para representar um modelo
específico ao longo de três anos. Implemente métodos para
definir o nome do modelo, os preços médios para cada ano, e
calcular e exibir o menor e o maior preço.
 Adicione uma subclasse ModeloCarro para criar instâncias
específicas, utilizando-a na classe principal para
definir preços e mostrar informações. */

package br.com.leonardo.carro;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;


    public void definirModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void definirPrecoAno(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }


    public double calcularMenorPreco() {
        double menorPreco = precoAno1;

        if(precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }

        if(precoAno3 < menorPreco){
            menorPreco  = precoAno3;
        }

        return menorPreco;

    }

    public double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if(precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }

        if(precoAno3 > maiorPreco){
            maiorPreco  = precoAno3;
        }

        return maiorPreco;

    }

    public void exibirInfo(){
        System.out.println("Preço medio do carro em 2023 = " + precoAno1);
        System.out.println("Preço medio do carro em 2024 = " + precoAno2);
        System.out.println("Preço medio do carro em 2025 = " + precoAno3);
        System.out.println("Menor preço medio ente os anos = " + calcularMenorPreco());
        System.out.println("Maior preço medio ente os anos = " + calcularMaiorPreco());
    }
}
