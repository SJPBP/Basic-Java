package calcuate_radius;

import java.util.Scanner;

public class find_all_and_circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double Pi= 3.14159;
		
		Scanner in_rad = new Scanner(System.in);
		Scanner in_unt = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		double radius = in_rad.nextDouble();
		
		System.out.print("Enter the units (feet, miles, etc.): ");
		String unit = in_rad.next();
		
		double surface_area = 4 * Pi * Math.pow(radius, 2);
		double volume = (4 * Pi) * (Math.pow(radius, 3) / 3);
		double circumference = 2 * Pi * radius;
	
		System.out.printf("The surface area is %,.3f square %s\n", surface_area, unit);
		System.out.printf("The volume is %,.3f cubic %s\n", volume, unit);
		System.out.printf("The circumference is %,.3f cubic %s\n", circumference, unit);

	}

}
