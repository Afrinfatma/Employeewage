package com.bridgelabz.empwage;

public class Empwage {
	public static void main(String[] args){
		int is_present=1;
		double emp_check= Math.floor( Math.random()*10)%2;	
		 
		if (emp_check==is_present)
			System.out.println(" Employee is present");
		else
			System.out.println("Employee is absent");
				
		}
	}


