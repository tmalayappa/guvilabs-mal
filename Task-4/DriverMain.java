package Task4;

import java.util.Scanner;

public class DriverMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Employee Information input
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, empSalary);
        double incomeTaxAmount = employee.calcTax();
        System.out.println("Employee: " + employee);
        System.out.println("Income Tax Annual: $" + incomeTaxAmount);

        System.out.println("--------------------");

        // Product Information input
        System.out.print("Enter Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);
        double salesTaxAmount = product.calcTax();
        product.DisplayProduct();
        System.out.println("Sales Tax: $" + salesTaxAmount);

        scanner.close();
    }
}
