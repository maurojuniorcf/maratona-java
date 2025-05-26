package com.mauro.curso.javacore.Bintroducaometodos.test;

import com.mauro.curso.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.name = "Isabela";
        estudante.age = 16;
        estudante.gender = 'F';
        estudante.apelido = "Isa";

        estudante1.name = "Matias";
        estudante1.age = 17;
        estudante1.gender = 'M';

        estudante.imprime();
        estudante1.imprime();
    }
}
