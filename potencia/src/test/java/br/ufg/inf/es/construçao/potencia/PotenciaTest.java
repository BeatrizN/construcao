package br.ufg.inf.es.construçao.potencia;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alunoinf on 10/09/15.
 */
public class PotenciaTest {
    @Test
    public void testPotencia() throws Exception {

        Assert.assertEquals(4, Potencia.potencia(2, 2));
    }
}
