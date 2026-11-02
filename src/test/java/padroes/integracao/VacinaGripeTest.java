package padroes.integracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class VacinaGripeTest {

    VacinaGripe vacina;
    Paciente paciente;

    @BeforeEach
    void setUp() {
        PostoSaude posto = PostoSaude.getInstance();
        posto.setNomePosto("Posto Vacina 1");
        posto.setProfissionalResponsavel("Enfermeiro 1");
        posto.setEstoqueGripe(10);
        vacina = new VacinaGripe();
        paciente = new Paciente("Paciente 1", 30);
    }

    @Test
    void deveAplicarDoseUnica() {
        assertEquals("Vacinacao{vacina='Gripe', paciente='Paciente 1', dose=1/1, posto='Posto Vacina 1', profissional='Enfermeiro 1', proximaDose=esquema completo}", vacina.aplicar(paciente, LocalDate.of(2026, 11, 1)));
    }

    @Test
    void deveDescontarUmaDoseDoEstoque() {
        vacina.aplicar(paciente, LocalDate.of(2026, 11, 1));
        assertEquals(9, PostoSaude.getInstance().getEstoqueGripe());
    }

    @Test
    void naoDeveAplicarQuandoEsquemaCompleto() {
        vacina.aplicar(paciente, LocalDate.of(2026, 11, 1));
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> vacina.aplicar(paciente, LocalDate.of(2026, 12, 1)));
        assertEquals("Esquema vacinal já completo", e.getMessage());
    }

    @Test
    void naoDeveAplicarSemEstoque() {
        PostoSaude.getInstance().setEstoqueGripe(0);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> vacina.aplicar(paciente, LocalDate.of(2026, 11, 1)));
        assertEquals("Vacina sem estoque", e.getMessage());
    }
}