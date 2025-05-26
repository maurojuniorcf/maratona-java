package com.mauro.curso.javacore.Aintroducaoclasses.test;

import com.mauro.curso.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro car = new Carro();

        car.name = "Fiat Toro";
        car.model = "Fiat";
        car.year = 2025;

        System.out.print("Nome do carro: " + car.name + "\nModelo do carro: " + car.model + "\nAno do carro: " + car.year);
    }
}
