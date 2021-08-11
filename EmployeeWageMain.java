class EmployeeWageMain
{
	public static void main(String args[])
	{
		CompanyWage[] companywage=new CompanyWage[3];
		System.out.println("Welcome to employee wage computation Program");
		EmployeeWage amazon=new EmployeeWage();
		EmployeeWage deloitte=new EmployeeWage();
		System.out.println("Employee wage for company amazon: "+amazon.empWageCal("Amazon",10,5,75));
		System.out.println("Employee wage for company Deloitte: "+deloitte.empWageCal("deloitee",20,4,1));
	}
}
	