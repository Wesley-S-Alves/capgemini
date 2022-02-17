import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Questao3Teste {
    @Test
    void procuraAnagramaTeste() {
        String anagrama = "ifailuhkqq";
        int result = Questao3.procuraAnagrama(anagrama);
        Assertions.assertEquals(3, result);
    }
}
