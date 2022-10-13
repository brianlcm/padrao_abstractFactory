public class Automovel {

    private Info informacoes;
    private Orcamento orcamento;

    public Automovel (FabricaAbstrata fabrica) {
        this.informacoes = fabrica.createInfo();
        this.orcamento = fabrica.createOrcamento();
    }

    public String emitirInfo() {
        return this.informacoes.emitirInfos();
    }

    public String emitirOrcamento() {
        return this.orcamento.emiteCustoTotal();
    }

}
