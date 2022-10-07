public class OrcamentoMotocicleta implements Orcamento {
    public float emiteCustoTotal() {
        return 50;
    }

    @Override
    public float emiteCustoPorHora() {
        return 5;
    }
}
