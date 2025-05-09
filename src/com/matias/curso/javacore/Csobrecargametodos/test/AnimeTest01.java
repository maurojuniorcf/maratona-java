package com.matias.curso.javacore.Csobrecargametodos.test;

import com.matias.curso.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto Shippuden", "TV", 24);
        anime.imprime();
    }
}
