import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CaixaEletornicoTest {

    @Test
    void deveSerPossivelSacarUmaNotaDe50() {
        Cedula cedula = new Cedula(50, 1);

        List<Cedula> listaDeCedulas = new ArrayList<Cedula>();
        listaDeCedulas.add(new Cedula(50, 1));

        Assertions.assertEquals(listaDeCedulas.get(0).getValorDaCedula(), cedula.getValorDaCedula());
    }

    @Test
    void deveSerPossivelSacarDuasNotasUmaDe50EUmaDe10() {
        Cedula cedula = new Cedula(50, 1);
        Cedula cedula2 = new Cedula(10, 1);

        List<Cedula> listaDeCedulas = new ArrayList<Cedula>();
        listaDeCedulas.add(new Cedula(50, 1));
        listaDeCedulas.add(new Cedula(10, 1));

        Assertions.assertEquals(listaDeCedulas.get(0).getValorDaCedula(), cedula.getValorDaCedula());
        Assertions.assertEquals(listaDeCedulas.get(1).getValorDaCedula(), cedula2.getValorDaCedula());
    }

    @Test
    void devePermitirSacarValorEmDolar() {
       //nao encontrei uma solucao, preciso de ajuda para chegar nesse resultado.
    }
}