class EmployeeWageMain
{
	public static void main(String args[])
	{
		System.out.println("Welcome to employee wage computation Program");
		int fullTime=1;
		int emp=(int) Math.floor(Math.random()*10)%2;
		if(emp==1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}