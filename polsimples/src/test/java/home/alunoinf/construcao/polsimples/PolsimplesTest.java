package home.alunoinf.construcao.polsimples;

        import org.junit.Assert;
        import org.junit.Test;

public class PolsimplesTest {


    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        int a[] = {1, 0 ,9, 5};
        Polsimples.polsimples(2, 0, a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUltimoParametroInvalido() throws Exception {
        int [] a = {2, 7, 0};
        Polsimples.polsimples(3, 0, a);
    }

    @Test
    public void testCasosDeFronteira() {
        int [] a = {3, 2, 5, 1, 4};
        Assert.assertEquals(99, Polsimples.polsimples(2, 4, a));
    }

    @Test
    public void testCasoTrivial() {
        int [] a = {3, -2, -4, -8};
        Assert.assertEquals(-11, Polsimples.polsimples( 1, 3, a));

    }
}
