/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trocarvariavel;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class TrocarVariavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira palavra; ");
        String A = teclado.nextLine();
        System.out.println("Digite a segunda palavra: ");
        String B = teclado.nextLine();
        String C = "";
        C = A;
        A = B;
        B = C;
        
        System.out.println("O valor de A é: " + A);
        System.out.println("O valor de B é: " + B);
    }
        
        
    
}
