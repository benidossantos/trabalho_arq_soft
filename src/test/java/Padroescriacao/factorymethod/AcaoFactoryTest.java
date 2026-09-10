package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaAcaoInexistente() {
        try {
            IAcao acao = AcaoFactory.obterAcao("Invocacao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ação inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAcaoInvalida() {
        try {
            IAcao acao = AcaoFactory.obterAcao("Fuga");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ação inválida", e.getMessage());
        }
    }
}
