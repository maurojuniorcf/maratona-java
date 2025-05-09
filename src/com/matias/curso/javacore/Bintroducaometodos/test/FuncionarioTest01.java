package com.matias.curso.javacore.Bintroducaometodos.test;

import com.matias.curso.javacore.Bintroducaometodos.dominio.Funcionario;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Matias");
        funcionario.setIdade(17);
        funcionario.setSalarios(new double[]{1404.0, 1466.0, 5345.0});
        System.out.println("Média salarial: " + funcionario.getMedia());

    }
}