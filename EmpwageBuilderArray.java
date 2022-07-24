package com.bridgelabz.empwage;


	public class EmpwageBuilderArray{
	public static final int is_Fulltime=1;
	public static final int is_Parttime=2;
	
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	public EmpwageBuilderArray() {
		companyEmpWageArray= new  CompanyEmpWage[5];
	}
	private void addCompanyEmpWage(String company ,int  WagePerHr ,int Num_of_working_days , int Num_of_working_hrs) {
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company , WagePerHr,Num_of_working_days,Num_of_working_hrs);
	    numOfCompany++;
	}
	
	private void computeWage() {
		for (int i=0; i< numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	 

		private int  computeWage(CompanyEmpWage  companyEmpWage) {
			int  emphrs=0 , Totalemphrs=0, Totalworkingdays=0;	
		while(Totalemphrs<=companyEmpWage.Num_of_working_hrs && Totalworkingdays < companyEmpWage.Num_of_working_days) {
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
		 return Totalemphrs *CompanyEmpWage.WagePerHr;	

	}
		
	
	
		public static void main(String[] args){
			
			 EmpwageBuilderArray empWageBuilder=new EmpwageBuilderArray();
			 empWageBuilder.addCompanyEmpWage("Reliance" , 25 , 8 ,60);
			 empWageBuilder.addCompanyEmpWage("Central" , 20 ,6, 50);
			 empWageBuilder.computeWage();
			
		}

}
