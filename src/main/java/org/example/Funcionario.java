package org.example;

public class Funcionario implements Colaborador{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public Funcionario() {
    }

    @Override
    public void obtemSalario(int cargaHoraria, float valorBaseHora) {
        this.salario = cargaHoraria * valorBaseHora * 2;
    }

    @Override
    public void printSalario() {
        System.out.println("=====Funcionário=====");
        System.out.println("salário: "+ getSalario());
    }
}
