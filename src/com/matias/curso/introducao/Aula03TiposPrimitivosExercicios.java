package com.matias.curso.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */

public class Aula03TiposPrimitivosExercicios {

    public static void main(String[] args) {

        String name = "João";
        String adress = "R Sao Jorge número 200";
        int salario = 1509;
        String date = "27/03/2030";
        String message = "Eu João, morando no endereço R Sao Jorge número 200, confirmo que recebi o salário de R$1.509 reais, na data 26/03/2025";

        System.out.println("FORMA PRÁTICA: Eu " + name + ", morando no endereço " + adress + ", confirmo que recebi o salário de R$" + salario + " reais, na data " + date);
        System.out.println("FORMA MAIS RÁPIDA: " + message);

    }
}
