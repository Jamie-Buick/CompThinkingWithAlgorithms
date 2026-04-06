package ie.atu.sw;

public class Runner {

	
	// Examples from week 8 Practice homework
	
	// 1) Return the reverse of a given string.
	
	public static String revString(String forwards) {
		
		// base case
		if (forwards.length() == 0) {
			return forwards;
		}
		
		// Get last character
		String backwards = forwards.substring(forwards.length() -1);
		
		// Remove last character for 'forwards'
		forwards = forwards.substring(0,forwards.length() -1);
			
		return backwards + revString(forwards);
	}
	

	
	//coding brat
	
	// Does an array contain 6
	
	public static boolean array6(int[] nums, int index) {
		
		if (index >= nums.length ) {
			return false;
		}
		  
		if (nums[index] == 6) {
			return true;
		}
		
			
		return array6(nums, index + 1);
		
	}

	
	
	public static int array11(int[] nums, int index) {
		//int temp=0;  
		
		if (index >= nums.length) {
			return 0;
		}
		  
	    if (nums[index] != 11) {
	    	return array11(nums, index+1);
	    }
	    
	    return 1 + array11(nums, index+1);
	  
	}

	
	public static boolean array220(int[] nums, int index) {

		 if (index >= nums.length-1) {
			  return false;
		  }
		   
		if (nums[index] * 10 == nums[index + 1]) {
			  return true;
		  }
		  
		
		
		 
		 return array220(nums, index+1);
	}

	
	
	public static String stringClean(String str) {
			
		
		if (str.length() <= 1) {
			return str;
		}
		
		if (str.charAt(0) != str.charAt(1)) {
			 return str.charAt(0) + stringClean(str.substring(1));
		}
		
	
		return stringClean(str.substring(1));
		 
	}

	
	public static String allStar(String str) {
		if (str.length() <= 1) {
			return str;
		}
		
		String temp = str.substring(1);
		
		return str.substring(0,1) + "*" + allStar(temp);
		
	}

	
	public static int powerN(int base, int n) {
		
		if (n < 1) {
			  return 1;
		 }
		
		
	
		  return base * powerN(base, n-1); 
		  
	}

	
	public static boolean nestParen(String str) {
	
		if (str.length() == 0) {
			return true;
		}
		
		if ( (str.charAt(0) == '(') && (str.charAt(str.length()-1) == ')') )  {
			return nestParen(str.substring(1,str.length()-1));
		}
		
		
		return  false;
		
		
		
		
	}
	
	
	public static int strCount(String str, String sub) {
		
		if (str.length() < sub.length()) {
			return 0;
		}
		
		
		if (str.substring(0, sub.length()).equals(sub) ) {
			return 1 + strCount(str.substring(sub.length()), sub);
		}else {
			return strCount(str.substring(1), sub);
		}
		
		  
	}


	
	
	public static void main(String[] args) {
		
		//System.out.println(revString("jamiebuick"));
		//System.out.println(array6(new int[] {}, 0));
		//System.out.println(array11(new int[] {1,2,11,11}, 0));
		//System.out.println(array220(new int[] {1,2,20}, 0));
		//System.out.println(stringClean("abbbcdd"));
		//System.out.println(allStar("hello"));
		//System.out.println(powerN(3,0));
		//System.out.println(nestParen("(((x))"));
		System.out.println(strCount("cacatcowcat", "cat"));
	
	}
	
}
