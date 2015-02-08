package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Employee 
{
	private String employeeName;
	private int employeeID;
	private String employeeTitle;
	
	public Employee(String name, int id, String title)
	{
		this.employeeID = id;
		this.employeeName  = name;
		this.employeeTitle = title;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeTitle() {
		return employeeTitle;
	}
	public void setEmployeeTitle(String employeeTitle) {
		this.employeeTitle = employeeTitle;
	}
	
	public static Comparator<Employee> EmployeeNameComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.employeeName.compareTo(o2.employeeName);
		}
	};
		
	public static void main(String[] args)
	{
		Employee[] list = new Employee[3];
		list[0]= new Employee("Adam",1,"Software Engineer");
		list[1] = new Employee("David", 0, "Senior Engineer");
		list[2] = new Employee("Blake", 2, "Test");
		
		Arrays.sort(list, Employee.EmployeeNameComparator);
		
		for(Employee e : list)
			System.out.println(e.employeeName+" "+e.employeeID+" "+e.employeeTitle);
		
	}
	}

