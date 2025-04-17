package br.com.leonardo.tabuadamultiplicacao;

//3.Crie uma classe TabuadaMultiplicacao que implementa uma interface
//Tabuada com o método mostrarTabuada() para exibir a tabuada de um
// número. A classe deve receber o número como parâmetro.

public class TabuadaMultiplicacao implements Tabuada {




    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada de " + numero);
        for(int i = 0; i < 11; i++) {
            int tabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada);


        }

    }
}
