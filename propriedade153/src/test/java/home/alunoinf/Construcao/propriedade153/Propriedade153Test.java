package home.alunoinf.Construcao.propriedade153;

import org.junit.Assert;
import org.junit.Test;
public class Propriedade153Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoMenor() throws Exception {
        Propriedade153.propriedade153(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoMaior() throws Exception {
        Propriedade153.propriedade153(55555);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertTrue(Propriedade153.propriedade153(153));
        Assert.assertFalse(Propriedade153.propriedade153(909));
        Assert.assertFalse(Propriedade153.propriedade153(10));
    }
}