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
		super.display();
		System.out.println("\tAircraft payload: " + payload);
	}
}
