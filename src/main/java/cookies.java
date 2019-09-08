
import java.util.Scanner;

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
public class cookies {
    
public static void main(String[] args){
    try{     
      Scanner cookies  =  new Scanner(System.in);  
    System.out.print("Enter the number of cookies: ");
   float cookiesAte = cookies.nextFloat(); 
   float calories = cookiesAte * 75;
   System.out.println(" calories consumed :" +calories);
    
  }
   catch(Exception ex){
       System.out.println("Invalid");
       
       
   }
    }

}
