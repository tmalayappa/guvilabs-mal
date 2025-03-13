package Task2;

public class Employee extends Person{
	private int empID;
	private double salary;
	
	public Employee (String name, int age, int empID, double salary) {
		super(name, age);
		this.empID = empID;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}
	
	public double getSalary() {
		return salary;
	}
	
    @Override
    public String toString() {
        return "Employee [employeeID=" + empID + ", salary=" + salary + ", " + super.toString() + "]";
    }
	
	public void Display () {
        System.out.println("Person's Name : " + super.getName());
        System.out.println("Person's Age : " + super.getAge());
        System.out.println("Person's employee ID : " + empID);
        System.out.println("Person's Salary : " + salary);
	}	
	
}
