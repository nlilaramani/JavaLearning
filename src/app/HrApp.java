/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import oop.Employee;
import oop.Manager;

/**
 *
 * @author itexps
 */
public class HrApp {
    
    public static void getSalaries(Employee[] employees){
        for(Employee e:employees){
            e.printDetails();
            System.out.println("Annual Salary:"+e.getAnnualSalary());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setDetails(1, "John", 5000.00);
        e.printDetails();
        
        System.out.println("Annual salary:"+e.getAnnualSalary());
        Employee e1=new Employee();
        e1.setDetails(2, "Bob", 6000.00);
        e1.printDetails();
        
        System.out.println("Annual salary:"+e1.getAnnualSalary());
        Manager m=new Manager();
        m.setDetails(3, "Rob", 8000.00);
        m.printDetails();
        m.setBonus(10000);
        //System.out.println("Annual salary:"+m.getAnnualSalary());
        
        int i=10;
        double d=20.0;
        d=i;
        i=(int)d;
        
        
        //Polymorphism
        
        Employee e3;
        e3=m;
        System.out.println("Annual Salary:"+e3.getAnnualSalary());
        Manager m1;
        m1=(Manager)e; // e is a manager
        m1.setBonus(5000.00);
        Employee[] array={e,e1,m};
        getSalaries(array);
        
    }
    
}
