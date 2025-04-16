public class Musica {
    String titulo = "One";
    String artista = "Metallica";
    int anoLancamento = 1990;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica() {
        System.out.printf("Titulo: %s%nArtista: %s%nAno lançamento: %d%n",
                titulo, artista, anoLancamento);
    }

    double avaliar(double nota){
        avaliacao += nota;
        numAvaliacoes ++;
        System.out.println("Nota: " + avaliacao  );
        System.out.println("Numero de avaliaçoes: " + numAvaliacoes);
        return nota;

    }
    double mediaAvalicao(){
        return avaliacao/numAvaliacoes;

    }
}
