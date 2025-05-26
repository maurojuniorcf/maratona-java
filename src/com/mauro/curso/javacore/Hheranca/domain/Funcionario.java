package com.mauro.curso.javacore.Hheranca.domain;

public class Funcionario extends Pessoa{

    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamentos() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
