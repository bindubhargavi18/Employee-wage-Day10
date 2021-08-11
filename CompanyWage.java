class CompanyWage
{
	public String company;
	public int empWageHr;
	public int workingDaysMonth;
	public int maxHrsInMonth;
	public int empWage=0;
	CompanyWage(String Company,int empWageHr,int workingDaysMonth,int maxHrsInMonth)
	{
		this.company=company;
		this.empWageHr=empWageHr;
		this.workingDaysMonth=workingDaysMonth;
		this.maxHrsInMonth=maxHrsInMonth;
	}
}