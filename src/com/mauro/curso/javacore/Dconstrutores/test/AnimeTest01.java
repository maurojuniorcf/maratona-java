package com.mauro.curso.javacore.Dconstrutores.test;

import com.mauro.curso.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime("Naruto Shippuden", "TV", 35, "Ação", "Production IG");
        Anime anime1 = new Anime();
        anime.imprime();
        anime1.imprime();
    }
}
