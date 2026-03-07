package ie.atu.sw;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	
	public static int[] GreaterThan1000(int[] inputArr) {
		
		int res[] = new int[inputArr.length];
		int resIndex = 0;
		
		for(int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] > 1000) {
				res[resIndex] = inputArr[i];
				resIndex++;
			}
		}
		
		return res;
	}
	
	
	public static List<Integer> Filter(int[] inputArr) {
		List<Integer> list = new ArrayList<>();
		
		for (int num : inputArr){
			if (num > 1000) {
				list.add(num);
			}
		}
		
		return list;
	
	}
	
	
	public static void main(String[] args) {
		int res[] = GreaterThan1000(new int[] {1,2000,3000, 5000, 8000, 1201,100});
		List<Integer> resFilter = Filter(new int[] {1,2000,3000, 5000, 8000, 1201,100});
		
		System.out.println("Standard array");
		for (int a = 0; a < res.length; a++) {
			System.out.println(res[a]);
		}
		
		System.out.println("List");
		System.out.println(resFilter.toString());
		
	}
}
