/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofuncionarios;

/**
 *
 * @author Bruno
 */
public class Funcionario extends Pessoa {
    
    private double salario_inicial;
    private double percentual;
    private double salario_total;

    public void statusAtual(){
        this.setSalario_inicial(1000.00);
        this.setPercentual(0.015);
        int anoinicial = 2016;
        
        double totalsal = this.getSalario_inicial();
        
        int i = 0;
        
        for(i = anoinicial; i<2021 ; i++){
            totalsal = totalsal + (totalsal *(this.getPercentual()));
            this.setPercentual(this.getPercentual()*2);
            
        }
        this.setSalario_total(totalsal);
        System.out.println("Nome: " + this.getNome());
        System.out.println("RG: " + this.getRg());
        System.out.println("Salário em 2020 é: " + this.getSalario_total() );
        
    }
    
    
    public double getSalario_inicial() {
        return salario_inicial;
    }

    public void setSalario_inicial(double salario_inicial) {
        this.salario_inicial = salario_inicial;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getSalario_total() {
        return salario_total;
    }

    public void setSalario_total(double salario_total) {
        this.salario_total = salario_total;
    }
    
    
}
