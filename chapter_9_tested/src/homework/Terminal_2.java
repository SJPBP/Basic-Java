package homework;

public class Terminal_2 {

	public static void main(String[] args) {
		Commercial com2Class = new Commercial(1500, 665, 23);
		com2Class.display();
		
		System.out.println();
		System.out.println("The Number of Planes: " + com2Class.numPlanes);
		 
		System.out.println();
		
		Cargo cargo2Class = new Cargo(870, 335, 3680);
		cargo2Class.display();
		
		System.out.println();
		System.out.println("The Number of Planes: " + cargo2Class.numPlanes);
	}

}
