package com.matias.curso.introducao;

import javax.management.MBeanRegistration;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {
        int day = 8;
        String noDay = "Nenhum dia identificado.";

        switch (day) {
            case 1:
                System.out.println("Domingo: final de semana");
                break;
            case 2:
                System.out.println("Segunda feira: acaba com qualquer um (dia util)");
                break;
            case 3:
                System.out.println("Terça: dia util");
                break;
            case 4:
                System.out.println("Quarta: dia util");
                break;
            case 5:
                System.out.println("Quinta: dia util");
                break;
            case 6:
                System.out.println("Sexta: vem ni mim papai (dia util)");
                break;
            case 7:
                System.out.println("Sábado: final de semana");
                break;
            default:
                System.out.println(noDay);
        }
    }
}
