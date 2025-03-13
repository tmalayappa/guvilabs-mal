package Task2;

public class Product {

		private int pid;
		private double price;
		private int quantity;
		
		//construct with age and name
		public Product(int pid, double price, int quantity) {
			this.pid = pid;
			this.price = price;
			this.quantity = quantity;
		}
		
	    // pid getter 
	    public int getPid() {
	        return pid;
	    }

	    // price getter
	    public double getPrice() {
	        return price;
	    }

	    // quantity getter
	    public int getQuantity() {
	        return quantity;
	    }

	    // pid setter
	    public void setPid(int pid) {
	        this.pid = pid;
	    }

	    // price setter
	    public void setPrice(double price) {
	        this.price = price;
	    }

	    //quantity setter
	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    @Override
	    public String toString() {
	        return "Product{" +
	                "pid=" + pid +
	                ", price=" + price +
	                ", quantity=" + quantity +
	                '}';
	    }
		
		public void Display () {
	        System.out.println("Product Identity Number : " + pid);
	        System.out.println("Price per unit : " + price);
	        System.out.println("Quantity : " + quantity);
		}
		

	}
