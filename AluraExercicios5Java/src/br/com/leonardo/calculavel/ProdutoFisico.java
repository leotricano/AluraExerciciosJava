package br.com.leonardo.calculavel;

public class ProdutoFisico implements Calculavel{

    @Override
    public double calcularPrecoFinal(double preco) {
        double taxa = preco * 0.20;
        double precoFinal = preco + taxa;
        System.out.println("Preço do produto é " + precoFinal);
        return precoFinal;

    }
}
