package padroes.integracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class VacinaFebreAmarelaTest {

    IVacina vacina;

    @BeforeEach
    void setUp() {
        PostoSaude posto = PostoSaude.getInstance();
        posto.setNomePosto("Posto Vacina 1");
        posto.setProfissionalResponsavel("Enfermeiro 1");
        posto.setEstoqueFebreAmarela(4);
        vacina = new VacinaFebreAmarela();
    }

    @Test
    void deveAplicarDoseUnica() {
        VacinaFebreAmarela vacina = new VacinaFebreAmarela();
        Paciente paciente = new Paciente("Paciente 1", 1);
        assertEquals("Vacinacao{vacina='Febre Amarela', paciente='Paciente 1', dose=1/1, posto='Posto Vacina 1', profissional='Enfermeiro 1', proximaDose=esquema completo}", vacina.aplicar(paciente, LocalDate.of(2026, 11, 1)));
    }

    @Test
    void deveDescontarUmaDoseDoEstoque() {
        vacina.aplicar(new Paciente("Paciente 1", 1), LocalDate.of(2026, 11, 1));
        assertEquals(3, PostoSaude.getInstance().getEstoqueFebreAmarela());
    }

    @Test
    void naoDeveAplicarQuandoEsquemaCompleto() {
        Paciente paciente = new Paciente("Paciente 1", 1);
        vacina.aplicar(paciente, LocalDate.of(2026, 11, 1));
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> vacina.aplicar(paciente, LocalDate.of(2026, 12, 1)));
        assertEquals("Esquema vacinal já completo", e.getMessage());
    }

    @Test
    void naoDeveAplicarAbaixoDaIdadeMinima() {
        Paciente paciente = new Paciente("Paciente 2", 0);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> vacina.aplicar(paciente, LocalDate.of(2026, 11, 1)));
        assertEquals("Idade inferior à mínima", e.getMessage());
    }
}
