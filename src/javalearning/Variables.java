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
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int id=40;
        System.out.println("id:"+id);
        String name;
        name="Bob";
        System.out.println("Name:"+name);
        double price;
        price=500.99;
        System.out.println("price:"+price);
        id=50+45;
        System.out.println("id:"+id);
        System.out.println(45+5);
        System.out.println(3.99+5.51);
        System.out.println(45-5);
        System.out.println(3.99-5.51);
        System.out.println(7000*3);
        System.out.println(10/3);
        System.out.println(11%3);
        int i=5;
        i++;
        System.out.println("i:"+i);
        ++i;
        System.out.println("i:"+i++);
        i=8;
        int j=++i;
        System.out.println("j:"+j); //9
        j=i++;
        System.out.println("j:"+j); //9
        
        
        System.out.println("i:"+i);
        double a=10;
        int b=3;
        double result=a/b;
        System.out.println(result);
        
        String str="Hello World"; // declaration and initialization of string
        System.out.println(str);
        char ch;
        ch='A';
        String str1="Another String";
        String str2=str+str1;
        System.out.println(str2);
        String str3=i+str;
        System.out.println(str3);
        
        
        
       }
    
}
