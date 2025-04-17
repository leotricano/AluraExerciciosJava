package br.com.leonardo.calculavel;

public class Livro implements Calculavel{
    private String autor;


    @Override
    public double calcularPrecoFinal(double preco) {
        double desconto = preco * 0.20;
        double precoFinal = preco - desconto;
        System.out.println("Preço do livro é " + precoFinal);
        return precoFinal;

    }
}
