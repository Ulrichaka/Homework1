/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaka9
 */
public class chap7Exo5 {
    public  int display(int array[], int n) {
	
		//n is the first element in the array that is being compared to the other elements
	int max = array[0];
	
	for (int i=0; i<n;i++)
		{
		
		
		
		if(max <array[i])
		 {
System.out.println( array[i]);
		 
		 }
		}
	return max;
	
			
	
		 
	}
	public static void main(String[] args) {
		
		chap7Exo5 obj=new chap7Exo5();
		
		int a[] = {5,8,0,10,4,11,52};
		int b=a.length;
		
		
		
		
		System.out.println("display all of the numbers in the array that are greater than the number n:");
	 obj.display(a, b);
	}
}

