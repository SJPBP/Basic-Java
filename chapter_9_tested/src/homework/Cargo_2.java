package homework;

public class Cargo_2 extends Aircraft_2{

	private int payload;

	public Cargo_2(int r, int cp, int p) {
		
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
