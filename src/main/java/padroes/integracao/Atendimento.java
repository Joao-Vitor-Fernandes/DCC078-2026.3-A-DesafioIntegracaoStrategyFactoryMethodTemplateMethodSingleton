package padroes.integracao;

import java.time.LocalDate;

public class Atendimento {

    public String vacinar(String nomeVacina, Paciente paciente, LocalDate dataAplicacao) {
        IVacina vacina = VacinaFactory.obterVacina(nomeVacina);
        return vacina.aplicar(paciente, dataAplicacao);
    }
}
