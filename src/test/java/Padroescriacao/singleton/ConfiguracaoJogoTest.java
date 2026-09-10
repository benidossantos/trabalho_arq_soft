package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoJogoTest {

    @Test
    public void deveRetornarNomeJogo() {
        ConfiguracaoJogo.getInstance().setNomeJogo("BENI RPG");
        assertEquals("BENI RPG", ConfiguracaoJogo.getInstance().getNomeJogo());
    }

    @Test
    public void deveRetornarJogadorAtual() {
        ConfiguracaoJogo.getInstance().setJogadorAtual("Bernardo");
        assertEquals("Bernardo", ConfiguracaoJogo.getInstance().getJogadorAtual());
    }

}
