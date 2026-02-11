package ie.atu.sw;

public class Runner {

	
	public static void main(String[] args) {
		// Array of random numbers
		int numbers[] = {1,10,50,100,250,2000,3651,5412,1,2,1000000,5,258,28};
		

		int outputArr2[] = reverseArray2(numbers);
		
		for (int k = 0; k < outputArr2.length; k++) {
			System.out.println(outputArr2[k]);
		}
		
		
	}
	

	public static int[] reverseArray2(int[] inputArr) {
		
		int j = 0;
		int outputArray[] = new int[inputArr.length];
		
		for (int i = inputArr.length-1 ; i >= 0; i--) {
			outputArray[j] = inputArr[i];
			j++;
		}
		
		return outputArray;
		
	}
	
}
