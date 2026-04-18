package ie.atu.sw;

public class Runner {

	
	public static boolean inTrouble(boolean catTalking, int time){
		
		if (catTalking) {
			if ( time < 6 ) {
				return true;
			}else if (time > 21) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return false;
		
	}
	
	
	// if n is divisible not the result
	public static String factorialBuzz(int number){
		
		
		int factorial = 1;
		
		for (int i = 1; i <= number; i++) {
			
			factorial *= i;
		
		}
		
		if (number % 3 == 0) {
			return "Fizz! the factorial is " + factorial;
			
		}else if (number % 5 == 0) {
			return "Buzz! the factorial is " + factorial;
		}
		else {
			return String.valueOf(factorial);
		}
		
	}
	
	
	public static String party(int tea, int biscuits){
	
		
		if ( (tea < 5) || (biscuits < 5) ) {
			return "bad";
		}
		else if ( ( (tea / biscuits >= 2) || (biscuits / tea >= 2) ) ) {
			return "great";
		}
		else {
			return "good";
		}
		
		
	
	    
	}
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(inTrouble(false, 16));
		//System.out.println(factorialBuzz(9));
		System.out.println(party(20,6));
		
	}
}
