package padroescriacao.factorymethod;

public class AcaoFactory {

    public static IAcao obterAcao(String acao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Acao" + acao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Ação inexistente");
        }
        if (!(objeto instanceof IAcao)) {
            throw new IllegalArgumentException("Ação inválida");
        }
        return (IAcao) objeto;
    }
}
