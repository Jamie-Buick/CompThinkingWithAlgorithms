package ie.atu.sw;

public class Runner {

	// Q1 Reverse a String iteration and recursion
	public static String revStringItr(String orig) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = orig.length()-1; i >= 0; i--) {
			sb.append(orig.charAt(i));
		}
		
		return sb.toString();
	}
	
	
	public static String revStringRecur(int n, String orig) {
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Before if");
		
		if (n < 0) {
			System.out.println("In if");
			return sb.toString();
		}
		
		System.out.println("After if");
		sb.append(orig.charAt(n));
		System.out.println(sb.toString());
		return orig.charAt(n) + revStringRecur(n - 1, orig);
				
	}
	
	public static int[] revArrayItr(int[] array) {
		int outputArray[] = new int[array.length];
	
		int outIndex = 0;
		for (int i = array.length-1; i >= 0; i--) {
			outputArray[outIndex] = array[i];
			System.out.println(outputArray[outIndex]);
			outIndex++;
		}
		
		return outputArray;
				
	}
	
	
	public static void revArrayRec(int startIndex, int endIndex, int[] array) {
		//int outputArray[] = new int[array.length];
		//int outIndex = 0;
		
		if (startIndex >= array.length) {
			
			for(int i = 0; i< array.length; i++) {
				System.out.println(array[i]);
			}
			
			return;
		}
		
		if (startIndex < endIndex) {
			int temp = array[startIndex]; // Save
			array[startIndex] = array[endIndex]; // Overwrite
			array[endIndex] = temp; // Restore from save
			
		} 
	
			
		revArrayRec(startIndex+1, endIndex-1, array);
			
	}
	
	
	public static void findElement(int n, int target, int[] array) {
	
			if (array[n] == target) {
				System.out.println("got it ");
				return;
		
			}
		
			if ( n < array.length-1) {
				findElement(n + 1, target, array);
				System.out.println("na");
			}
	}
	
	public static boolean findElement1(int[] array, int target, int index) {
		
		if (array[index] == target) {
			System.out.println("got it ");
			return true;
	
		}
	
		if ( index < array.length-1) {
			return false;
		}
		return false;
}
	
	
	public static int sumArray(int n, int[] array) {
		
		if (n == array.length) {
			return 0;
		}
	
		/*
		if ( n < array.length) {
	
			sum += array[n];
			System.out.println(sum);
		    sumArray(sum, n + 1, array);
		
		}
		*/
		
		return array[n] + sumArray(n + 1 , array);
	}
	
	
	public static int fib(int n) {
		
		if (n == 0 || n == 1) {
			//System.out.println("I am here");
			return n;
		}
	
		return fib(n-1) + fib(n-2);
	}
	
	public static boolean isPalindrome(int start, int end, String word)	{	
		if (start >= end) {
	        return true;
	    }

	    if (word.charAt(start) != word.charAt(end)) {
	        return false;
	    }

	    return isPalindrome(start + 1, end - 1, word);
	}
	
	
	
	
	public static void main(String[] args) {
		
		// Q1
		
		// Iteration
		//String outputIter = revStringItr("Hello");
		//System.out.println(outputIter);
		
		// Recursion
		//String outputRecur = revStringRecur(4, "Hello");
		//System.out.println(outputRecur);
		
		
		// Q2
		
		int numbers[] = {1,10,50,100,250,2000,3651,5412,1,2,1000000,5,258,28};

		// Iteration
		//int[] outputItr = revArrayItr(numbers);
		//System.out.println(outputIter);
		
		// Recursion
		//revArrayRec(0, numbers.length-1, numbers);
		//System.out.println(outputRecur);
		
		// Q3 
		// Recursion
		//findElement(0, 100, numbers); 
		
		
		//Q4 
		 //int sum = sumArray(0, numbers); 
		// System.out.println(sum);
		 
		 //Q5
		// int fib = fib(10); 
		// System.out.println(fib);
		
		//Q6 Palindrome 
		//Boolean palindrome = isPalindrome(0, 6, "racecar");
		//System.out.println(palindrome);
		
		
		
		//test
		System.out.println(findElement1(new int[]{0,3,4,2,8,1,9}, 4, 0));

	}
	

	
	
}
