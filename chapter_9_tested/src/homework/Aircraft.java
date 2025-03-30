package homework;

public class Aircraft {

	private int range;
	private int fuelCapacity;
	public static int numPlanes;

	public Aircraft() {
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
