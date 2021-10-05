/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author itexps
 */
public class Manager extends Employee {
    double bonus;
    public void setBonus(double b){
        bonus=b;
    }
    // Overridden method
    @Override
    public double getAnnualSalary(){
        return monthlySalary*12+bonus;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
