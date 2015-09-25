package home.alunoinf.Construcao.crivoerat;

import org.junit.Assert;
import org.junit.Test;

public class CrivoeratTest {

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        int a[] = {1, 0, 9, 5};
        Crivoerat.crivoerat(a, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsegundoVetorInvalido() throws Exception {
        int[] a = {2, 7, 6, 10, 8};
        Crivoerat.crivoerat(a, 5);
    }

    @Test
    public void testQuatroNaoPrimoCincoPrimo() {
        int[] a = new int[6];
        Crivoerat.crivoerat(a, 5);

        int[] expected = { 0, 0, 0, 0, 1, 0 };
        Assert.assertArrayEquals(expected, a);
    }

    @Test
    public void testUltimoPrimoSendoDezenove() {
        int[] a = new int[20];
        Crivoerat.crivoerat(a, 19);

        int[] expected = { 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0 };
        Assert.assertArrayEquals(expected, a);
    }

}
