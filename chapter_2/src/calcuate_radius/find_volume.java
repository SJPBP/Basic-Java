package calcuate_radius;

import java.util.Scanner;

public class find_volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double Pi= 3.14159;
		
		Scanner in_rad = new Scanner(System.in);
		Scanner in_unt = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		double radius = in_rad.nextDouble();
		
		System.out.print("Enter the units (feet, miles, etc.): ");
		String unit = in_rad.next();
		
		double volume = (4 * Pi) * (Math.pow(radius, 3) / 3);
		
		System.out.printf("The volume area is %,.3f cubic %s", volume, unit);
	}

}
