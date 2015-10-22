package home.alunoinf.Construcao.somanaturais;

import org.junit.Assert;
import org.junit.Test;

public class SomanaturaisTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Somanaturais.somanaturais(0);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(6, Somanaturais.somanaturais(3));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(15, Somanaturais.somanaturais(5));
        Assert.assertEquals(28, Somanaturais.somanaturais(7));
    }
}

