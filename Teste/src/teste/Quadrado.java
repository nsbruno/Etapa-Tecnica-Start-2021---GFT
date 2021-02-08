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
public class Quadrado implements AreaCalculavel {
    private double lado1;
    
    

    public Quadrado(double lado1) {
        this.lado1 = lado1;
       
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

   
    
    
    @Override
     public void calcularArea(){
         double area;
         area = this.getLado1()*this.getLado1();
         System.out.println("O resultado da área de Quadrado é: " + area);               
     }
    
    
}
