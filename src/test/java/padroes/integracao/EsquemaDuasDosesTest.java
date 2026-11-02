package padroes.integracao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EsquemaDuasDosesTest {

    @Test
    void deveCalcularIntervaloAposPrimeiraDose() {
        assertEquals(180, new EsquemaDuasDoses().calcularIntervaloDias(1));
    }

    @Test
    void naoDeveTerIntervaloAposSegundaDose() {
        assertEquals(0, new EsquemaDuasDoses().calcularIntervaloDias(2));
    }

}