/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elefante;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Elefante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Digite quantas vezes deseja repetir: ");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        String s = "";
        int i = 0;
        for(i=valor ; i>0 ; i--){
            s+= "Incomoda ";
        }
        System.out.println(s + " muito mais");
    }
    
}
