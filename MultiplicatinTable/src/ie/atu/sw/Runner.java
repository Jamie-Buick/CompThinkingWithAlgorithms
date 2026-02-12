package ie.atu.sw;

public class Runner {

	public static void main(String[] args) {
		multiplicationTable();
	}
	

	public static void multiplicationTable() {
		
		for (int x = 0; x < 13; x++) {
			for (int y = 0; y < 13; y++) {
				System.out.print(x*y + " ");
			}
			System.out.println();
		}
		

	}
}
