/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.berrel;
import java.util.HashMap;


/**
 *
 * @author CL3-PC13
 */
public class HashMa {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      // Create a HashMap object called capitalCities
            HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
            capitalCities.put("England", "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("USA", "Washington DC");
            System.out.println(capitalCities);
  
    }
}
