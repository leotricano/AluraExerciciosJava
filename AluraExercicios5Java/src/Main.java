import br.com.leonardo.conversormoeda.ConversaoFinanceira;
import br.com.leonardo.conversormoeda.ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(10); // Exemplo com o valor em dólar
    }
}