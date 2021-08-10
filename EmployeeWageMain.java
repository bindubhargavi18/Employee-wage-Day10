class EmployeeWageMain
{
	public static void main(String args[])
	{
		System.out.println("Welcome to employee wage computation Program");
		EmployeeWage amazon=new EmployeeWage("Amazon",120,20,160);
		System.out.println("Employee wage for company amazon: "+amazon.empWageCal());
		EmployeeWage deloitte=new EmployeeWage("Deloitte",90,15,75);
		System.out.println("Employee wage for company Deloitte: "+deloitte.empWageCal());
	}
}
	