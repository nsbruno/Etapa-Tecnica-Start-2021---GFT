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
public class Circulo implements AreaCalculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area;
        area = Math.pow(this.getRaio(), 2)*(Math.PI);
        System.out.println("A área do Circulo é: " + area );
    }
    
    
    
}
