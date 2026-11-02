package padroes.integracao;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class PlanoDosesTest {

    @Test
    void deveCalcularProximaDose() {
        PlanoDoses plano = new PlanoDoses(LocalDate.of(2026, 11, 1), 1);
        assertEquals(LocalDate.of(2027, 4, 30), plano.calcularProximaDose(new EsquemaDuasDoses()));
    }

    @Test
    void naoDeveCalcularProximaDoseQuandoEsquemaCompleto() {
        PlanoDoses plano = new PlanoDoses(LocalDate.of(2026, 11, 1), 2);
        assertNull(plano.calcularProximaDose(new EsquemaDuasDoses()));
    }
}
