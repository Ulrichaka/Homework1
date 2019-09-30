
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
public class isPrime {

static String message;


  public static void main(String[] args) {

   
    int number;
    
    //int m;
    //int i;
    Scanner keyboard = new Scanner(System.in);

    // Get the tract in feet.
    System.out.print("Enter a number: ");
    number = keyboard.nextInt();

    // Determine whether it is prime or not.
    isPrime(number);
    if (isPrime(number))
    
    	System.out.println( "That is a prime number.");
    	else
    		System.out.println("That is not a prime number.");
    
    
}  

    public static boolean isPrime(int number) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       /* if (number %2==0) {
            message = "is a prime number.";
        } else {
            message = " is not a prime number.";
        }
*/
    	    // Corner case 
    	for (int i = 2; i < number; i++)
    		
    		    {    		
    		      if (number % i == 0)   		
    		      {
    		
    		        return false;
    		
    		      }
    		
    		    }
    		
    		 
    		
    		    return true;
    }   
    	   

    }    
