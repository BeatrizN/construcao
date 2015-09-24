package home.alunoinf.Construcao.raizquadrada;

import org.junit.Assert;
import org.junit.Test;

public class RaizquadradaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Raizquadrada.raizquadrada(0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsegundoParametroInvalido() throws Exception {
        Raizquadrada.raizquadrada( -1, 10);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(2,  Raizquadrada.raizquadrada(4, 2));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(9,  Raizquadrada.raizquadrada(81, 3));
        Assert.assertEquals(5,  Raizquadrada.raizquadrada(25, 2));

    }
}
