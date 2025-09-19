/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.berrel;
import java.util.Scanner;
/**
 *
 * @author CL3-PC13
 */
public class AGE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter age");
    int a1 = input.nextInt();
    
    if (a1 >= 18){
    System.out.print("Verified");
    }
    else if (a1 >= 17){
    System.out.print("Not Verified");    
    }
    else {
    System.out.print("Invalid Input");   
    }    
    }
}
