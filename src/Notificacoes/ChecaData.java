package Notificacoes;

import java.util.Scanner;

public class ChecaData {
//Classe utilizada para filtro de dados com relação à datas
    public static int checaAno(int i) {
        if (i >= 2000) {
            return i;
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano da visita (2000 para cima):");

        return checaAno(entrada.nextInt());
    }

    public static int checaMes(int i) {
        if (i > 0 && i <= 12) {
            return i;
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o mês da visita :");
        return checaMes(entrada.nextInt());
    }

    public static int checaDia(int dia, int mes) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia > 0 && dia <= 31) {
                    return dia;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 0 && dia <= 30) {
                    return dia;
                }
                break;
            case 2:
                if (dia > 0 && dia <= 28) {
                    return dia;
                }
                break;
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da visita :");
        return checaDia(entrada.nextInt(), mes);

    }
}
