package ie.atu.sw;

public class Runner {

	public static void main(String[] args) {
		
		// Array of random numbers
		int numbers[] = {1,10,50,100,250,2000,3651,5412,1,2,1000000,5,258,28};
		
		// Print out the result of the findLargestElement function
		System.out.println(findLargestElement(numbers));
		
	}
	
	
	// Starting a runningMax variable at 0, check if the current element is greater than runningMax. If so, set runningMax = current element.
	// Repeat process for the length of the array.
	public static int findLargestElement(int[] numbers) {
		int runningMax = 0;
		
		for (int i = 0; i < numbers.length; i++ ) {
			if (numbers[i] > runningMax ) {
				runningMax = numbers[i];
			}
		}
		
		return runningMax;
		
	}
}
