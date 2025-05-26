package com.mauro.curso.introducao;

public class Aula06EstruturasRepetição01 {

    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            /*System.out.println("while: " + ++count);*/
            System.out.println("while: " + count);
            count++;
        }
        System.out.println("--------------------------------------");
        count = 0;
        do {
            /*System.out.println("do-while: " + ++count);*/
            System.out.println("do-while: "+count);
            count++;
        } while (count <10);

        System.out.println("--------------------------------------");
        for (int i = 0; i < 10; i++) {
            /*System.out.println("for: " + ++i);*/
            System.out.println("for: " + i);
        }
    }
}
