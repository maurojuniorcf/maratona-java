package com.mauro.curso.javacore.Bintroducaometodos.dominio;

public class Estudante {

    public String name;
    public String apelido = "Nenhum";
    public int age;
    public char gender;

    public void imprime() {
        System.out.println("------------------");
        System.out.println(this.name);
        System.out.println(this.apelido);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
