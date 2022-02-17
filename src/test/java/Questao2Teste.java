import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Questao2Teste {
    @Test
    void checaSenhaTeste() {
        String senha = "Ya3&ab";
        boolean result = Questao2.checaSenha(senha);
        Assertions.assertEquals(true, result);
    }
}
