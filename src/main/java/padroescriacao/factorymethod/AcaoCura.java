package padroescriacao.factorymethod;

public class AcaoCura implements IAcao {

    public String executar() {
        return "Cura efetivada";
    }

    public String cancelar() {
        return "Cura cancelada";
    }
}
