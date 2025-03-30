package homework;

import javax.swing.*;
import java.awt.Graphics;

public class drawSalesMethods {
	public static int findLarestValue(int[] sArray) {
		int largestValue = 0;
		
		for (int i = 0; i < sArray.length; i++) {
			
			if (sArray[i] > largestValue) {
				largestValue = sArray[i];
			}
		}
		return largestValue;
	}
	
	public static void drawBar(Graphics g, int[] sArray, int largestValue) {
	    int x1 = 50, y1 = 25, x2 = 450, y2 = 475;
	    int width = 30, gap = 30;
	    int maxHeight = 300;

	    // X and Y-axis
	    g.drawLine(x1, y1, x1, y2);
	    g.drawLine(x1, y2, x2, y2);

	    System.out.println("s1 = " + sArray[0] + " s2 = " + sArray[1] + " s3 = " + sArray[2] + " s4 = " + sArray[3]);

	    for (int i = 0; i < sArray.length; i++) {
	        int height = (int)(((double)sArray[i] / largestValue) * maxHeight); 
	        int xStart = x1 + ((width + gap) * (i + 1));
	        int yStart = y2 - height;
	        g.fillRect(xStart, yStart, width, height);
	    }
	}

}
