package com.example;

public class Main {
    public static void main(String[] args) {
        Departamento d = new Departamento(3, "Departamento de Tecnologia");

        Funcionario f = new Funcionario(123, "Daniel", d);

        System.out.println(f.toString());
    }
}