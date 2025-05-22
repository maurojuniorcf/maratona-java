package com.matias.curso.javacore.exercicio.domain;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("# Relatório");
        System.out.println("Professor(a): " + this.nome);
        System.out.println("Especialidade do(a) Professor(a): " + this.especialidade);
        if (this.seminarios == null) return;
        System.out.println("--- Seminários cadastrados ---");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getEstudantes() == null || seminario.getEstudantes().length == 0) continue;
            System.out.println("--- Alunos ---");
            for (Estudante estudante : seminario.getEstudantes()) {
                System.out.println("Nome: " + estudante.getNome());
                System.out.println("Idade: " + estudante.getIdade() + " anos.");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
