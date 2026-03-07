package ie.atu.sw;

public class Runner {

	
	public static boolean scoreDiff(int[] arr) {
		
		for (int i = 0; i < arr.length-2; i++) {
			
			if( arr[i+1] - arr[i] < 3) {
				
				int diff = arr[i+1] - arr[i];
				
				if (arr[i+2] - arr[i+1] == diff) {
					return true;
				}
			}
	
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(scoreDiff(new int[] {12,13,15}));
		
		
	}
	
}
