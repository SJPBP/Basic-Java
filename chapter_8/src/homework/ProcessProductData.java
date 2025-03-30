package homework;

public class ProcessProductData {

	public static void main(String[] args) {
		ProductClass p1 = new ProductClass("Mug", 8.50, 23);
		ProductClass p2 = new ProductClass("T-shirt", 12.95, 45);
		ProductClass p3 = new ProductClass("Towel", 18.50, 36);

		// Display the product details
		p1.displayProductInfo();
		p2.displayProductInfo();
		p3.displayProductInfo();
	}

}
