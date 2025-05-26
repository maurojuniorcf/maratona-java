package com.mauro.curso.javacore.Aintroducaoclasses.test;

import com.mauro.curso.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Matias";
        estudante.age = 17;
        estudante.gender = 'M';

        System.out.println("Nome: " + estudante.name);
        System.out.println("Idade: " + estudante.age);
        System.out.println("Gênero: " + estudante.gender);
        System.out.println("Apelido: " + estudante.apelido);
        System.out.println("----------------------------------");

        Estudante estudante1 = new Estudante();
        estudante1.name = "Isabela";
        estudante1.age = 16;
        estudante1.gender = 'F';
        estudante1.apelido = "Isa";

        System.out.println("Nome: " + estudante1.name);
        System.out.println("Idade: " + estudante1.age);
        System.out.println("Gênero: " + estudante1.gender);
        System.out.println("Apelido: " + estudante1.apelido);
        System.out.println("----------------------------------");

    }
}
