package padroescriacao.factorymethod;

public class AcaoDefesa implements IAcao {

    public String executar() {
        return "Defesa efetivada";
    }

    public String cancelar() {
        return "Defesa cancelada";
    }
}
