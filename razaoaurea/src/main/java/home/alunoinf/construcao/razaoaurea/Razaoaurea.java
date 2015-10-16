package home.alunoinf.construcao.razaoaurea;

/**
 *Classe para implementar a razão áurea;
 */
public class Razaoaurea {

    /**
     * Calcula RAZÃO ÁREA.
     * t1 é o primeiro termo de ta (termo anterior).
     * t2 é o primeiro termo de tc (termo corrente).
     * Retorna a Razão Áurea.
     */

    public static long razaoaurea(int t1, int t2, int fator) {
        if ((t1 <= 0) || (t2 <= 0) || (fator <= 0)) {
            throw new IllegalArgumentException("Entre com valores maiores que zero!");
        }
        int tc = t2;
        int ta = t1;
        int i = 1;
        while (i <= fator) {
            tc += ta;
            ta = tc - ta;
            i++;
        }
        return (tc / ta);
    }
}
