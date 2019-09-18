
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

public class BankCharges {
    public static void main(String []args ) {
      
       
        int checksnumber = 0;
        double bankservicefees = 0.0;
        
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the number of checks: ");

        checksnumber = scan.nextInt();
     
    if (checksnumber < 20){
		             
      bankservicefees = (10+ (0.10*checksnumber));
		             
    }else if (checksnumber < 40){
		             
      bankservicefees = (10+ (0.08*checksnumber));
		             
		             
    }else if (checksnumber < 60){
		            
      bankservicefees = (10+ (0.06*checksnumber));
		             
		             
    } else if  (checksnumber >= 60){
		            
       bankservicefees = (10+ (0.04*checksnumber));
		             
		        }

    System.out.println("Service Fees : " + bankservicefees);
    }   
} 
      




//}else if (checksnumber < 39){
//        checksFees = $0.08;
//    }else if (checksnumber < 59){
//        checkFees = $0.06 each;
//    }else if (checksnumber > 60){
//        checksFees = $0.04 each;

    
    