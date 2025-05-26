package com.mauro.curso.introducao;

public class Aula06Exercicio2 {

    public static void main(String[] args) {
        double valorDoCarro = 30000;

        for (int parcelas = 1; parcelas < valorDoCarro; parcelas++) {
            double valorParcela = valorDoCarro / parcelas;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcelas: " + parcelas + " - R$" + valorParcela);
        }
    }
}
