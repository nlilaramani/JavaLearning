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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4,5};
        System.out.println("1st Element:"+a[0]);
        System.out.println("2nd Element:"+a[1]);
        System.out.println("2nd Element:"+a[2]);
        a[2]=30;
        System.out.println("2nd Element:"+a[2]);
        for(int i=0;i<a.length;i++){
            System.out.println("Element "+i+":"+a[i]);
        }
        System.out.println("Size of array is:"+a.length);
        
        for(int i:a){
            System.out.println(i);
        }
        
    }
    
}
