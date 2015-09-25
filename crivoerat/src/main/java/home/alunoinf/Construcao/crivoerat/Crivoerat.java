package home.alunoinf.Construcao.crivoerat;

/**
 * Created by alunoinf on 24/09/15.
 */
public class Crivoerat {
    public static void crivoerat(int[] a, int n) {
        for(int i = 2; i <= n; i++){
            if (a[i] != 0) {
                throw new IllegalArgumentException("n menor que zero");
            }
        }
        if(n <= 1) {
            throw new IllegalArgumentException("n menor que zero");
        }
        int i = 2;
        while(i <= n/2) {
            if (a[i] == 0) {
                int c = i + i;
                while (c <= n) {
                    a[c] = 1;
                    c += i;
                }
             }
            i += 1;
        }
    }
}

