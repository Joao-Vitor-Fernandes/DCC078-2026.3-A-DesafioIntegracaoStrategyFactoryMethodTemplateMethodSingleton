package padroes.integracao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EsquemaDoseUnicaTest {

    @Test
    void naoDeveTerIntervaloAposPrimeiraDose() {
        assertEquals(0, new EsquemaDoseUnica().calcularIntervaloDias(1));
    }

}