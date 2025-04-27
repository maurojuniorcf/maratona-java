package com.matias.curso.javacore.Bintroducaometodos.test;

import com.matias.curso.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {

    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numbers = {1,2,3,4,5};
        calculadora.somaArray(numbers);
        System.out.println("or");
        calculadora.somaArray(new int[]{1,2,3,4,5});
        System.out.println("or");
        calculadora.somarVarArgs(1,2,3,4,5);
    }
}
