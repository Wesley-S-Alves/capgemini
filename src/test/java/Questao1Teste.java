import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Questao1Teste {
    @Test
    void criaEscadaTeste() {
        String result = Questao1.criaEscada(5);
        String resultExp = "    *\n   **\n  ***\n ****\n*****\n";
        Assertions.assertEquals(result, resultExp);
    }
}
