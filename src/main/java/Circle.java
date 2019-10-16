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
public class Circle {
    private double radius;
	private final double PI=3.14159;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
	radius=0.0;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area()
	{
		return PI*radius*radius;
	}
	
	public double diameter()
	{
		return radius * 2;
	}
	public double circumference()
	{
		return 2 * PI * radius;
	
}
	
	
	
	public static void main(String[] args) {
		
		
		  Scanner scan = new Scanner(System.in);

		
		    System.out.print("Enter radius: ");
		   int rad = scan.nextInt();
		   
		   Circle circle=new Circle();
		   
		   circle.setRadius(rad);
		   
		   System.out.println("================reporting the circle's area, diameter, and circumference ========");
		   
		   System.out.println("Area: "+ circle.area()+'\n'+"Diameter: " + circle.diameter()+ '\n'+"Circumference: " +circle.circumference() );
		   
	}
}
