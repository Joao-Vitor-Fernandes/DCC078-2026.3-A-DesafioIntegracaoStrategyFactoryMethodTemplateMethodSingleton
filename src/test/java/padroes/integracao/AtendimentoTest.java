package padroes.integracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {

    @BeforeEach
    void setUp() {
        PostoSaude posto = PostoSaude.getInstance();
        posto.setNomePosto("Posto Vacina 1");
        posto.setProfissionalResponsavel("Enfermeiro 1");
        posto.setEstoqueHPV(5);
    }

    @Test
    void deveVacinarPeloNomeDaVacina() {
        Atendimento atendimento = new Atendimento();
        Paciente paciente = new Paciente("Paciente 1", 12);
        assertEquals("Vacinacao Adolescente{vacina='HPV', paciente='Paciente 1', dose=1/2, posto='Posto Vacina 1', profissional='Enfermeiro 1', proximaDose=30/04/2027}", atendimento.vacinar("HPV", paciente, LocalDate.of(2026, 11, 1)));
    }

}
