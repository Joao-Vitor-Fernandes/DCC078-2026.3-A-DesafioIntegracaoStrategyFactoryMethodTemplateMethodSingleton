package padroes.integracao;

public class Paciente {

    private String nome;
    private int idade;
    private int dosesGripe;
    private int dosesHPV;
    private int dosesFebreAmarela;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getDosesGripe() {
        return dosesGripe;
    }

    public void setDosesGripe(int dosesGripe) {
        this.dosesGripe = dosesGripe;
    }

    public int getDosesHPV() {
        return dosesHPV;
    }

    public void setDosesHPV(int dosesHPV) {
        this.dosesHPV = dosesHPV;
    }

    public int getDosesFebreAmarela() {
        return dosesFebreAmarela;
    }

    public void setDosesFebreAmarela(int dosesFebreAmarela) {
        this.dosesFebreAmarela = dosesFebreAmarela;
    }
}