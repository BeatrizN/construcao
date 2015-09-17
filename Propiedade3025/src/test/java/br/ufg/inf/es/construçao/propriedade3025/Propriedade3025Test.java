package br.ufg.inf.es.construçao.propriedade3025;

import org.junit.Assert;
import org.junit.Test;


public class Propriedade3025Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoMenor() throws Exception {
       Propiedade3025.propriedade(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNumeroInvalidoMaior() throws Exception {
        Propiedade3025.propriedade(55555);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertTrue(Propiedade3025.propriedade(3025));
        Assert.assertFalse(Propiedade3025.propriedade(9009));
        Assert.assertFalse(Propiedade3025.propriedade(910));
    }
}