/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaka9
 */
public class MonthClass {

	private int monthNumber;
	private String monthName;
	// String[] monthName= {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November",
	//		"December"};
	
	public MonthClass() {
		super();
		monthNumber=1;
	}

	public MonthClass(int monthNumber) {
		super();
		this.monthNumber=monthNumber;
		
		if(monthNumber<1 || monthNumber > 12)
		{
			monthNumber=1;
		}
	}
	
	///
	
/*	public String MonthClass(String monthName[])
    {
    int i = 0;
    monthNumber = (monthName[i+1]);
    monthNumber++;
    return monthNumber;
    }
   */ 
	///
	

	public int getMonthNumber() {
		return monthNumber;
	}

	public void setMonthNumber(int monthNumber) {
		
		
		this.monthNumber = monthNumber;
		if(monthNumber<1 || monthNumber > 12)
		{
		    monthNumber=1;
		}
	}
	//
	//public String[] getMonthName() {
	//	return monthName;
	//}
	public String getMonthName()
    {
    
		
		 switch (monthNumber) {
         case 1:
             monthName = "January";
             System.out.println(monthName);
             return monthName;
         case 2:
             monthName = "February";
             System.out.println(monthName);
             return monthName;
         case 3:
             monthName = "March";
             System.out.println(monthName);
             return monthName;
         case 4:
             monthName = "April";
             System.out.println(monthName);
             return monthName;
         case 5:
             monthName = "May";
             System.out.println(monthName);
             return monthName;
         case 6:
             monthName = "June";
             System.out.println(monthName);
             return monthName;
         case 7:
             monthName = "July";
             System.out.println(monthName);
             return monthName;
         case 8:
             monthName = "August";
             System.out.println(monthName);
             return monthName;
         case 9:
             monthName = "September";
             System.out.println(monthName);
             return monthName;
         case 10:
             monthName = "October";
             System.out.println(monthName);
             return monthName;
         case 11:
             monthName = "November";
             System.out.println(monthName);
             return monthName;
         case 12:
             monthName = "December";
             System.out.println(monthName);
             return monthName;
         default:
             System.out.println("invalid number");
             return monthName;
     }
			}
		
		
    
	
	
        @Override
	public String toString() {
	
	return ("name of the month: " + getMonthName());
	}
	
	public boolean equals(MonthClass month)
	{
            return monthNumber==month.getMonthNumber();
	}
	
	
	public boolean greaterThan(MonthClass g) {
            return monthNumber>g.monthNumber;
	}
public boolean greatherThan(MonthClass l) {
            return monthNumber<l.monthNumber;
	}


public static void main(String[] args) {
	
	MonthClass obj=new MonthClass();
	
	 System.out.print("Enter number: ");
	   Scanner scan = new Scanner(System.in);
	   
	int num = scan.nextInt();
	
	obj.getMonthNumber();
	obj.setMonthNumber(num);
	
	if(num<=0 || num>12){
		throw new IllegalArgumentException("invalid number");
	}
	else System.out.println(obj.toString());
}
}
