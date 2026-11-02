package padroes.integracao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VacinaFactoryTest {

    @Test
    void deveRetornarExcecaoParaVacinaInexistente() {
        try {
            IVacina vacina = VacinaFactory.obterVacina("Dengue");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Vacina inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaVacinaInvalida() {
        try {
            IVacina vacina = VacinaFactory.obterVacina("SemRegistro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Vacina inválida", e.getMessage());
        }
    }

}