package Test;


import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sabir
 */
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Invoice Total Colculator");
        System.out.println("");
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            InvoiceCalculator invoice = new InvoiceCalculator();
            System.out.println("Enter subtotal:");
            String subtotalLine = sc.nextLine();
            invoice.setSubTotal(subtotalLine);
            invoice.calculateDiscountPercent();
            invoice.calculateDiscoundAmount();
            invoice.calculatetotalBeforeTax();
            invoice.calculateSalesTax();
            invoice.calculateTotal();
            invoice.output();
            
            System.out.println("Continue?(y/n):");
            choice = sc.nextLine();
            System.out.println("");

        }
        System.out.println("Aplication Ended");
    }

}
