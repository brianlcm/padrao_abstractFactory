public class FabricaCarroPopular implements FabricaAbstrata {
    @Override
    public Info createInfo() {
        return new InfoCarroPopular();
    }

    @Override
    public Orcamento createOrcamento() {
        return new OrcamentoCarroPopular();
    }
}
