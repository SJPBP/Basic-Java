package homework;

import java.util.Scanner;

public class ComputeWaterLevel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		double waterLevel, gateOpen, dischargeRate;
		int minutePassed = 1;
		
		System.out.print("Enter the water level(> 3.3) ");
		waterLevel = in.nextDouble();
		while(waterLevel < 3.3)
		{
			System.out.print("Enter the water level(> 3.3) ");
			waterLevel = in.nextDouble();
		}
		
		System.out.print("Enter the gate opening in one foot increments ");
		gateOpen = in.nextDouble();
		while(gateOpen < 1)
		{
			System.out.print("Enter the gate opening in one foot increments ");
			gateOpen = in.nextDouble();
		}
		
		System.out.println();
		
		while(waterLevel >= 3.3)
		{
			dischargeRate = gateOpen * 0.03;
			waterLevel = waterLevel - dischargeRate;
			
			System.out.printf("Minute: %3d Water Level: %.2f\n", minutePassed, waterLevel);
			
			minutePassed = minutePassed + 1;
		}
		
		System.out.println();
		System.out.print("The water level is now at 3.3 feet.");
		
		in.close();
		in2.close();
	}

}
