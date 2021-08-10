class EmployeeWage
{
	final static int fullTime=1;
	final static int partTime=2;
	static int empWageCal(String company,int empWageHr,int workingDaysMonth,int maxHrsInMonth)
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
		
		
		return totalWage;
	}
}
