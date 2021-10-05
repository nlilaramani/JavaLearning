/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

import java.util.Scanner;

/**
 *
 * @author itexps
 */
public class Inputs1 {
    
    public static void main(String[] args){
        System.out.print("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("s1:"+s1);
        System.out.print("Enter the integer:");
        int i=sc.nextInt();
        System.out.println("int:"+i);
        System.out.print("Enter the integer2:");
        int j=sc.nextInt();
        System.out.println("int:"+j);
        int[] integers={i,j};
        int[] array=new int[5];
    }
}
