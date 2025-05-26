package com.mauro.curso.javacore.Bintroducaometodos.test;

import com.mauro.curso.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(20, 0);
        double second_result = calculadora.dividirDoisNumeros02(20, 2);
        calculadora.imprimeDivisaoDeDoisNumeros(10, 0);
        System.out.println(result);
        System.out.println(second_result);
    }
}
