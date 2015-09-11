package br.ufg.inf.es.construçao.potencia;

/**
 * Classe que implementa potencia.
 */
public class Potencia {

    public static int potencia(int x, int y) {
        if (x <= 0 || y < 0) {
            throw new IllegalArgumentException("x ou y inválido");
        }

        int i = 1;
        int p = 1;
        while (i <= y) {
            p = p * x;
            i = i + 1;
        }

        return p;
    }
}