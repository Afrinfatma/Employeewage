package com.bridgelabz.empwage;

public class Empwage{
	public static final int is_Fulltime=1;
	public static final int is_Parttime=2;

	
	public static int computeWage (String company ,int  WagePerHr ,int Num_of_working_days , int Num_of_working_hrs ) {
		
		int  emphrs=0 , Totalemphrs=0, Totalworkingdays=0;
		while(Totalemphrs<=Num_of_working_hrs && Totalworkingdays<Num_of_working_days) {
			Totalworkingdays++;
		    int emp_check=(int) Math.floor( Math.random()*10)%3;	
		    switch(emp_check) {
		       case is_Fulltime :
			   emphrs=8;
		       break;
		       case is_Parttime :
			   emphrs=4;
               break;
            default:
        	   emphrs=0;
		}
		    Totalemphrs+= emphrs;
		
		System.out.println("Day#:" +Totalworkingdays + "Emp hrs:" +emphrs );
		}
		int Totalempwage= Totalemphrs * WagePerHr;
		System.out.println("Total Employee Wage: " +Totalempwage);
		return Totalempwage;
	}
		
	
		public static void main(String[] args){
			computeWage("dmart" , 20 , 8 , 100 );
			computeWage("Central" , 20 ,6, 50);
			computeWage("Reliance" , 25 , 8 ,60);
		}

}
