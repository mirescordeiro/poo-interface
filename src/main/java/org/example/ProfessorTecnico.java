package org.example;

public class ProfessorTecnico implements Colaborador,Professor{
    private double salario;
    private double adicional;

    public double getSalario() {
        return salario;
    }

    public double getAdicional() {
        return adicional;
    }

    public ProfessorTecnico() {
    }

    @Override
    public void obtemTitulacao(String titulacao) {
        if(titulacao.equalsIgnoreCase("doutorado")){
            this.adicional = 0.5;
        } else if (titulacao.equalsIgnoreCase("mestrado")) {
            this.adicional = 0.2;
        } else {
            this.adicional = 0;
        }
    }

    @Override
    public void obtemSalario(int cargaHoraria, float valorBaseHora) {
        this.salario = cargaHoraria * valorBaseHora * 3;
        this.salario = this.salario + (this.salario * getAdicional());
    }

    @Override
    public void printSalario() {
        System.out.println("=====Professor Técnico=====");
        System.out.println("salário: "+ getSalario());
    }
}
