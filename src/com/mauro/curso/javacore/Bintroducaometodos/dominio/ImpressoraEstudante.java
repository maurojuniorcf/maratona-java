package com.mauro.curso.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {

    public void imprime(Estudante estudante) {
        System.out.println("---------------Informações do(a) Estudante---------------");
        System.out.println("Nome: " + estudante.name);
        System.out.println("Idade: " + estudante.age);
        System.out.println("Gênero: " + estudante.gender);
        System.out.println("Apelido: " + estudante.apelido);
    }
}
