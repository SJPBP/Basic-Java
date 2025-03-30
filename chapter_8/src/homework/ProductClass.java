package homework;

public class ProductClass {
	private String productDescription;
	private double productPrice;
	private int productInventory;
	private static boolean hasDisplayTitle;

	public ProductClass() {
		productDescription = "NONE";
		productPrice = 0.0;
		productInventory = 0;
		hasDisplayTitle = false;
	}

	public ProductClass (String pD, double pP, int pI) {
		productDescription = pD;
		productPrice = pP;
		productInventory = pI;
	}

	public void displayProductInfo() {
		if (hasDisplayTitle == false) {
			System.out.printf("%-15s %-10.2f %-10d\n", productDescription, productPrice, productInventory);
			hasDisplayTitle = true;
		}
		System.out.printf("%-15s %-10.2f %-10d\n", productDescription, productPrice, productInventory);
	}
}

