import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularMedia(){

        double soma = 0;
        for (double nota : notas){

            soma += nota;

        }

        return soma / notas.size();
    }
}
