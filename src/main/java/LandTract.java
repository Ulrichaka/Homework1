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

public class LandTract {
private final double length;
private final double width;

public LandTract(double length, double width) {
	super();
	this.length = length;
	this.width = width;
}

public double area()
{
	return length * width;
	
}
	
public boolean equals(double land1, double land2)
{
    return land1==land2;
}

@Override
public String toString(){
	
	return "Area of land  is: " +area() ;
	
	
	 
}

public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the dimensions for tract of land 1: "  );
	 double l1 = scan.nextDouble();
	 double w1=scan.nextDouble();
	 LandTract land1=new LandTract(l1,w1);
	// double area1=land1.area();
	 System.out.println(land1.toString()  );
	 
	System.out.println("enter the dimensions for tract of land 2: " );
	double l2 = scan.nextDouble();
	 double w2=scan.nextDouble();
	 LandTract land2=new LandTract(l2,w2);
	// double area2=land2.area();
	 System.out.println(land2.toString());
	 
	 if(land1.equals(land1.area(), land2.area()))
	 { System.out.println("tracts are of equal size");}
}
} 
