package homework;

import javax.swing.*;
import java.awt.Graphics;

import java.util.Scanner;

public class DrawSales {
	
	private static int[] sArray = new int[4];
    private static int largestValue;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		// System.out.print("Enter 1st quarter sales ");
		// sArray[0] = in.nextInt();
		// System.out.print("Enter 2nd quarter sales ");
		// sArray[1] = in.nextInt();
		// System.out.print("Enter 3rd quarter sales ");
		// sArray[2] = in.nextInt();
		// System.out.print("Enter 4th quarter sales ");
		// sArray[3] = in.nextInt();
        
		sArray[0] = 245;
		sArray[1] = 165;
		sArray[2] = 345;
		sArray[3] = 98;
		
		in.close();
        
        
		JFrame myFrame = new JFrame("Qyarterly Sales Chart");
		myFrame.setSize(500, 500);
		
		largestValue = drawSalesMethods.findLarestValue(sArray);
		
		JComponent comp = new JComponent() {
			public void paintComponent(Graphics g) {
				drawSalesMethods.drawBar(g, sArray, largestValue);
			}
		};
		
		myFrame.add(comp);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
}	


