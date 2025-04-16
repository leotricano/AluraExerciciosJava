import br.com.leonardo.primo.NumerosPrimos;
import br.com.leonardo.primo.GeradorPrimo;
import br.com.leonardo.primo.VerificadorPrimo;
public class Main {
    public static void main(String[] args) {
//    ModeloCarro carro = new ModeloCarro();
//
//    carro.definirModelo("Ford Ka");
//    carro.definirPrecoAno(40000, 20000, 25000);
//    carro.calcularMenorPreco();
//    carro.calcularMaiorPreco();
//    carro.exibirInfo();

//        Cachorro mel = new Cachorro();
//        Gato capitu = new Gato();
//
//        mel.emitirSom();
//        mel.abanarRabo();
//        capitu.emitirSom();
//        capitu.arranharMoveis();


//        ContaCorrente novaConta = new ContaCorrente();
//        novaConta.setSaldo(100);
//        novaConta.depositar(10);
//        novaConta.sacar(40);
//        novaConta.consultarSaldo();
//        novaConta.cobrarTarifaMensal();
//        novaConta.consultarSaldo();
//

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);
        GeradorPrimo gerador = new GeradorPrimo();

        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

    }
}