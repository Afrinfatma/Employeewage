package com.bridgelabz.empwage;

public class EmpwageObject{
	public static final int is_Fulltime=1;
	public static final int is_Parttime=2;
	
	  private final String company;
		private final int  WagePerHr;
		private final int Num_of_working_days ;
		private final int Num_of_working_hrs; 
        private int totalEmpWage;
	
	public  EmpwageObject(String company ,int  WagePerHr ,int Num_of_working_days , int Num_of_working_hrs ) {
		
		   this.company = company;
		   this.WagePerHr = WagePerHr;
		   this.Num_of_working_days = Num_of_working_days;
		   this.Num_of_working_hrs = Num_of_working_hrs;
	}	
	
		public void computeWage() {
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
		 totalEmpWage= Totalemphrs * WagePerHr;	

	}
		
	@Override
	public String toString() {
		return " Total EmpWage for Company :" +company+ "is" +totalEmpWage; 
	}
		public static void main(String[] args){
			
			EmpwageObject dMart=new EmpwageObject("Dmart" , 20 , 8 , 100 );
			EmpwageObject reliance=new EmpwageObject("Reliance" , 25 , 8 ,60);
			EmpwageObject central=new EmpwageObject("Central" , 20 ,6, 50);
			dMart.computeWage();
			System.out.println(dMart);
			reliance.computeWage();
			System.out.println(reliance);
			central.computeWage();
			System.out.println(central);
		}

}
