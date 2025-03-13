package Task4;

public class Employee implements Taxable{
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        return salary * 12 * incomeTax; // Yearly salary * incomeTax
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
    }
    
	public void DisplayEmployee () {
        System.out.println("Employee's ID : " + empId);
        System.out.println("Employee's Name : " + name);
        System.out.println("Employee's Salary : " + salary);
	}
}
