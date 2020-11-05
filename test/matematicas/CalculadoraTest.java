package matematicas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author ulises126
 */

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSuma() {
        int total = 8;
        int sum = Calculadora.suma(5, 3);
        assertEquals(sum, total);
    }
    
    @Test
    public void testResta() {
        int res = 8;
        int sum = Calculadora.resta(5, 3);
        assertEquals(sum, res);
    }
}
