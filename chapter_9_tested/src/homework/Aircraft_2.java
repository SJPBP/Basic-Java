package homework;

public class Aircraft_2 {

	private int range;
	private int fuelCapacity;
	public static int numPlanes;

	public Aircraft_2() {
		range = 0;
		fuelCapacity = 0;
		numPlanes++;
	}

	public void setRange(int r) {
		range = r;
	}

	public void setFuelCap(int fc) {
		fuelCapacity = fc;
	}

	public int getRange() {
		return range;
	}

	public int getFuelCap() {
		return fuelCapacity;
	}

	public void display() {
		System.out.println("\tAircraft range: " + range);
		System.out.println("\tAircraft fuel capacity: " + fuelCapacity);
	}
}
