package padroes.integracao;

import java.time.LocalDate;

public interface IVacina {

    String getNome();
    String aplicar(Paciente paciente, LocalDate dataAplicacao);
}
