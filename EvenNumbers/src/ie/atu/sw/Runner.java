package ie.atu.sw;

public class Runner {

	
	public static int[] onlyEvens(int[] arr){
		
		int res[] = new int[arr.length/2];
		int resIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 == 0 ) {
				res[resIndex] = arr[i];
				resIndex++;
			}
		}
		
		return res;
	    
	}
	
	
	public static void main(String[] args) {
		int[] res = onlyEvens(new int[] {1,2,3,4,5,6});
		//System.out.println("hello");
		for (int a = 0; a < res.length; a++) {
			System.out.println(res[a]);
		}
	}
	
	
}
