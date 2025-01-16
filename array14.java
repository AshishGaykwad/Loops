package array;

import java.util.Arrays;

public class array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {33,22,44,66,11,55};
		
		int even=0;
		int odd=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		
		int []b=new int[even];
		int []c=new int[odd];
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		
	}

}
