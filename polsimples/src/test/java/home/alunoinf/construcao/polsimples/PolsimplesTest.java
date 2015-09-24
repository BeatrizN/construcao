package home.alunoinf.construcao.polsimples;

        import org.junit.Assert;
        import org.junit.Test;

public class PolsimplesTest {


    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Polsimples.polsimples(2, 3, int[] a = {8 ,2 ,9, 5} );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsegundoParametroInvalido() throws Exception {
        Polsimples.polsimples(3, 0, {2, 7, 0});
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(99, Polsimples.polsimples(2, 4, {3, 2, 5, 1, 4}));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(-11, Polsimples.polsimples( 1, 3, {3, -2, -4, -8}));

    }
}
