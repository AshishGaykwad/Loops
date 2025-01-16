package array;

import java.util.Arrays;

public class seprateevenelentandoddele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {11,22,33,44,88,22};
		//int [] b=new int[a.length];
		
		int evenCnt=0;
		int oddCnt=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0)
				evenCnt++;
			else
				oddCnt++;
		}
		
		int []evenArr=new int[evenCnt];
		int []oddArr=new int[oddCnt];
		
//		System.out.println(Arrays.toString(evenArr));
//		System.out.println(Arrays.toString(oddArr));
		
		int evenIndex=0;
		int oddIndex=0;
		
		for (int i = 0; i <a.length; i++) 
		{
			if(a[i]%2==0)
			{
				evenArr[evenIndex]=a[i];
				evenIndex++;
			}
			else
			{
				oddArr[oddIndex]=a[i];
				oddIndex++;
			}
		}
		for (int i = 0; i < evenArr.length; i++) 
		{
			System.out.print(evenArr[i]+" ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(oddArr));
	}
	

}
