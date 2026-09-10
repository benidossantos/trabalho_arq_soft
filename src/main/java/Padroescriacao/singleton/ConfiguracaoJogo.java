package padroescriacao.singleton;

public class ConfiguracaoJogo {

    private ConfiguracaoJogo() {};
    private static ConfiguracaoJogo instance = new ConfiguracaoJogo();
    public static ConfiguracaoJogo getInstance() {
        return instance;
    }

    private String nomeJogo;
    private String jogadorAtual;

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getJogadorAtual() {
        return jogadorAtual;
    }

    public void setJogadorAtual(String jogadorAtual) {
        this.jogadorAtual = jogadorAtual;
    }
}
