/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaka9
 */
import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		
		
		  double saleTax;
			double CountyTax;
			double totalTax;
		
		Scanner scan = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the amount of a purchase: ");
		
		
	    double amount = scan.nextDouble();  // Read user input
	    
	saleTax= amount * 0.04;
	CountyTax=amount*0.02;
	totalTax=saleTax + CountyTax;
	
	  
		System.out.println(
	    		"the amount of a purchase is: " + amount );
	    		 
	    		
	    		
		
		System.out.println("the state sales tax: "+ saleTax);
		System.out.println("county sales tax: " + CountyTax);
		System.out.println("the total sales tax: " + totalTax);
				System.out.println("the total of the sale: " + (amount + totalTax));
	}

}