package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcaoDefesaTest {

    @Test
    void deveExecutarDefesa() {
        IAcao acao = AcaoFactory.obterAcao("Defesa");
        assertEquals("Defesa efetivada", acao.executar());
    }

    @Test
    void deveCancelarDefesa() {
        IAcao acao = AcaoFactory.obterAcao("Defesa");
        assertEquals("Defesa cancelada", acao.cancelar());
    }

}