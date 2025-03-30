package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculateGrossPay {

	public static void main(String[] args) {
		String employeeName, employeeId;
		int hoursWorked;
		double hoursRate, grossPay;
		
		try (Scanner inFile = new Scanner(new File("data.txt"))) {
			System.out.printf("Employee \t ID# \t Gross Pay\n");
			System.out.println("-".repeat(34));
			
			while (inFile.hasNext()) {
				employeeName = inFile.next();
				employeeId = inFile.next();
				hoursRate = Double.parseDouble(inFile.next());
				hoursWorked = Integer.parseInt(inFile.next());
				grossPay = hoursRate * hoursWorked;
				
				System.out.printf("%s \t %11s \t $%.2f\n", employeeName, employeeId, grossPay);
			}	
		}
		catch (FileNotFoundException e) {
			System.out.println("Data file cannot be opened.");
			e.printStackTrace();
		}
		
		
	}

}
