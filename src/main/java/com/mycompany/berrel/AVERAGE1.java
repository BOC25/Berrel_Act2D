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
public class AVERAGE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
     System.out.print("Enter Grade");
     int g1 = input.nextInt();
     System.out.print("Enter Grade");
     int g2 = input.nextInt();
     System.out.print("Enter Grade");
     int g3 = input.nextInt();
     System.out.print("Enter Grade");
     int g4 = input.nextInt();
     
     int ave = (g1 + g2 + g3 + g4) /4;
     System.out.print("Average;" +ave);
    }
}
