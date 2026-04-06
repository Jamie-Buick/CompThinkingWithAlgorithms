package ie.atu.sw;

public class Runner {

	
	public static int factorial(int n) {
		  
		  if (n < 2) {
		    return n;
		  }
		  
		  return n * factorial(n-1);
	}
	
	public static int countX(String str) {
		
		
		if (str.length() == 0 ) {
			return 0;
		}
		
		if (str.charAt(0) != 'x' ){
			return countX(str.substring(0, str.length() - 1));
		  }
		else {
			return 1 + countX(str.substring(0, str.length() - 1));
		}
		  
		  
	}

	public static int countHi(String str) {
		  if (str.length() < 2){
		    return 0;
		  }
		  
		  if (str.substring(0,2).equals("hi")) {
			  return 1 + countHi(str.substring(2));
		  }
		  
		  return countHi(str.substring(1));
		 
		}
	
	
	
	public static String changeXY(String str) {
	
		  if (str.charAt(0) == 'x') {

			    return changeXY(str.substring(0) + "y");
		  }
		return str;
		


		  
	}



	
	

	
	
	
	public static void main(String[] args) {
		//System.out.println(factorial(6));
		//System.out.println(countX("xdxdx"));
		//System.out.println(countHi("hihi"));
		System.out.println(changeXY("xxx"));
	}
	
}
