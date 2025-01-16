package array;

import java.util.Arrays;

public class array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {10,20,30,40,50,60};
		
		int b[]=new int [a.length];
		
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
		System.out.println(Arrays.toString(b));
		
		
		
		
	}

}
