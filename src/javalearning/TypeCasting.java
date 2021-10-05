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
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int price=300;
        double p=price; //implicit type cast from int to double
        System.out.println("P:"+p);
        p=199.99;
        price=(int)p; // explicit type cast from double to int
        System.out.println("price="+price);
        
        float f=10.2f;
        p=f;
        
        char ch='A';
        int i;
        i=ch;
        System.out.println("i="+i);
        i++;
        ch=(char)i;
        System.out.println("ch="+ch);
        i=1291289;
        ch=(char)i;
        System.out.println("ch="+ch);
        
    }
    
}
