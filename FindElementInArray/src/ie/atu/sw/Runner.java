package ie.atu.sw;

public class Runner {

	
	public static void main(String[] args) {
		
		int numbers[] = {1,10,50,100,250,2000,3651,5412,1,2,1000000,5,258,28};
		
		System.out.println(foundElement(5452, numbers));
		
	}
	
	
	public static boolean foundElement(int target, int inputArray[]) {
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == target) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
