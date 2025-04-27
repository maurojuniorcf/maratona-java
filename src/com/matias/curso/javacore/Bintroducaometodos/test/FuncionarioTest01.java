package com.matias.curso.javacore.Bintroducaometodos.test;

import com.matias.curso.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Bruno";
        funcionario.idade = 21;
        funcionario.salarios = new double[]{1404.0, 1466.0, 5345.0};
        funcionario.imprime();

    }
}