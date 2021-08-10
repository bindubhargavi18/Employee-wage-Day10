class EmployeeWageMain
{
	final static int fullTime=1;
	final static int partTime=2;
	static int empWageHr=20;
	static int workingDays=20;
	public static void main(String args[])
	{
		System.out.println("Welcome to employee wage computation Program");
		empWageCal();
	}
	static void empWageCal()
	{
	    int empHrs=0;
	    int empWage=0;
	    int totalWage=0;
	    int emp=(int) Math.floor(Math.random()*10)%3;
	    switch(emp)
		{
		   case fullTime:empHrs=8;
				 System.out.println("Employee is present and is full time");
			         empWage=empHrs*empWageHr;
			         totalWage=empWage*workingDays;
			         System.out.println("Salary for a month: "+totalWage);
			         break;
		
		   case partTime:empHrs=4;
			         System.out.println("Employee is present and is part time");
			         empWage=empHrs*empWageHr;
			         totalWage=empWage*workingDays;
			         System.out.println("Salary for a month: "+totalWage);
			         break;

		   default:empHrs=0;
			   System.out.println("Employee is absent");
			   empWage=empHrs*empWageHr;
			   totalWage=empWage*workingDays;
			   System.out.println("Employee Salary is: "+totalWage);
		}
	}
}
