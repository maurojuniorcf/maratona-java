package com.mauro.curso.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicarDoisNumeros(double number, double number2) {
        System.out.println(number * number2);
    }

    public double dividirDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        System.out.println("Não tem como dividir por zero.");
        return 0;
    }

    public double dividirDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não tem como dividir por zero.");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num, int num2) {
        num = 99;
        num2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num: " + num);
        System.out.println("Num2: " + num2);
    }

    public void somaArray(int[] numbers) {
        int soma = 0;
        for (int i : numbers) {
            soma += i;
        }
        System.out.println(soma);
    }

    public void somarVarArgs(int... numbers) {
        int soma = 0;
        for (int i : numbers) {
            soma += i;
        }
        System.out.println(soma);
    }
}
