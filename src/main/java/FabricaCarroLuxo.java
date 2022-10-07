public class FabricaCarroLuxo implements FabricaAbstrata {

    @Override
    public Info createInfo() {
        return new InfoCarroLuxo();
    }

    @Override
    public Orcamento createOrcamento() {
        return new OrcamentoCarroLuxo();
    }
}
