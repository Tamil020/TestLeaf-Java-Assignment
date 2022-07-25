package week2.day1;

public class Employee {
public void printEmployeeName(String empName,int empId) {
	System.out.println("Employee Name:"+empName);
	System.out.println("Employee ID:"+empId);
}
public void getEmployeeAddress(String address) {
	System.out.println("Address:"+address);	
}
public void employeeSalary(double salary) {
	System.out.println("Salary;"+salary);
}
public void employeeMobile(long employeeMobile) {
	System.out.println("EmployeeMobile:"+employeeMobile);
}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.printEmployeeName("teejay",112);
		e.getEmployeeAddress("salem");
		e.employeeSalary(12345678);
		e.employeeMobile(123456789L);// TODO Auto-generated method stub

	}

}
