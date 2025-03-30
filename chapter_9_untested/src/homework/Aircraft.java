package homework;

public class Aircraft {
	
	private int range;
	private int fuelCapacity;
	
	public  Aircraft() {
		range = 0;
		fuelCapacity = 0;
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
		System.out.println("Aircraft range: " + range);
		System.out.println("Aircraft fuel capacity: " + fuelCapacity);
	}
}
