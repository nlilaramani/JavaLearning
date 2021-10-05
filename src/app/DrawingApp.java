/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import oop.Rectangle;

/**
 *
 * @author itexps
 */
public class DrawingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Changing code");
        // TODO code application logic here
        Rectangle r1=new Rectangle(15,100); // Creating a new object
        System.out.println("Length:"+r1.getLength());
        r1.setLength(10);
        r1.setWidth(20);
        System.out.println("Area="+r1.area());
        System.out.println("Length:"+r1.getLength());
        System.out.println("Width:"+r1.getWidth());
        Rectangle r2=new Rectangle(); // Creating object with defauklt constructor
        System.out.println("Length:"+r2.getLength());
        
        
    }
    
}
