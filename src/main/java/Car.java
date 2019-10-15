/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaka9
 */
public class Car {
    private int yearModel;
	private static String make;
	private int speed;
		
	//private static int accelerate;
	//private int brake;
 

	//Accessors

	



	public Car(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		Car.make = make;
		speed=0;
	}






	public int getYearModel() {
		return yearModel;
	}






	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}






	public String getMake() {
		return make;
	}






	public void setMake(String make) {
		Car.make = make;
	}






	public int getSpeed() {
		return speed;
	}






	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int Accelerate() {
		return speed +=5;
	}








	public int Brake() {
		return speed -= 5;
	}







	public static void main(String[] args) {
		
		
		Car obj=new Car(2019,"Ford");
		
		//obj.setSpeed(5);
		for(int i=1;i<=5;i++) {
	
obj.Accelerate();
obj.getSpeed();
System.out.println("current Speed after accelerating : "+obj.getSpeed() );
}
for(int j=1;j<=5;j++) {
	{
		
		obj.Brake();
		obj.getSpeed();
		System.out.println("current Speed After braking: "+obj.getSpeed() );


	


		}
/*
obj.getAccelerate();
obj.getAccelerate();
obj.getAccelerate();
obj.getAccelerate();*/


		}	}
}
