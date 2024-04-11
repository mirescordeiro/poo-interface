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

        /*
        * PARTE 2
        * Implementar as classes e interfaces a seguir. Cada uma das classes terá a sua
        * forma de cálculo de salário. Desafio: Professor também é Colaborador.
        *
        * Interface Colaborador:
        * Métodos obtemSalario e cargaHoraria.
        * Contém uma propriedade float estática correspondente ao valor base da hora.
        *
        * Interface Professor:
        * Método obtemTitulacao : serve de base para o adicional
        * Graduação : sem adicional
        * Mestrado : adicional de 20%
        * Doutorado : adicional de 50%
        *
        * Observação: os metodos anteriores possuem propriedades associadas (carga horaria e titulação),
        * que deverão ser criadas, bem como formas para definir os valores das mesmas
        * (via metodos normais ou construtores)
        *
        * Classes:
        * Estagiario (implementa Colaborador) ? salário = cargaHoraria * valor base
        * Funcionario (implementa Colaborador) ? salário = cargaHoraria * valor base * 2
        * ProfessorTecnico (implementa Professor) ? salário = cargaHoraria * valorBase * 3 * adicional pela titulacao
        * ProfessorGraduacao (implementa Professor)? salário = cargaHoraria * valorBase * 4 * adicional pela titulação
        */

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

        ProfessorGraduacao teachergrad = new ProfessorGraduacao();
        teachergrad.obtemTitulacao("mestrado");
        teachergrad.obtemSalario(160, 35);
        teachergrad.printSalario();
    }
}