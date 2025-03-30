package homework;

import java.util.Scanner;

public class Sales {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		final double TAX = 0.07;
		double Price, totalPrice, salesTax, totalSales;
		int Quantity;
		
		Price = SalesMethods.getPrice(in);
		Quantity =  SalesMethods.getQuantity(in2);
		totalPrice = SalesMethods.totaPrice(Price, Quantity);
		salesTax = SalesMethods.salesTax(totalPrice, TAX);
		totalSales = SalesMethods.totalSales(totalPrice, salesTax);
		
		// Display
		SalesMethods.displaySales(Quantity, Price, totalPrice, salesTax, totalSales);
		
		in.close();
		in2.close();
	}

}
