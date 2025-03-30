package homework;

import java.util.ArrayList;

public class SalesDataArrayList {

	public static void main(String[] args) {
		ArrayList<Double> salesArray = new ArrayList<Double>();
		ArrayList<Double> costArray = new ArrayList<Double>();
		ArrayList<Double> profitArray = new ArrayList<Double>();
		
		fillSales(salesArray);
		fillCost(costArray);
		
		//System.out.println(salesArray);
		//System.out.println(costArray);
		displayProfit(salesArray, costArray, profitArray);
	}

public static void fillSales(ArrayList<Double> salesArray) {
	salesArray.add(0, 3.55);
	salesArray.add(1, 12.34);
	salesArray.add(2, 2.67);
	salesArray.add(3, 4.99);
	salesArray.add(4, 15.95);
}

public static void fillCost(ArrayList<Double> costArray) {
	costArray.add(0, 3.27);
	costArray.add(1, 10.61);
	costArray.add(2, 2.46);
	costArray.add(3, 4.59);
	costArray.add(4, 13.72);
}

public static void displayProfit(ArrayList<Double> salesArray, ArrayList<Double> costArray, ArrayList<Double> profitArray) {
	double sum = 0, totalSales = 0, totalCost = 0, totalProfit = 0;
	
	for (int i = 0; i < salesArray.size(); i++) {
		sum  = salesArray.get(i) - costArray.get(i);
		profitArray.add(i, sum);
		
		totalSales = totalSales + salesArray.get(i);
		totalCost = totalCost + costArray.get(i);
		totalProfit = totalProfit + profitArray.get(i);
	}
	
	System.out.print("   Sale Price\t Cost\t Profit\n");
	
	for (int i = 0; i < salesArray.size(); i++) {
		System.out.printf("   %10.2f %7.2f %9.2f\n", salesArray.get(i), costArray.get(i), profitArray.get(i));
	}
	
	//System.out.println();
	
	System.out.println("\t------------------------");
	System.out.printf("   %10.2f %7.2f %9.2f\n", totalSales, totalCost, totalProfit);
}

}

