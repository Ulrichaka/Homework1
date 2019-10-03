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
public class Paintjobestimator1 {
public static class p {
        public static void main(String[] args){
		// TODO Auto-generated method stub
		int  squarefeet;
		int numgal;
		int room;
		double galloncost,costlabor,costpaint,totalcost,labor;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number of rooms to be painted : ");
		room=scan.nextInt();
		  
		      System.out.println("enter the price of the paint per gallon: ");
		      galloncost=scan.nextDouble();
		      
		      System.out.println("enter the square feet of wall space: ");
			   squarefeet=scan.nextInt();
			   
		      
		    
		 
			   numgal=numofGallon(squarefeet);
		   costpaint=CostOfPaint(galloncost,numgal);
		    labor=HourOfLabor(squarefeet);
		   costlabor=LaborCharge(labor);     
		   totalcost=Total(costpaint,costlabor);
		   display(totalcost,squarefeet,costpaint,costlabor,labor,numgal);
		   }
		
		
	        public static double HourOfLabor(double squarefeet){
                        
		return squarefeet/115.;
		}
		public static int numofGallon(int squarefeet)
		{
		return (squarefeet+115/2)/115; 

		}
		public static double CostOfPaint(double galloncost, int gal)
		{ return galloncost*gal;         
		}
		public static double LaborCharge(double labor)
		{return labor*(18*8);            
		}
		public static double Total(double LaborCharge,double CostOfPaint)
		{return LaborCharge+CostOfPaint;
		}
		public static void display(double total, int sqarefeet, double CostOfPaint, double LaborCharge,double hours,int gallons)
		{
		
		System.out.println('\t');
		//System.out.println("The total cost of the paint job: "+numofGallon);
		System.out.println("The hours of labor required: "+ hours);
		System.out.println("The cost of the paint: "+CostOfPaint);
		System.out.println("The labor charges: "+ LaborCharge);
		System.out.println("The total cost of the paint job: "+total);
			
		}
		
     }
}

