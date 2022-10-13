import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomovelTest {

    @Test
    void deveEmitirInfoCarroLuxo() {
        FabricaAbstrata fabrica = new FabricaCarroLuxo();
        Automovel automovel = new Automovel(fabrica);
        assertEquals("Informações do Carro de Luxo", automovel.emitirInfo());
    }

    @Test
    void deveEmitirInfoMotocicleta() {
        FabricaAbstrata fabrica = new FabricaMotocicleta();
        Automovel automovel = new Automovel(fabrica);
        assertEquals("Informações da Motocicleta", automovel.emitirInfo());
    }

    @Test
    void deveEmitirOrcamentoCarroPopular() {
        FabricaAbstrata fabrica = new FabricaCarroPopular();
        Automovel automovel = new Automovel(fabrica);
        assertEquals("Orçamento do Carro Popular", automovel.emitirOrcamento());
    }

    @Test
    void deveEmitirOrcamentoMotocicleta() {
        FabricaAbstrata fabrica = new FabricaMotocicleta();
        Automovel automovel = new Automovel(fabrica);
        assertEquals("Orçamento da Motocicleta", automovel.emitirOrcamento());
    }

}