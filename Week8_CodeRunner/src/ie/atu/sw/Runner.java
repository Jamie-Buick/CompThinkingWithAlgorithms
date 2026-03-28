package ie.atu.sw;

public class Runner {

	public static String reverse(String forwards) {
		
		if(forwards.length() == 1) {
			return forwards;
		}
		
		int cutOffIndex = forwards.length()-1;
		
		String end = forwards.substring(cutOffIndex);
		return end + reverse(forwards.substring(0,cutOffIndex));
	}
	
	
	
	
	public static boolean findElement1(int[] arr, int target, int index){
		if (index > arr.length-1) {
			return false;
		}
		
		if (arr[index] == target) {
			//System.out.println("got it ");
			return true;
		}
		
	
		return findElement1(arr, target, index+1);
					
	}
	
	static int sum(int[] nums){
	    return sum(nums, 0);
	}
	
	static int sum(int[] nums, int index){
		
		if (index == nums.length) {
			return 0;
		}
		
		return nums[index] + sum(nums, index + 1) ;
	    // do this
	}
	
	public static boolean isPalindrome(String str)	{	
		if(str.length() <=1) {
			return true;
		}
		
		return (str.charAt(0) == str.charAt(str.length()-1) && isPalindrome(str.substring(1,str.length()-1)));
		
		
		
	}
	
	
	public static int countSubstring(String str, String sub){
		
	    if (str.length() < sub.length()) {
	        return 0;
	    }

	    if (str.startsWith(sub)) {
	        return 1 + countSubstring(str.substring(1), sub);
	    } else {
	        return countSubstring(str.substring(1), sub);
	    }
	}
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(reverse("dominic"));
		//System.out.println(findElement1(new int[]{0,3,4,2,8,1,9}, 12, 0));
		//System.out.println(sum(new int[]{-2,2,-3,3}));
		//System.out.println(isPalindrome("racecar"));
		System.out.println(countSubstring("and herself", "he"));
		
	}
}
