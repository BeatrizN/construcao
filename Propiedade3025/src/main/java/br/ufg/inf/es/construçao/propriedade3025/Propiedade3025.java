package br.ufg.inf.es.construçao.propriedade3025;

/**
 * Classe da PROPIEDADE3025
 * Para saber se o quadrado da soma dos dois digitos mais significativos de um numeros (n)
 * com seus dois digitos menos significativos é igual a ele mesmo (n).
 */
public class Propiedade3025 {
    /**
     *
     * @param n número n >=0 E n <= 9999
     * @return se o número possue a propriedade 3025
     */
    public static boolean propriedade(int n) {
        if ((n > 9999) || (n < 0)) {
            throw new IllegalArgumentException("n invalido");
        }

        int i;
        i = n / 100;
        int j;
        j = n % 100;
        boolean propriedade3025 = ((i + j) * (i + j)) == n;
        return propriedade3025;
    }
}




