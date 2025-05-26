package com.mauro.curso.javacore.Gassociacao.test;

import com.mauro.curso.javacore.Gassociacao.domain.Escola;
import com.mauro.curso.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("José");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Afonso", professores);

        escola.imprime();
    }
}
