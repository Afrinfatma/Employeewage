package com.bridgelabz.empwage;

public class Empwage {
	public static void main(String[] args){
		int is_present=1;
		int Wageperhr=20;
		int empwage=0 , emphrs=0;
		double emp_check= Math.floor( Math.random()*10)%2;	
		 
		if (emp_check==is_present)
			emphrs=8;
			
		else
			emphrs=0;
		empwage=Wageperhr*emphrs;
		System.out.println("Employee wage:"+empwage);
		}
	}


