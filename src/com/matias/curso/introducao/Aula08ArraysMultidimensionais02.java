package com.matias.curso.introducao;

public class Aula08ArraysMultidimensionais02 {

    public static void main(String[] args) {
        int[][] meses = new int[3][];

        meses[0] = new int[]{1,2,3};
        meses[1] = new int[]{4,5,6,7,8};
        meses[2] = new int[]{9,10,11,12,13,14,15};

        for (int[] arrayBase : meses) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
