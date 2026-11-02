package padroes.integracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class VacinaHPVTest {

    VacinaHPV vacina;

    @BeforeEach
    void setUp() {
        PostoSaude posto = PostoSaude.getInstance();
        posto.setNomePosto("Posto Vacina 1");
        posto.setProfissionalResponsavel("Enfermeiro 1");
        posto.setEstoqueHPV(5);
        vacina = new VacinaHPV();
    }

    @Test
    void deveAplicarPrimeiraDose() {
        Paciente paciente = new Paciente("Paciente 1", 9);
        assertEquals("Vacinacao Adolescente{vacina='HPV', paciente='Paciente 1', dose=1/2, posto='Posto Vacina 1', profissional='Enfermeiro 1', proximaDose=30/04/2027}", vacina.aplicar(paciente, LocalDate.of(2026, 11, 1)));
    }

    @Test
    void naoDeveAplicarAbaixoDaIdadeMinima() {
        Paciente paciente = new Paciente("Paciente 2", 8);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> vacina.aplicar(paciente, LocalDate.of(2026, 11, 1)));
        assertEquals("Idade inferior à mínima", e.getMessage());
    }

}