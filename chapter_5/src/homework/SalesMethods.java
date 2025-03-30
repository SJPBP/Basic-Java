package homework;

import java.util.Scanner;

public class SalesMethods {
	
	public static double getPrice(Scanner in) {
		
		double p;
		
		System.out.print("Enter the Price of the item ");
		p = in.nextDouble();
		
		return p;
	}
	
	public static int getQuantity(Scanner in) {
		int q;
		
		System.out.print("Enter the number of items ");
		q = in.nextInt();
		
		return q;
	}
	
	public static double totaPrice(double p, int q) {
		
		double tP;
		tP = p * q;
		return tP;
	}
	
	
	public static double salesTax(double tP, double T) {
		
		double sT;
		sT = tP * T;
		return sT;
	}
	
	public static double totalSales(double tP, double sT) {
		
		double tS;
		tS = tP + sT;
		return tS;
	}
	
	public static void displaySales(int q, double p, double tP, double sT, double tS) {
		
		System.out.println();
		
		System.out.printf("%-11s", "Price");
		System.out.printf("$%5.2f\n", p);
		
		System.out.printf("%-11s", "Quantity");
		System.out.printf("$%5d\n", q);

		System.out.printf("%-11s", "Subtotal");
		System.out.printf("$%5.2f\n", tP);
		
		System.out.printf("%-11s", "Sales tax");
		System.out.printf("$%5.2f\n", sT);
		
		System.out.println("------------------");
		
		System.out.printf("%-11s", "Total Sale");
		System.out.printf("$%5.2f\n", tS);
	}
	
	
}
