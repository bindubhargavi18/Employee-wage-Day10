class EmployeeWage
{
	final static int fullTime=1;
	final static int partTime=2;
	private String company;
	private int empWageHr;
	private int workingDaysMonth;
	private int maxHrsInMonth;
	EmployeeWage(String company,int empWageHr,int workingDaysMonth,int maxHrsInMonth)
	{
		this.company=company;
		this.empWageHr=empWageHr;
		this.workingDaysMonth=workingDaysMonth;
		this.maxHrsInMonth=maxHrsInMonth;
	}
	int empWageCal()
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
