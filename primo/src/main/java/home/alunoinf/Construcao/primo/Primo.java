package home.alunoinf.Construcao.primo;

/**
 * classe para verificar se um numero e primo ou nao.
 */
public class Primo {
    public static boolean primo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n invalido");
        }
        int i = 2;
        while (i <= (n - 1)) {
            if ((n % 2) == 0) {
                return false;
            }
            i ++;
        }
        return true;
    }
}

