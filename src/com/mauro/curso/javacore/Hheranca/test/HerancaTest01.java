package com.mauro.curso.javacore.Hheranca.test;

import com.mauro.curso.javacore.Hheranca.domain.Endereco;
import com.mauro.curso.javacore.Hheranca.domain.Funcionario;
import com.mauro.curso.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Mato Grosso");
        endereco.setCep("012345-678");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setCpf("123.456.789-01");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Nicolas");
        funcionario.setCpf("111.111.111-11");
        funcionario.setSalario(1514.0);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
