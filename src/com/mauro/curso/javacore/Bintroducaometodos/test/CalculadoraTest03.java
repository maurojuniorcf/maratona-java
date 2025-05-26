package com.mauro.curso.javacore.Bintroducaometodos.test;

import com.mauro.curso.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num, num2);
        System.out.println("Dentro da CalculadoraTest03");
        System.out.println("Num: "+num);
        System.out.println("Num2: "+ num2);
    }
}
