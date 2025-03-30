package homework;

public class Commercial_2 extends Aircraft_2{
	
	private int seats;

	public Commercial_2(int r, int cp, int s) {
		
		super.setRange(r);
		super.setFuelCap(cp);
		seats = s;
	}

	public void display() {
		System.out.println("\tCommerical Aircraft");
		super.display();
		System.out.println("\tAircraft seating: " + seats);
	}
}
