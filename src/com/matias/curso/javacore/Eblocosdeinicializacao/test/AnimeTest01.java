package com.matias.curso.javacore.Eblocosdeinicializacao.test;

import com.matias.curso.javacore.Eblocosdeinicializacao.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
