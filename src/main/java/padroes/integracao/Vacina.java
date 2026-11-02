package padroes.integracao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Vacina implements IVacina {

    private static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public abstract String getNome();
    protected abstract int getIdadeMinima();
    protected abstract EsquemaDose criarEsquema();
    protected abstract int getEstoque();
    protected abstract void setEstoque(int estoque);
    protected abstract int getDosesRecebidas(Paciente paciente);
    protected abstract void registrarDose(Paciente paciente);

    public String getTipo() {
        return "Vacinacao";
    }

    public final String aplicar(Paciente paciente, LocalDate dataAplicacao) {
        EsquemaDose esquema = criarEsquema();
        int dosesAnteriores = getDosesRecebidas(paciente);

        if (paciente.getIdade() < getIdadeMinima()) {
            throw new IllegalArgumentException("Idade inferior à mínima");
        }
        if (dosesAnteriores >= esquema.getTotalDoses()) {
            throw new IllegalArgumentException("Esquema vacinal já completo");
        }
        if (getEstoque() <= 0) {
            throw new IllegalStateException("Vacina sem estoque");
        }

        setEstoque(getEstoque() - 1);
        registrarDose(paciente);
        int doseAtual = dosesAnteriores + 1;

        PlanoDoses plano = new PlanoDoses(dataAplicacao, doseAtual);
        LocalDate proximaDose = plano.calcularProximaDose(esquema);
        String proxima = (proximaDose == null) ? "esquema completo" : proximaDose.format(FORMATO_DATA);

        PostoSaude posto = PostoSaude.getInstance();
        return getTipo() + "{" +
            "vacina='" + getNome() + '\'' +
            ", paciente='" + paciente.getNome() + '\'' +
            ", dose=" + doseAtual + "/" + esquema.getTotalDoses() +
            ", posto='" + posto.getNomePosto() + '\'' +
            ", profissional='" + posto.getProfissionalResponsavel() + '\'' +
            ", proximaDose=" + proxima +
            '}';
    }
}