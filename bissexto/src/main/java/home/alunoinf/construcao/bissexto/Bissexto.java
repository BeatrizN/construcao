package home.alunoinf.construcao.bissexto;

import java.util.Scanner;

public class Bissexto {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o ano");
        int ano = in.nextInt();
        if ((ano % 400 == 0) || (((ano % 4) == 0) && ((ano % 100) != 0))) {
            System.out.println("É bissexto");
        }else{
            System.out.println("Não é bissexto");
        }
    }
}


