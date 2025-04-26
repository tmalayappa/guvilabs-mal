package Task2;

import java.util.Scanner;

public class ProductMain {
	
    public static double calculateTotalAmount(Product[] products) {
        if (products == null || products.length == 0) {
            return 0.0; // Return 0 if no products are entered
        }

        double totalAmount = 0.0;
        for (Product product : products) {
            if (product != null) {
                totalAmount += product.getPrice() * product.getQuantity();
            }
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5]; // Array to store 5 products

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity); // Create and store product
        }

        System.out.println("\nProduct information:");
        for (Product product : products) {
            System.out.println(product);
        }

        // Find PID of product with highest price
        int highestPricePid = findHighestPricePid(products);

        if (highestPricePid != -1) {
            System.out.println("\nPID of product with highest price: " + highestPricePid);
        } else {
            System.out.println("\nNo products entered.");
        }
        
        double totalAmount = calculateTotalAmount(products);

        System.out.println("\nTotal amount spent on all products: $" + totalAmount);
        
        scanner.close();
    }
    
    public static int findHighestPricePid(Product[] products) {
        if (products == null || products.length == 0) {
            return -1; // Return -1 if no products are entered
        }

        double highestPrice = Double.MIN_VALUE;
        int highestPricePid = -1;

        for (Product product : products) {
            if (product != null && product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                highestPricePid = product.getPid();
            }
        }

        return highestPricePid;
    }
    

}
