package array;

import java.util.Arrays;

public class rightShifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {11,22,33,44,55};
		
		int temp=a[a.length-1];
		
		for(int i=a.length-2;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	}

}
