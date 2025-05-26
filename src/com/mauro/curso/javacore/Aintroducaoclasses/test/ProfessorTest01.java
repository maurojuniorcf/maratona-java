package com.mauro.curso.javacore.Aintroducaoclasses.test;

import com.mauro.curso.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Rieny";
        professor.age = 34;
        professor.gender = 'M';
        professor.apelido = "Tuica";

        System.out.println("Nome: " + professor.name);
        System.out.println("Idade: " + professor.age);
        System.out.println("Gênero: " + professor.gender);
        System.out.println("Apelido: " + professor.apelido);
        System.out.println("------------------------");
        System.out.print("Nome: " + professor.name + "\nIdade: " + professor.age  + "\nGênero: " + professor.gender + "\nApelido: " + professor.apelido);
    }

}
