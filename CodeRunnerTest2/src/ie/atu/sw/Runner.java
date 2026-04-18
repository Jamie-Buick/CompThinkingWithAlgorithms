package ie.atu.sw;

public class Runner {

	
	//Q1
	
	public static String encrypt2(String plainText, int offset){
		
		StringBuilder sb = new StringBuilder("");
		
		
		for (int i = 0; i < plainText.length(); i++) 
		{
				char orig = plainText.charAt(i);
				
				if (orig != ' ') {
					char ch = (char) (plainText.codePointAt(i) + offset);
					
					sb.append(ch);
				}
				
			 
			
				
		}
		
		
		return sb.toString();
		
	}
	

	
	//Q2
	
	public static boolean linearIn(int[] outer, int[] inner) {
		
		int i = 0;
		for (int o = 0; o < outer.length; o++) {
			
				if (outer[o] == inner[i]) {
					i++;
				}
				
				if (i == inner.length) {
					return true;
				}
					
		}
		
			
		return false;
	
	}

	
	
	
	
	//Q3
	public static int[] seriesUp(int n) {
	
		int[] result = new int[n * ( n + 1 ) / 2];
		
		//System.out.println(result.length);
		
		int counter = 0;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j<=i; j++) {
				result[counter++] =  j;
			}
			
			//System.out.println(result[i]);
		}
		
		return result;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(encrypt2("two plus two is four" , 2));
		//System.out.println(linearIn(new int[] {1, 2, 3}, new int[] {-2}));
		
		
		int[] result = seriesUp(4);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		
		//System.out.println(seriesUp(4));
	}
}
