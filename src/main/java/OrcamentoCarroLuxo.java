public class OrcamentoCarroLuxo implements Orcamento {
    public float emiteCustoTotal() {
        return 300;
    }

    @Override
    public float emiteCustoPorHora() {
        return 30;
    }
}
