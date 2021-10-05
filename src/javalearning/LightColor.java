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
public class LightColor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char color='R';
        switch(color){
            case 'G':System.out.println("Go!");break;
            case 'R':System.out.println("Stop!");break;
            case 'A': System.out.println("Watch before you go!");break;
            default:System.out.println("Error with Signal!");
        }
        
    }
    
}
