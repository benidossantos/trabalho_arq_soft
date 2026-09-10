package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcaoCuraTest {

    @Test
    void deveExecutarCura() {
        IAcao acao = AcaoFactory.obterAcao("Cura");
        assertEquals("Cura efetivada", acao.executar());
    }

    @Test
    void deveCancelarCura() {
        IAcao acao = AcaoFactory.obterAcao("Cura");
        assertEquals("Cura cancelada", acao.cancelar());
    }

}
