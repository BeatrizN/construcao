package home.alunoinf.Construcao.propriedade153;

/**
 * Classe para implementação da propriedade do número 153;
 */
public class Propriedade153 {

    public static boolean propriedade153(int n) {
        if ((n < 0) || (n > 999)) {
            throw new IllegalArgumentException("n inválido");
        }

        int i = n / 100;
        int j = (n - 100*i) / 10;
        int k = n % 10;
        return ((Math.pow(i,3)) + (Math.pow(j,3)) + (Math.pow(k, 3))) == n;
    }
}
