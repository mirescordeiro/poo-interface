package org.example;

public class Quadrado implements Area {

    private double lado;
    private double area;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public Quadrado(double lado) {
        setLado(lado);
    }

    @Override
    public void calcArea() {
        this.area = this.lado * this.lado;
    }

    @Override
    public void printArea() {
        System.out.println("=====Quadrado=====");
        System.out.println("área: "+ getArea());
    }
}
