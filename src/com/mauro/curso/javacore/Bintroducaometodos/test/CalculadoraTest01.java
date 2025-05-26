package com.mauro.curso.javacore.Bintroducaometodos.test;

import com.mauro.curso.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.print("Adição: ");
        calculadora.somarDoisNumeros();
        System.out.print("Subtração: ");
        calculadora.subtrairDoisNumeros();
        System.out.print("Multiplicação: ");
        calculadora.multiplicarDoisNumeros(5, 30);
        System.out.println("Finalizando CalculadoraTest01");
    }
}
