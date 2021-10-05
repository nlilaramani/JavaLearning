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
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rows,columns;
        for (rows=1;rows<=4;rows++){
            //int num=rows;
            for(columns=rows;columns>=1;columns--){
                System.out.print(columns+" ");
                //columns--;
            }
            System.out.println("");
        }
    }
    
}
