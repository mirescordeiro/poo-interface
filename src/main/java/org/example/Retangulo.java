package org.example;

public class Retangulo implements Area{

    private double base;
    private double altura;

    private double area;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public Retangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    @Override
    public void calcArea() {
        this.area = this.base * this.altura;
    }

    @Override
    public void printArea() {
        System.out.println("=====Retângulo=====");
        System.out.println("área: "+ getArea());
    }
}
