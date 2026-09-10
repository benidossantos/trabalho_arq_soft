package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcaoAtaqueTest {

    @Test
    void deveExecutarAtaque() {
        IAcao acao = AcaoFactory.obterAcao("Ataque");
        assertEquals("Ataque efetivado", acao.executar());
    }

    @Test
    void deveCancelarAtaque() {
        IAcao acao = AcaoFactory.obterAcao("Ataque");
        assertEquals("Ataque cancelado", acao.cancelar());
    }

}
