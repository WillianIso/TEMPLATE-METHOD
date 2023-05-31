import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TerrenoTest {

    @Test
    public void testTerrenoRural() {
        Terreno terrenoRural = new TerrenoRural(1000, 100);
        double valorVenda = terrenoRural.calcularValorVenda();
        assertEquals(150, valorVenda, 0);
    }

    @Test
    public void testTerrenoUrbano() {
        Terreno terrenoUrbano = new TerrenoUrbano(1000, 100);
        double valorVenda = terrenoUrbano.calcularValorVenda();
        assertEquals(300, valorVenda, 0);
    }
    @Test
    public void testTerrenoRural2() {
        Terreno terrenoRural = new TerrenoRural(1000, 100);
        double valorVenda = terrenoRural.calcularValorVenda();
        double valorImpostos = terrenoRural.calcularImpostos();
        double valorEsperado = terrenoRural.valorBase + valorImpostos;
        assertEquals(valorEsperado, valorVenda, 0);
    }

    @Test
    public void testTerrenoUrbano2() {
        Terreno terrenoUrbano = new TerrenoUrbano(1000, 100);
        double valorVenda = terrenoUrbano.calcularValorVenda();
        double valorImpostos = terrenoUrbano.calcularImpostos();
        double valorEsperado = terrenoUrbano.valorBase * 2 + valorImpostos;
        assertEquals(valorEsperado, valorVenda, 0);
    }
}
