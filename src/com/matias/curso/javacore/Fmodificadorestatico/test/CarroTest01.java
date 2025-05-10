package com.matias.curso.javacore.Fmodificadorestatico.test;

import com.matias.curso.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 280);
        Carro carro1 = new Carro("Mercedes", 275);
        Carro carro2 = new Carro("Audi", 290);
        Carro.setVelocidadeLimite(180);

        carro.imprime();
        carro1.imprime();
        carro2.imprime();
    }
}
