package home.alunoinf.Construcao.raizquadrada;

/**
 * Classe para calcular raiz-quadrada
 */
public class Raizquadrada {

    public static int raizquadrada(int n, int i) {
        if (n <= 0) {
            throw new IllegalArgumentException("n menor que zero");
        }
        int r = 1;
        while(i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }
        return r;
    }
}