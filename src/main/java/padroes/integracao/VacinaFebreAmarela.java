package padroes.integracao;

public class VacinaFebreAmarela extends Vacina {

    public String getNome() {
        return "Febre Amarela";
    }

    protected int getIdadeMinima() {
        return 1;
    }

    protected EsquemaDose criarEsquema() {
        return new EsquemaDoseUnica();
    }

    protected int getEstoque() {
        return PostoSaude.getInstance().getEstoqueFebreAmarela();
    }

    protected void setEstoque(int estoque) {
        PostoSaude.getInstance().setEstoqueFebreAmarela(estoque);
    }

    protected int getDosesRecebidas(Paciente paciente) {
        return paciente.getDosesFebreAmarela();
    }

    protected void registrarDose(Paciente paciente) {
        paciente.setDosesFebreAmarela(paciente.getDosesFebreAmarela() + 1);
    }
}