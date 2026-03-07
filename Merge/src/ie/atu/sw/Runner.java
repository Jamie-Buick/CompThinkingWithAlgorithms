package ie.atu.sw;

public class Runner {

	
	public static String merge(String first, String second) {
		
		StringBuffer sb = new StringBuffer();
		
		for (int x = 0; x < first.length(); x++) {
			if (x < second.length()) {
				sb.append(first.charAt(x));
				sb.append(second.charAt(x));
			}
			else {
				sb.append(first.charAt(x));
			}
			
		}
		
		return sb.toString();
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(merge("dmnc", "oii"));
	}
}
