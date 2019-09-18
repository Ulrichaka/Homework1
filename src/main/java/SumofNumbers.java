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

public class SumofNumbers {
    public static void main(String []args ) {
        Scanner scan = new Scanner(System.in);
        
        int SumofNumbers = 0;
        
    System.out.println("Please enter in a nonzero integer"); 
    
   int Number = scan.nextInt();
        
       for(int i = 1; i <= Number; i++)
           SumofNumbers += i;
       
       System.out.println(SumofNumbers);
    }    
}


