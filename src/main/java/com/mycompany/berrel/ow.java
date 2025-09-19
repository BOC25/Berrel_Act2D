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
public class ow {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      
      
      System.out.print("Enter Player1:");
      int p1 = input.nextInt();
      System.out.print("Player2:");
      int p2 = input.nextInt();
      
      if(p1==1 && p2==1)
      {
      System.out.println("Draw");
      }  
      else if (p1 == 1 && p2 == 2)
      {
       System.out.println("Player2");   
      }
      else if (p1 == 1 && p2 == 3)
      {
      System.out.println("player1");
      } 
      else if (p1 ==2 && p2 == 1)
      {
      System.out.println("player1");
      }
      else if (p1 ==2 && p2 == 2)
      {
      System.out.println("Draw");
      }
      else if (p1 ==2&& p2 ==3)
      {
      System.out.println("player2");
      }
      else if (p1 ==3 && p2 ==1)
      {
      System.out.println("player2");
      }
      else if (p1 == 3&& p2 == 2)
      {
      System.out.println("player1");
      }
      else if (p1 == 3&& p2 ==3)
      {
      System.out.println("Draw");
      }   
    }
}
