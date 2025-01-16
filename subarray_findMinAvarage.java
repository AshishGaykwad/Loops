package array;

public class subarray_findMinAvarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,7,90,20,5,50,40};
		int sizeOfSubarray=3;
		
		int min=Integer.MAX_VALUE;
		int startIndex=-1;
		
		for (int i = 0; i < a.length-sizeOfSubarray; i++) 
		{
			int sum=0;
					for (int k = 0; k <= sizeOfSubarray-1; k++) 
					{
						sum=sum+a[k];
					}
					int avg=sum/sizeOfSubarray;
					if(avg<min)
					{
						min=avg;
						startIndex=i;
					}
		}
		System.out.println(min+" "+startIndex);
		
	}

}


























