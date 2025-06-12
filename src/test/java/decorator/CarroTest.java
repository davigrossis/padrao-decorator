package decorator;

import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarPrecoAluguelCarroBasico() {
        Carro carro = new CarroBasico(200.0f);

        assertEquals(200.0f, carro.getPrecoAluguel());
    }

    @Test
    void deveRetornarPrecoAluguelComSeguro() {
        Carro carro = new Seguro(new CarroBasico(200.0f));

        assertEquals(250.0f, carro.getPrecoAluguel());
    }

    @Test
    void deveRetornarPrecoAluguelComGPS() {
        Carro carro = new GPS(new CarroBasico(200.0f));

        assertEquals(220.0f, carro.getPrecoAluguel());
    }

    @Test
    void deveRetornarPrecoAluguelComCadeiraInfantil() {
        Carro carro = new CadeiraInfantil(new CarroBasico(200.0f));

        assertEquals(215.0f, carro.getPrecoAluguel());
    }

    @Test
    void deveRetornarPrecoAluguelComSeguroEGPS() {
        Carro carro = new Seguro(new GPS(new CarroBasico(200.0f)));

        assertEquals(270.0f, carro.getPrecoAluguel());
    }

    @Test
    void deveRetornarPrecoAluguelComSeguroECadeira() {
        Carro carro = new Seguro(new CadeiraInfantil(new CarroBasico(200.0f)));

        assertEquals(265.0f, carro.getPrecoAluguel());
    }

    @Test
    void deveRetornarPrecoAluguelComGPSMaisCadeira() {
        Carro carro = new GPS(new CadeiraInfantil(new CarroBasico(200.0f)));

        assertEquals(235.0f, carro.getPrecoAluguel());
    }

    @Test
    void deveRetornarPrecoAluguelComTodosServicos() {
        Carro carro = new Seguro(new GPS(new CadeiraInfantil(new CarroBasico(200.0f))));

        assertEquals(285.0f, carro.getPrecoAluguel());
    }

    @Test
    void deveRetornarDescricaoCarroBasico() {
        Carro carro = new CarroBasico(200.0f);

        assertEquals("Aluguel do Carro", carro.getServicos());

    }

    @Test
    void deveRetornarDescricaoComSeguro() {
        Carro carro = new Seguro(new CarroBasico(200.0f));

        assertEquals("Aluguel do Carro + Seguro Completo", carro.getServicos());
    }

    @Test
    void deveRetornarDescricaoComGPS() {
        Carro carro = new GPS(new CarroBasico(200.0f));

        assertEquals("Aluguel do Carro + GPS", carro.getServicos());
    }

    @Test
    void deveRetornarDescricaoComCadeiraInfantil() {
        Carro carro = new CadeiraInfantil(new CarroBasico(200.0f));

        assertEquals("Aluguel do Carro + Cadeira Infantil", carro.getServicos());
    }

    @Test
    void deveRetornarDescricaoComSeguroEGPS() {
        Carro carro = new Seguro(new GPS(new CarroBasico(200.0f)));

        assertEquals("Aluguel do Carro + GPS + Seguro Completo", carro.getServicos());
    }

    @Test
    void deveRetornarDescricaoComSeguroECadeira() {
        Carro carro = new Seguro(new CadeiraInfantil(new CarroBasico(200.0f)));

        assertEquals("Aluguel do Carro + Cadeira Infantil + Seguro Completo", carro.getServicos());
    }

    @Test
    void deveRetornarDescricaoComGPSMaisCadeira() {
        Carro carro = new GPS(new CadeiraInfantil(new CarroBasico(200.0f)));

        assertEquals("Aluguel do Carro + Cadeira Infantil + GPS", carro.getServicos());
    }

    @Test
    void deveRetornarDescricaoComTodosServicos() {
        Carro carro = new Seguro(new GPS(new CadeiraInfantil(new CarroBasico(200.0f))));

        assertEquals("Aluguel do Carro + Cadeira Infantil + GPS + Seguro Completo", carro.getServicos());
    }
}
