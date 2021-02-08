/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Bruno
 */
public class Retangulo implements AreaCalculavel{
    private double lado1;
    private double lado2;

    public Retangulo(double l1, double l2) {
        this.lado1 = l1;
        this.lado2 = l2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public void calcularArea() {
        double area;
        area = this.getLado1()*this.getLado2();
        System.out.println("O resultado da área do Retângulo é: " + area);
    }
    
    
}
