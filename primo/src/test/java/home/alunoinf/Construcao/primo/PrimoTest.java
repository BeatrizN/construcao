package home.alunoinf.Construcao.primo;

import org.junit.Assert;
import org.junit.Test;

public class PrimoTest {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoMenor() throws Exception {
        Primo.primo(-1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertTrue(Primo.primo(23));
        Assert.assertTrue(Primo.primo(3));
        Assert.assertFalse(Primo.primo(26));
        Assert.assertFalse(Primo.primo(910));
    }
}

