/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaka9
 */
import java.util.*;
public class PaintJobEstimator{
public static void main(String[] args)
{int i, numrun, sqft,gallons;
double cpg,costlabor,costpaint,totalcost,labor;
Scanner in=new Scanner(System.in);
System.out.print("How many rooms you have? ");
numrun=in.nextInt();
for(i=0;i<numrun;i++)
   {System.out.print("what is the square footage of the room? ");
   sqft=in.nextInt();
   do
     {
      System.out.print("What is the cost per gallon of paint? ");
      cpg=in.nextDouble();;
      if(cpg<10.)
         System.out.println("price not possible reenter\n");
     }while(cpg<10);
    gallons=numGallons(sqft);
   costpaint=Paint(cpg,gallons);
    labor=LaborHours(sqft);
   costlabor=LaborCost(labor);     
   totalcost=Total(costpaint,costlabor);
   Output(totalcost,sqft,costpaint,costlabor,labor,gallons);
   }
}
public static double LaborHours(int sqft)
{return sqft/115.;
}
public static int numGallons(int sqft)
{
return (sqft+115/2)/115; //round up assuming can't buy part of a gallon of paint

}
public static double Paint(double cpg, int gal)
{ return cpg*gal;         
}
public static double LaborCost(double labor)
{return labor*(18.00*8);              //assuming you can spend part of an hour painting
}
public static double Total(double paint,double labor)
{return paint+labor;
}
public static void Output(double total, int sqft, double paint, double labor,double hours,int gallons)
{System.out.printf("It will cost $%.2f to paint %d sq ft\n",total,sqft);
System.out.printf("Paint costs $%.2f Labor cost $%.2f\n",paint,labor);
System.out.printf("Labor Hours %.2f Paint used %d gallon\n",hours,gallons);

}
}
