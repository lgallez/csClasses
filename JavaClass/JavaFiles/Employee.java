// Name: Layla Gallez
// Data: 6/28/2020
// Description: explain static variables 
// File Name: Employee.java

// 1) Static variables are variables that are shared between all instances. 
// Any changes to static variables will change as such. 

class Employee 
{
	static int numberEmployees;
	int idNumber;

	Employee(int newID)
	{
		idNumber = newID;
		numberEmployees++; // changing static variable changes it for all instances
	}

	public String toString()
	{
		return " idNumber = " +	idNumber + ", numberEmployees = " + numberEmployees;
	}

	public static void main(String[] args)
	{
		System.out.println("The value of numberEmployees = " + Employee.numberEmployees);
		
		Employee employee_one = new Employee(123);
		Employee employee_two = new Employee(456);
		Employee employee_three = new Employee(789);

		System.out.println("employee_one = " + employee_one);
		System.out.println("employee_two = " + employee_two);
		System.out.println("employee_three = " + employee_three);
	}
}