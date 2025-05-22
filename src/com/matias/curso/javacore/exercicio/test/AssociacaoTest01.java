package com.matias.curso.javacore.exercicio.test;

import com.matias.curso.javacore.exercicio.domain.Estudante;
import com.matias.curso.javacore.exercicio.domain.Local;
import com.matias.curso.javacore.exercicio.domain.Professor;
import com.matias.curso.javacore.exercicio.domain.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua Pernambuco");
        Estudante estudante = new Estudante("Lucas", 18);
        Professor professor = new Professor("Cinara" , "Física");
        Estudante[] estudantesSeminario = {estudante};
        Seminario seminario = new Seminario("Onde achar a escola", estudantesSeminario, local);
        Seminario[] seminariosProfessor = {seminario};

        professor.setSeminarios(seminariosProfessor);
        professor.imprime();
    }
}
