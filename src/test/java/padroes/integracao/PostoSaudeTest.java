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

    @Test
    void deveRetornarEstoqueGripe() {
        PostoSaude.getInstance().setEstoqueGripe(10);
        assertEquals(10, PostoSaude.getInstance().getEstoqueGripe());
    }

    @Test
    void deveRetornarEstoqueHPV() {
        PostoSaude.getInstance().setEstoqueHPV(5);
        assertEquals(5, PostoSaude.getInstance().getEstoqueHPV());
    }

    @Test
    void deveRetornarEstoqueFebreAmarela() {
        PostoSaude.getInstance().setEstoqueFebreAmarela(4);
        assertEquals(4, PostoSaude.getInstance().getEstoqueFebreAmarela());
    }

}