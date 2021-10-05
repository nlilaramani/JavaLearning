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
public class Rectangle {
    private double length=10;
    private double width=10;
    // Default no argument constructor
    public Rectangle(){
        System.out.println("Default Constructor");
        length=10;
        width=10;
    }
    // Constructor with two arguments
    public Rectangle(double l, double w){
        System.out.println("Constructing Rectangle with parameters");
        length=l;
        width=w;
    }
    //controlled access to length
    public void setLength(double l){
        if(l>0){
            length=l;
        }
    }
    public double getLength(){
        return length;
    }
    
    public void setWidth(double w){
        if(w>0){
            width=w;
        }
    }
    public double getWidth(){
        return width;
    }
    public double area(){
        return length*width;
    }
    public double circumference(){
        return 2*(length+width);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r1;
        r1=new Rectangle(10,10);
        System.out.println("Length="+r1.length);
        System.out.println("Area="+r1.area());
        r1.length=10;
        r1.width=20;
        System.out.println("Area="+r1.area());
        System.out.println("Circumference="+r1.circumference());

        
        
        Rectangle r2=new Rectangle(10,10);
        r2.length=20;
        r2.width=50;
        System.out.println("Area="+r2.area());
        System.out.println("Circumference="+r2.circumference());
        
        
    }
    
}
