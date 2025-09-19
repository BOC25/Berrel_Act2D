/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.berrel;
import java.util.Scanner;

/**
 *
 * @author CL3-PC14
 */
public class cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);

        System.out.println("\n[1] - hotdog 25.00");
        System.out.println("[2] - coke 20.00");
        System.out.println("[3] - burger 30.00");

        System.out.print("Enter Order: ");
        int order = input.nextInt();

        double total = 0;
        String item = "";
        int unitPrice = 0;
        int quantity = 0;
        double discount = 0;
        double vatRate = 0.12;
        double discountedTotal = 0;
        double vatAmount = 0;
        double netSales = 0;

        if (order == 1) {
            System.out.println("You pick hotdog");
            System.out.println("25.00");
            item = "Hotdog";
            unitPrice = 25;

            System.out.println("Enter quantity: ");
            quantity = input.nextInt();
            total = quantity * unitPrice;

            System.out.println("Are you a Senior Citizen, PWD, or Pregnant?");
            System.out.println("[1] - None");
            System.out.println("[2] - Senior Citizen (20%)");
            System.out.println("[3] - PWD (15%)");
            System.out.println("[4] - Pregnant (10%)");
            System.out.print("Enter your category: ");
            int category = input.nextInt();

            if (category == 2) {
                discount = 0.20;
            } else if (category == 3) {
                discount = 0.15;
            } else if (category == 4) {
                discount = 0.10;
            }

            discountedTotal = total - (total * discount);
            vatAmount = discountedTotal * vatRate;
            netSales = discountedTotal - vatAmount;

            int cash;
            do {
                System.out.print("Enter your payment: ");
                cash = input.nextInt();

                if (cash < discountedTotal) {
                    System.out.println("Not enough cash. Please try again.");
                }
            } while (cash < discountedTotal);

            double change = cash - discountedTotal;

            // Receipt
            System.out.println("\n----- RECEIPT -----");
            System.out.println("Item: " + item);
            System.out.println("Quantity: " + quantity);
            System.out.println("Unit Price: " + unitPrice);
            System.out.printf("Total: %.2f\n", total);
            System.out.printf("Discount (%.0f%%): -%.2f\n", discount * 100, total * discount);
            System.out.printf("Discounted Total: %.2f\n", discountedTotal);
            System.out.printf("VAT (12%%): %.2f\n", vatAmount);
            System.out.printf("Net Sales: %.2f\n", netSales);
            System.out.printf("Cash: %.2f\n", (double) cash);
            System.out.printf("Change: %.2f\n", change);
            System.out.println("-------------------");
        }

        else if (order == 2) {
            System.out.println("You pick coke");
            System.out.println("20.00");
            item = "Coke";
            unitPrice = 20;

            System.out.print("Enter quantity: ");
            quantity = input.nextInt();
            total = quantity * unitPrice;

            System.out.println("Are you a Senior Citizen, PWD, or Pregnant?");
            System.out.println("[1] - None");
            System.out.println("[2] - Senior Citizen (20%)");
            System.out.println("[3] - PWD (15%)");
            System.out.println("[4] - Pregnant (10%)");
            System.out.print("Enter your category: ");
            int category = input.nextInt();

            if (category == 2) {
                discount = 0.20;
            } else if (category == 3) {
                discount = 0.15;
            } else if (category == 4) {
                discount = 0.10;
            }

            discountedTotal = total - (total * discount);
            vatAmount = discountedTotal * vatRate;
            netSales = discountedTotal - vatAmount;

            int cash;
            do {
                System.out.print("Enter your payment: ");
                cash = input.nextInt();

                if (cash < discountedTotal) {
                    System.out.println("Not enough cash. Please try again.");
                }
            } while (cash < discountedTotal);

            double change = cash - discountedTotal;

            // Receipt
            System.out.println("\n----- RECEIPT -----");
            System.out.println("Item: " + item);
            System.out.println("Quantity: " + quantity);
            System.out.println("Unit Price: " + unitPrice);
            System.out.printf("Total: %.2f\n", total);
            System.out.printf("Discount (%.0f%%): -%.2f\n", discount * 100, total * discount);
            System.out.printf("Discounted Total: %.2f\n", discountedTotal);
            System.out.printf("VAT (12%%): %.2f\n", vatAmount);
            System.out.printf("Net Sales: %.2f\n", netSales);
            System.out.printf("Cash: %.2f\n", (double) cash);
            System.out.printf("Change: %.2f\n", change);
            System.out.println("-------------------");
        }

        else if (order == 3) {
            System.out.println("You pick burger");
            System.out.println("30.00");
            item = "Burger";
            unitPrice = 30;

            System.out.print("Enter quantity: ");
            quantity = input.nextInt();
            total = quantity * unitPrice;

            System.out.println("Are you a Senior Citizen, PWD, or Pregnant?");
            System.out.println("[1] - None");
            System.out.println("[2] - Senior Citizen (20%)");
            System.out.println("[3] - PWD (15%)");
            System.out.println("[4] - Pregnant (10%)");
            System.out.print("Enter your category: ");
            int category = input.nextInt();

            if (category == 2) {
                discount = 0.20;
            } else if (category == 3) {
                discount = 0.15;
            } else if (category == 4) {
                discount = 0.10;
            }

            discountedTotal = total - (total * discount);
            vatAmount = discountedTotal * vatRate;
            netSales = discountedTotal - vatAmount;

            int cash;
            do {
                System.out.print("Enter your payment: ");
                cash = input.nextInt();

                if (cash < discountedTotal) {
                    System.out.println("Not enough cash. Please try again.");
                }
            } while (cash < discountedTotal);

            double change = cash - discountedTotal;

            // Receipt
            System.out.println("\n----- RECEIPT -----");
            System.out.println("Item: " + item);
            System.out.println("Quantity: " + quantity);
            System.out.println("Unit Price: " + unitPrice);
            System.out.printf("Total: %.2f\n", total);
            System.out.printf("Discount (%.0f%%): -%.2f\n", discount * 100, total * discount);
            System.out.printf("Discounted Total: %.2f\n", discountedTotal);
            System.out.printf("VAT (12%%): %.2f\n", vatAmount);
            System.out.printf("Net Sales: %.2f\n", netSales);
            System.out.printf("Cash: %.2f\n", (double) cash);
            System.out.printf("Change: %.2f\n", change);
            System.out.println("-------------------");
        }

        input.close();
    }
}
