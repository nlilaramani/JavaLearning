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
public class CarPurchase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cash=5000;
        double credit=5000;
        if(cash+credit>=25000 ){
            System.out.println("Can buy a car");
        }else{
            System.out.println("Can not buy a car");
        }
    }
    
}
