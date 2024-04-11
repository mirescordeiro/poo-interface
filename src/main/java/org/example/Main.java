package org.example;

public class Main {
    public static void main(String[] args) {

        /*
        * PARTE 1
        * Crie um programa java que faça o cálculo da área de figuras geométricas ( quadrado, retangulo, triangulo, etc. ).
        * Este projeto deve criar uma interface para o cálculo da área da figura geométrica e deve ter várias classes que
        * façam o cálculo da área e que implementem a interface. Teste o programa ao instanciar um objeto da classe
        * correspondente a cada forma geométrica e chamar o método que calcula a area
        */

        Quadrado square = new Quadrado(4);
        square.calcArea();
        square.printArea();

        Retangulo rectangle = new Retangulo(2, 4);
        rectangle.calcArea();
        rectangle.printArea();


        Estagiario stag = new Estagiario();
        stag.obtemSalario(120, 10);
        stag.printSalario();

        Funcionario officer = new Funcionario();
        officer.obtemSalario(160, 15);
        officer.printSalario();

        ProfessorTecnico teacher = new ProfessorTecnico();
        teacher.obtemTitulacao("graduação");
        teacher.obtemSalario(160, 25);
        teacher.printSalario();



    }
}