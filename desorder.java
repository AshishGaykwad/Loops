package array;

import java.util.Arrays;

public class desorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				int a[]= {44,55,22,66,33,11,88,77};
				
				for (int i = 0; i < a.length; i++) 
				{
					
					int minIndex=i;
					
					for (int j = i; j < a.length; j++) 
					{
						if(a[j]>a[minIndex])
						{
							
							minIndex=j;
						}
					}
					int temp=a[i];
					a[i]=a[minIndex];
					a[minIndex]=temp;
				}
				System.out.println(Arrays.toString(a));
			}

	}