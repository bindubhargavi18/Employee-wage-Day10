class EmployeeWageMain
{
	public static void main(String args[])
	{
		System.out.println("Welcome to employee wage computation Program");
		EmployeeWage em=new EmployeeWage();
		System.out.println("Employee wage for company amazon: "+em.empWageCal("Amazon",120,20,160));
		System.out.println("Employee wage for company Deloitte: "+em.empWageCal("Deloitte",90,15,75));
	}
}
	