package padroes.integracao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostoSaudeTest {

    @Test
    void deveRetornarNomePosto() {
        PostoSaude.getInstance().setNomePosto("Posto Vacina 1");
        assertEquals("Posto Vacina 1", PostoSaude.getInstance().getNomePosto());
    }

    @Test
    void deveRetornarProfissionalResponsavel() {
        PostoSaude.getInstance().setProfissionalResponsavel("Enfermeiro 1");
        assertEquals("Enfermeiro 1", PostoSaude.getInstance().getProfissionalResponsavel());
    }

}