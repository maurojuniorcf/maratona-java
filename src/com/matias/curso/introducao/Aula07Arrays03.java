package com.matias.curso.introducao;

public class Aula07Arrays03 {

    public static void main(String[] args) {
        int[] numeros = new int[]{1,2,3,4,5,6};
        String[] names = new String[]{"Eduardo", "Isabela", "João", "Matias", "Davi"};

        for (int i : numeros) {
            System.out.println(i);
        }
        for (String i : names) {
            System.out.println(i);
        }
    }
}
