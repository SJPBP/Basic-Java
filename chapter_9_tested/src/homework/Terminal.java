package homework;

public class Terminal {

	public static void main(String[] args) {
		Commercial comClass = new Commercial(1500, 665, 23);
		comClass.display();

		System.out.println();
		System.out.println("Hello World");

		Cargo cargoClass = new Cargo(870, 335, 3680);
		cargoClass.display();
	}

}
