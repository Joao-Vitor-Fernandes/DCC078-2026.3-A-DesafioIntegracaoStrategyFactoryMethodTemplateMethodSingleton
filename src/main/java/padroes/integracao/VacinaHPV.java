package padroes.integracao;

public class VacinaHPV extends Vacina {

    public String getNome() {
        return "HPV";
    }

    protected int getIdadeMinima() {
        return 9;
    }

    protected EsquemaDose criarEsquema() {
        return new EsquemaDuasDoses();
    }

    protected int getEstoque() {
        return PostoSaude.getInstance().getEstoqueHPV();
    }

    protected void setEstoque(int estoque) {
        PostoSaude.getInstance().setEstoqueHPV(estoque);
    }

    protected int getDosesRecebidas(Paciente paciente) {
        return paciente.getDosesHPV();
    }

    protected void registrarDose(Paciente paciente) {
        paciente.setDosesHPV(paciente.getDosesHPV() + 1);
    }

    @Override
    public String getTipo() {
        return "Vacinacao Adolescente";
    }
}