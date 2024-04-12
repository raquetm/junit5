package refactorizacion;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnagramaTest {

 	@Test
 	public void testAnagrama() {
     	assertTrue(Anagrama.esAnagrama("Fresa", "frase"));
        assertTrue(Anagrama.esAnagrama("mango", "magno"));
        assertTrue(Anagrama.esAnagrama("ciruela", "Relucia"));
    }

    @Test
    public void testNoAnagrama() {
        assertFalse(Anagrama.esAnagrama("fresa", "nata"));
        assertFalse(Anagrama.esAnagrama("Mango", "piña"));
        assertFalse(Anagrama.esAnagrama("ciruela", "amarilla"));
    }
    
}
