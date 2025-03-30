package homework;

public class Cargo extends Aircraft{

	private int payload;

	public Cargo(int r, int cp, int p) {
		
		super.setRange(r);
		super.setFuelCap(cp);
		payload = p;
	}

	public void display() {
		System.out.println("\tCargo Aircraft");
		System.out.println("\tAircraft range: " + super.getRange);
		System.out.println("\tAircraft fuel capacity: " + super.getFuelCap);
		System.out.println("\tAircraft payload: " + payload);
	}
}
