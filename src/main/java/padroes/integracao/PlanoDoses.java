package padroes.integracao;

import java.time.LocalDate;

public class PlanoDoses {

    private LocalDate dataAplicacao;
    private int dosesAplicadas;

    public PlanoDoses(LocalDate dataAplicacao, int dosesAplicadas) {
        this.dataAplicacao = dataAplicacao;
        this.dosesAplicadas = dosesAplicadas;
    }

    public LocalDate calcularProximaDose(EsquemaDose esquema) {
        int dias = esquema.calcularIntervaloDias(dosesAplicadas);
        if (dias == 0) {
            return null;
        }
        else {
            return dataAplicacao.plusDays(dias);
        }
    }
}
