class EmployeeWageMain
{
	final static int fullTime=1;
	final static int partTime=2;
	static int empWageHr=20;
	static int workingDaysMonth=20;
	static int maxHrsInMonth=100;
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
	    int totalEmpHrs=0;
	    int totalWorkingDays=0;
	    while(totalEmpHrs<=workingDaysMonth && totalWorkingDays<workingDaysMonth)
	    {
	    	totalWorkingDays++;
	    	int emp=(int) Math.floor(Math.random()*10)%3;
	    	switch(emp)
	    	{
	    		case fullTime:
	    				empHrs=8;
	    				break;
	    		
	    		case partTime:
	    				empHrs=4;
	    				break;

	    		default:
	    				empHrs=0;
	    	}
	    	totalEmpHrs+=empHrs;
	    	empWage=totalEmpHrs*empWageHr;
	    	totalWage+=empWage;
		}
		
		System.out.println("Employee wage: "+empWage);
		System.out.println("Total employee wage: "+totalWage);
	}
}
