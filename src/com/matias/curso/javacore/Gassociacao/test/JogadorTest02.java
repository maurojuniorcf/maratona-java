package com.matias.curso.javacore.Gassociacao.test;

import com.matias.curso.javacore.Gassociacao.domain.Jogador;
import com.matias.curso.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
