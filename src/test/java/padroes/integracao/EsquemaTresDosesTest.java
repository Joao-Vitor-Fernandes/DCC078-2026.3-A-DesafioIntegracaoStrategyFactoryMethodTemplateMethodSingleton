package padroes.integracao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EsquemaTresDosesTest {

    @Test
    void deveCalcularIntervaloAposPrimeiraDose() {
        assertEquals(30, new EsquemaTresDoses().calcularIntervaloDias(1));
    }

    @Test
    void deveCalcularIntervaloAposSegundaDose() {
        assertEquals(150, new EsquemaTresDoses().calcularIntervaloDias(2));
    }

    @Test
    void naoDeveTerIntervaloAposTerceiraDose() {
        assertEquals(0, new EsquemaTresDoses().calcularIntervaloDias(3));
    }
}