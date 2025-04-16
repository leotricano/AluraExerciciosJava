package br.com.leonardo.conversormoeda;

public class ConversorMoeda implements ConversaoFinanceira {
    private double real = 5.55;

    @Override
    public double converterDolarParaReal(double valorDolar) {
        double dolarConvertido = 0;

        dolarConvertido = valorDolar * real;
        System.out.println("Valor convertido é: " + dolarConvertido);
        return dolarConvertido;

    }

//    public double converterDolarParaReal(){
//        real *= dolar.converterDolarParaReal();
//        return dolar.converterDolarParaReal();
//
//
//    }


}
