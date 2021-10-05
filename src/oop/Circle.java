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
public class Circle {
    double radius;
    int centerX,centerY;
    
    double area(){
        double area=3.14*radius*radius;
        return area;
    }
    
    double circumference(){
        return 2*3.14*radius;
    }

    void print(){
        System.out.println("radius="+radius);
        System.out.println("center=("+centerX+","+centerY+")");
        System.out.println("area="+area());
        System.out.println("circumference="+circumference());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //double x=radius;
        int i;//declaration
        i=10; // initialization
        Circle c1; // declaration
        c1=new Circle(); //initialization
        c1.centerX=0;
        c1.centerY=0;
        c1.radius=15.0;
        c1.print();
        
        Circle c2;
        c2=new Circle();
        c2.radius=28.2;
        c2.centerX=10;
        c2.centerY=10;
        c2.print();
    }
    
}
