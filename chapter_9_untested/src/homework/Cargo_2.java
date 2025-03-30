package homework;

public class Cargo_2 extends Aircraft{

	private int payload;

	public Cargo_2(int r, int cp, int p) {
		
		super.setRange(r);
		super.setFuelCap(cp);
		super.numPlanes = super.numPlanes + 1;
		payload = p;
	}

	public void display() {
		System.out.println("\tCargo Aircraft");
		System.out.println("\tAircraft range: " + super.getRange);
		System.out.println("\tAircraft fuel capacity: " + super.getFuelCap);
		System.out.println("\tAircraft payload: " + payload);
	}
}
