package array;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iterationCnt=0;
		int a[]= {33,11,55,66,44,22};
		
		for (int i = 0; i < a.length; i++) 
		{
			iterationCnt++;
			int isswappingDone=0;
			for (int j = 0; j < a.length-1-i; j++) 
			{
				iterationCnt++;
				if(a[j]<a[j+1])
					continue;
				else
				{
					isswappingDone++;
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			if(isswappingDone==0)
				break;
		}
		System.out.println(iterationCnt);
		System.out.println(Arrays.toString(a));
		
		
		
//		int a[]= {33,11,55,66,44,22};
//		for (int i = 0; i < a.length; i++)
//		{
//			for (int j = 0; j < i; j++)
//			{
//				if(a[i]>a[j])
//				{
//					continue;
//				}
//				else
//				{
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		for (int i = 0; i < a.length; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
	}

}










































