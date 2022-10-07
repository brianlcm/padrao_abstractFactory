public class OrcamentoCarroPopular implements Orcamento {
    public float emiteCustoTotal() {
        return 100;
    }

    @Override
    public float emiteCustoPorHora() {
        return 10;
    }
}
