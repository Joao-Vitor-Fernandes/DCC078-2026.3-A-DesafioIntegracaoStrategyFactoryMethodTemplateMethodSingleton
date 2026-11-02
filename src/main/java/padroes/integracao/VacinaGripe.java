package padroes.integracao;

public class VacinaGripe extends Vacina {

    public String getNome() {
        return "Gripe";
    }

    protected int getIdadeMinima() {
        return 1;
    }

    protected EsquemaDose criarEsquema() {
        return new EsquemaDoseUnica();
    }

    protected int getEstoque() {
        return PostoSaude.getInstance().getEstoqueGripe();
    }

    protected void setEstoque(int estoque) {
        PostoSaude.getInstance().setEstoqueGripe(estoque);
    }

    protected int getDosesRecebidas(Paciente paciente) {
        return paciente.getDosesGripe();
    }

    protected void registrarDose(Paciente paciente) {
        paciente.setDosesGripe(paciente.getDosesGripe() + 1);
    }
}