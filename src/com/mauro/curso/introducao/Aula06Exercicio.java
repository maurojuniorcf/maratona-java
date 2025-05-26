package com.mauro.curso.introducao;

public class Aula06Exercicio {

    public static void main(String[] args) {
        int count = 0;
        int valorMax = 50;

        while (count < 1000000) {
            System.out.println("while: "+count);
            count = count + 2;
        }
        System.out.println("------------------------------------");
        for (int i = 0; i < 1000000; i++) {
            System.out.println("for: "+ +i);
            i++;
        }
        for (int i =0; i <= valorMax; i++) {
            if (i <= 25) {
                System.out.println("Resolução 1:" + i);
            }
        }

        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("Resolução 2: "+i);
        }
    }
}
