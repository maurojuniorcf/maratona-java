package com.matias.curso.javacore.Bintroducaometodos.test;

import com.matias.curso.javacore.Bintroducaometodos.dominio.Estudante;
import com.matias.curso.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante.name = "Isabela";
        estudante.age = 16;
        estudante.gender = 'F';
        estudante.apelido = "Isa";

        estudante02.name = "Matias";
        estudante02.age = 17;
        estudante02.gender = 'M';

        impressoraEstudante.imprime(estudante);
        impressoraEstudante.imprime(estudante02);
    }
}
