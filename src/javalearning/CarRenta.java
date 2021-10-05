/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

/**
 *
 * @author itexps
 */
public class CarRenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age=20;
        double credit=10000.00;
        if(age>=21 && credit>=10000.00){
            System.out.println("Can rent a car");
        }else{
            System.out.println("Not eligible to rent car");
        }
    }
}
