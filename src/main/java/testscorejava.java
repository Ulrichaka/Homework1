/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaka9
 */
public class testscorejava {
    int size=100;
	 double []array=new double[size];
	
	public testscorejava(double[] array) {
	this.array = array;
}
	public double getAverage(){
		
		double sum=0.0;
		double av=0.0;
		
		for(int i=0;i<array.length;i++){
			
			sum +=array[i];
			av= sum/(double)array.length;
			
			if(array[i]<0 || array[i]>100){
				throw new IllegalArgumentException("invalid Element in array");
				
			
}
			
		}
return av;
	}


public static void main(String[] args) {
  
	double[] arr={85,70,89,60,98,76};
testscores score=new testscores(arr);

	
	
try{

System.out.println("The average of scores is: "+score.getAverage());
}
catch(IllegalArgumentException ex){
System.out.println("Scores must be between 0 and 100.\n"+ex.getMessage());
}
}
}

