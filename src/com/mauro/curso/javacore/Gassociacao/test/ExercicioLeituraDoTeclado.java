package com.mauro.curso.javacore.Gassociacao.test;

import java.util.Scanner;

public class ExercicioLeituraDoTeclado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Faça sua pergunta e eu responderei com sim ou não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
