package com.matias.curso.introducao;

public class Aula06Exercicio3 {

    public static void main(String[] args) {
        double valorDoCarro = 40000;

        for (int parcelas = (int) valorDoCarro; parcelas >= 1; parcelas--) {
            double valorParcela = valorDoCarro / parcelas;
            /*if (parcelas <= 40) {
                System.out.println("Parcelas: " + parcelas + " - R$" + valorParcela);
            }*/
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcelas: " + parcelas + " - R$" + valorParcela);
        }
    }
}
