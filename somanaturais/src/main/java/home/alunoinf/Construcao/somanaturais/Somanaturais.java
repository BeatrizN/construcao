package home.alunoinf.Construcao.somanaturais;

/**
 * Soma de numeros naturais de 1 até o numero de entrada
 */
public class Somanaturais {
    public static int somanaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inválido");
        }
        int i = 2;
        int s = 1;
        while (i <= n) {
            s += i;
            i++;
        }
        return s;
    }
}

