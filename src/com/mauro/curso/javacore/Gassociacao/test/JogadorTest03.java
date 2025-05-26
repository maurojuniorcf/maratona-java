package com.mauro.curso.javacore.Gassociacao.test;

import com.mauro.curso.javacore.Gassociacao.domain.Jogador;
import com.mauro.curso.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {

    public static void main(String[] args) {
        Time time = new Time("Seleção Brasileira");
        Jogador jogador = new Jogador("Pelé");
        Jogador[] jogadores = {jogador};
        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time --- ");
        time.imprime();
    }
}
