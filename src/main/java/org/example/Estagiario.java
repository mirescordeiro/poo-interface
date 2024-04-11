package org.example;

public class Estagiario implements Colaborador{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public Estagiario() {
    }

    @Override
    public void obtemSalario(int cargaHoraria, float valorBaseHora) {
        this.salario = cargaHoraria * valorBaseHora;
    }

    @Override
    public void printSalario() {
        System.out.println("=====Estágiário=====");
        System.out.println("salário: "+ getSalario());
    }
}
