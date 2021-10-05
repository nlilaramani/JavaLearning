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
public class Employee {
    int id;
    String name;
    double monthlySalary;
    
    public void setDetails(int id, String name,double sal){
        this.id=id;
        this.name=name;
        this.monthlySalary=sal;
    }
    
    public void printDetails(){
        System.out.println("Id:"+id+",Name:"+name+",Monthly Salary:"+monthlySalary);
    }
    
    public double getAnnualSalary(){
        return monthlySalary*12;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e=new Employee();
        e.setDetails(1, "John", 5000.00);
        e.printDetails();
        
       }
    
}
