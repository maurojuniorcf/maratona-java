package com.mauro.curso.javacore.Gassociacao.domain;

public class Jogador {

    private String nome;
    private Time time;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        if (time != null) {
            System.out.println("Time: " + time.getNome());
        } else {
            System.out.println("Este jogador não possui um time.");
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
