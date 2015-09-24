package home.alunoinf.construcao.polsimples;

/**
 * Classe para calcular polinomios
 */

import java.lang.Math;

public class Polsimples {
    public static int polsimples(int x, int g, int[] a) {
        if ((g < 1) || (a[g] == 0)) {
            throw new IllegalArgumentException("g menor que zero ou a igual a zero");
        }
        double p = a[0];
        int i = 1;
        double t = Math.pow(x, g);

        while (i <= g) {
            t = Math.pow(x, i);
            p = (p + a[i] * t);
            i += 1;
        }
        return (int) p;
    }
}
