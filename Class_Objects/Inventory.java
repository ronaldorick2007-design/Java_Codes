//Java Programme to display items that need restock
//LOGIC:
//  Create a Product class and Instantiate objects,
//  Create an array of objects, Iterate through array,
//  And display warning message if the quantity is less than a k.

//Creating a class Product
class Product{
    //Attributes
	public String productName;
	public int quantity;
	
    //Constructor
	Product(String productName, int quantity){
		this.productName = productName;
		this.quantity = quantity;
	}
}

//Main class
public class Inventory {
	public static void main(String args[]) {
        //Objects Instantiation and assignment
		Product[] products = new Product[5];
		
		products[0] = new Product("Laptop",15);
		products[1] = new Product("Mouse",5);
		products[2] = new Product("Monitor",12);
		products[3] = new Product("Keyboard",8);
		products[4] = new Product("Webcam",20);
		
        int k = 10;                                     //=>k
        //Iteration
		for(Product p : products) {
			if(p.quantity < k) {
				System.out.println(p.productName + " : Restock Recommended (Current: " + p.quantity + ")");
			}
		}
	}
}
