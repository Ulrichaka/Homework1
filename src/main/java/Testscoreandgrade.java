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

public class Testscoreandgrade {
    public static void main(String []args ) {
        Scanner scan = new Scanner(System.in); 
		       
       String userInputString;
       double userfirstScore;
       double usersecondScore;
       double userthirdScore;
       double userAverage = 0;
       char letterGrade = ' ';
        
        System.out.println( "Please enter the first score: " );
		        userfirstScore = scan.nextDouble();
                        
        System.out.println( "Please enter the second score: " );
		        usersecondScore = scan.nextDouble();
                        
        System.out.println( "Please enter the third score: " );
		        userthirdScore = scan.nextDouble(); 
         
        userAverage = (userfirstScore + usersecondScore + userthirdScore) / 3;
        System.out.println (userAverage);
                
        if(userAverage < 60){
            letterGrade = 'F';
        }else if(userAverage < 70) {
            letterGrade = 'D'; 
        }else if(userAverage < 80){
            letterGrade = 'C';
        }else if(userAverage < 90){
            letterGrade = 'B';
        }else if(userAverage <= 100){
            letterGrade = 'A';   
        }
        System.out.println (letterGrade);
    }        
}
