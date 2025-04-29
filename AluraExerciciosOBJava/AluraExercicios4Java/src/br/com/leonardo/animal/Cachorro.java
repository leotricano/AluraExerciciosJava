package br.com.leonardo.animal;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("AuAu");;
    }
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
}
