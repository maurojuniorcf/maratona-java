package com.matias.curso.introducao;

import java.util.Arrays;

public class Aula07Arrays01 {

    public static void main(String[] args) {
        int[] idades = new int[3];
        int[] ages = new int[]{16, 17};

        idades[0] = 16;
        idades[1] = 17;
        idades[2] = 20;
        System.out.println("As idades são: " + idades[0] + ", " + idades[1] + " e " + idades[2]);
        System.out.println("Otavio: " + ages[1] + " anos");
        System.out.println("Isabela: " + ages[0] + " anos");
    }
}
