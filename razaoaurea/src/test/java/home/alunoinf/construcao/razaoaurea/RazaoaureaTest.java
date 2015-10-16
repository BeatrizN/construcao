package home.alunoinf.construcao.razaoaurea;

        import org.junit.Assert;
        import org.junit.Test;

public class RazaoaureaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Razaoaurea.razaoaurea(0, 5, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Razaoaurea.razaoaurea(3, 0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParametroInvalido() throws Exception {
        Razaoaurea.razaoaurea(3, 2, 0);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals((36/24), Razaoaurea.razaoaurea(10, 2, 3));
        Assert.assertEquals((21/12) , Razaoaurea.razaoaurea(9, 3, 2));
        Assert.assertEquals(2, Razaoaurea.razaoaurea(10, 10, 1));
        Assert.assertEquals((42/26), Razaoaurea.razaoaurea(4, 2, 5));

    }
}
