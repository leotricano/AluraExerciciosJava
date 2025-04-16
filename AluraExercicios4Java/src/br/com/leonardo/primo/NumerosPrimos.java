
package br.com.leonardo.primo;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero){
        if (numero <= 1){

            return false;
        }
        for(int i = 2; i * i <= numero; i++){

            if(numero % i == 0){

                return false;
            }

        }
        ;
        return true;
    }

    public void listarPrimos(int numeroMaximo){
        System.out.println("Procurar numero primo até " + numeroMaximo);
        for (int i = 2; i <= numeroMaximo; i++){
            if(verificarPrimalidade(i)){
                System.out.println(i + " ");

            }
        }


    }
}