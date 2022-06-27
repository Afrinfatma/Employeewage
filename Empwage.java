package com.bridgelabz.empwage;

public class Empwage {
	public static final int is_Fulltime=1;
	public static final int is_Parttime=2;
	public static final int Wageperhr=20;
	public static final int Num_of_working_days=20;
	public static void main(String[] args){
		
		int empwage=0 , emphrs=0 , Totalempwage=0;
		for(int day = 0; day < Num_of_working_days ; day++) {
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
		empwage=Wageperhr*emphrs;
		Totalempwage+= empwage;
		System.out.println("Employee wage: "+empwage);
		}
		System.out.println("Total Employee Wage: " +Totalempwage);
	}

}
