package padroescriacao.factorymethod;

public class AcaoAtaque implements IAcao {

    public String executar() {
        return "Ataque efetivado";
    }

    public String cancelar() {
        return "Ataque cancelado";
    }
}
