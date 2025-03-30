package homework;

public class Commercial extends Aircraft{
	
	private int seats;

	public Commerical(int r, int cp, int s) {
		
		super.setRange(r);
		super.setFuelCap(cp);
		seats = s;
	}

	public void display() {
		System.out.println("\tCommerical Aircraft");
		System.out.println("\tAircraft range: " + super.getRange);
		System.out.println("\tAircraft fuel capacity: " + super.getFuelCap);
		System.out.println("\tAircraft seating: " + seats);
	}
}
