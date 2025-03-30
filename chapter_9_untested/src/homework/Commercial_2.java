package homework;

public class Commercial_2 extends Aircraft{
	
	private int seats;

	public Commerical_2(int r, int cp, int s) {
		
		super.setRange(r);
		super.setFuelCap(cp);
		super.numPlanes = super.numPlanes + 1;
		seats = s;
	}

	public void display() {
		System.out.println("\tCommerical Aircraft");
		System.out.println("\tAircraft range: " + super.getRange);
		System.out.println("\tAircraft fuel capacity: " + super.getFuelCap);
		System.out.println("\tAircraft seating: " + seats);
	}
}
