package total_cost;

import java.util.Scanner;

public class total_cost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner in = new Scanner(System.in);
		Scanner in_2 = new Scanner(System.in);
		
		System.out.print("Enter the meal price: $");
		System.out.print("Enter the meal price: $");
		
		double price = in.nextDouble();
		
		double tip_per_percentage = 0.2;
		double saleTax_percentage = 0.05;
		
		double total_cost = price + (tip_per_percentage * price)  + (saleTax_percentage * price);
		
		System.out.println("Total Cost: $ " + total_cost);
	}

}
