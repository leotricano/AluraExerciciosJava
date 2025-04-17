package br.com.leonardo.conversortemperatura;

//4.Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit()
// e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao
// que implementa essa interface com as fórmulas de conversão e exibe os resultados.

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double celcius) {
        double fahrenheit = celcius * (9.0/5.0) + 32;
        System.out.println("A temperatura em celcius " + celcius + " para fahrenheit é " + fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        System.out.println("A temperatura em fahrenheit " + fahrenheit + " para celcius é " + celcius);


    }
}