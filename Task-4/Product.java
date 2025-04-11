package Task4;

public class Product implements Taxable	{
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calcTax() {
        return price * salesTax; // Unit price * salesTax
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", price=" + price + ", quantity=" + quantity + "]";
    }
    
	public void DisplayProduct () {
        System.out.println("Product ID : " + pid);
        System.out.println("Product Price per unit : " + price);
        System.out.println("Product Quantity : " + quantity);
	}
}
