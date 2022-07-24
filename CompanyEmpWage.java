package com.bridgelabz.empwage;

public class CompanyEmpWage {

	public final String company;
	public  static int WagePerHr; 
	public final int Num_of_working_days;
	public final int  Num_of_working_hrs;
	public int totalEmpWage;
	
	public CompanyEmpWage (String company ,int  WagePerHr ,int Num_of_working_days , int Num_of_working_hrs ) {
	      this.company = company;
 	      this.WagePerHr = WagePerHr;
	      this.Num_of_working_days = Num_of_working_days;
          this.Num_of_working_hrs = Num_of_working_hrs;
	}
     public void setTotalEmpWage(int totalEmpWage) {
         this.totalEmpWage=totalEmpWage;
     }
     @Override
     public String toString() {
    	 return "Total Emp Wage for Company :" +company + "is" +totalEmpWage ;
     }
}
     
