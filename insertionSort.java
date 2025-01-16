package array;

import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		
		
		int a[]= {22,44,55,11,33,66};
		
		
		for (int i = 1; i < a.length; i++) 
		{
			
			int temp=a[i];
			int j = i-1;
			
			for( ; j >= 0;j--) 
			{
				if(a[j]>temp)
				{
					a[j+1]=a[j];
				}
				else
					break;
			
			}
			a[j+1]=temp;
			
		}
		
		System.out.println(Arrays.toString(a));                                
		
	}
}
