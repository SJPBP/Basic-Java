package homework;

import java.util.Scanner;

public class Planer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		String timeOfEvent;
		double balconyPrice, eventCost, mainFloorPrice, profit, totalSales, totalTickets;
		totalSales = 0;
		mainFloorPrice = 0;
		balconyPrice = 0;
		eventCost = 0;
		
		
		final int MAIN_FLOOR_TICKETS = 200;
		final int BALCONY_TICKETS = 75;
		final double MAIN_FLOOR_COST = 29.50;
		final double BALCONY_COST = 19.50;
		final double MATINEE_COST = 1200.00;
		final double EVENING_COST = 1450.00;
		
		
		System.out.print("Enter the tickets sold ");
		totalTickets = in1.nextDouble();
	
		System.out.print("Enter \"M\" for Matinee, \"E\" for Evening ");
		timeOfEvent = in2.next();
		
		in1.close();
		in2.close();
		
		if (totalTickets <= MAIN_FLOOR_TICKETS || totalTickets >= MAIN_FLOOR_TICKETS) {
			if (totalTickets >= 200) {
				mainFloorPrice = 200 * MAIN_FLOOR_COST;
			}
			else {
				mainFloorPrice = totalTickets * MAIN_FLOOR_COST;
			}
			totalSales = mainFloorPrice;
			totalTickets = totalTickets - MAIN_FLOOR_TICKETS;
		}	
		if (totalTickets > 0 && totalTickets <= BALCONY_TICKETS) {
				balconyPrice = totalTickets * BALCONY_COST;
				totalSales = totalSales + balconyPrice;
		}
		
		
		if (timeOfEvent.equals("M")) {
			eventCost = MATINEE_COST;
		}
		else if(timeOfEvent.equals("E")) {
			eventCost = EVENING_COST;
		}
		
		profit = totalSales - eventCost;
		
		System.out.println();
		System.out.printf("Main Floor ticket sales: $%.2f\n", mainFloorPrice);
		System.out.printf("Balcony ticket sales: $%.2f\n", balconyPrice);
		System.out.printf("Total sales: $%.2f\n", totalSales);
		System.out.printf("Event cost: $%.2f\n", eventCost);
		System.out.printf("Profit from the even: $%.2f\n", profit);
	}

}
