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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrado q1 = new Quadrado(5);
        q1.calcularArea();
        
        Retangulo r1 = new Retangulo(2,3);
        r1.calcularArea();
        
        Circulo c1 = new Circulo(2);
        c1.calcularArea();
        
    }
    
}
