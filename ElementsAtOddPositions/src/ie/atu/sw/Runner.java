package ie.atu.sw;

public class Runner {

	public static void main(String[] args) {
	
		int numbers[] = {1,10,50,100,250,2000,3651,5412,1,2,1000000,5,258,28};
		int outputArr2[] = elementsInOddPositions(numbers);
		
		for(int i = 0; i < outputArr2.length; i++) {
			System.out.println(outputArr2[i]);
		}
	}
	
	
	public static int[] elementsInOddPositions(int[] inputArr) {
		
		int outputArray[] = new int[inputArr.length /2];
		int outputArrayIndex = 0;
		
		for (int i = 0; i < inputArr.length; i++) {
			if (i % 2 != 0) {
				outputArray[outputArrayIndex] = inputArr[i];
				outputArrayIndex++;
			}
		}
		
		return outputArray;
	}
	
	
}
