package com.matias.curso.javacore.Bintroducaometodos.test;

import com.matias.curso.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mauro");
        pessoa.setIdade(17);
        pessoa.imprime();
//        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
    }
}
