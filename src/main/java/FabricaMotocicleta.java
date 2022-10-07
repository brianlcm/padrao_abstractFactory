public class FabricaMotocicleta implements FabricaAbstrata {
    @Override
    public Info createInfo() {
        return new InfoMotocicleta();
    }

    @Override
    public Orcamento createOrcamento() {
        return new OrcamentoMotocicleta();
    }
}
