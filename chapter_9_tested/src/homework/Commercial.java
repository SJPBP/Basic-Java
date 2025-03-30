package homework;

public class Commercial extends Aircraft{
	
	private int seats;

	public Commercial(int r, int cp, int s) {
		
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
