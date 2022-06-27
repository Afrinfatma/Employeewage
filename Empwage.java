package com.bridgelabz.empwage;

public class Empwage {
	public static void main(String[] args){
		int is_Fulltime=1;
		int is_Parttime=2;
		int Wageperhr=20;
		int empwage=0 , emphrs=0;
		double emp_check= Math.floor( Math.random()*10)%3;	
		 
		if (emp_check==is_Fulltime)
			emphrs=8;
			
		else if (emp_check==is_Parttime)
			emphrs=4;
			
		else
			emphrs=0;
		empwage=Wageperhr*emphrs;
		System.out.println("Employee wage:"+empwage);
		}
	}


