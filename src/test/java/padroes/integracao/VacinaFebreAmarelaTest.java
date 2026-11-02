package padroes.integracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class VacinaFebreAmarelaTest {

    @BeforeEach
    void setUp() {
        PostoSaude posto = PostoSaude.getInstance();
        posto.setNomePosto("Posto Vacina 1");
        posto.setProfissionalResponsavel("Enfermeiro 1");
        posto.setEstoqueFebreAmarela(4);
    }

    @Test
    void deveAplicarDoseUnica() {
        VacinaFebreAmarela vacina = new VacinaFebreAmarela();
        Paciente paciente = new Paciente("Paciente 1", 1);
        assertEquals("Vacinacao{vacina='Febre Amarela', paciente='Paciente 1', dose=1/1, posto='Posto Vacina 1', profissional='Enfermeiro 1', proximaDose=esquema completo}", vacina.aplicar(paciente, LocalDate.of(2026, 11, 1)));
    }
}
