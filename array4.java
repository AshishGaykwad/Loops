package array;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {10,20,30,40,50};
		int sum=0;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
			cnt++;
		}
		System.out.println(sum);
		int avg=sum/cnt;
		System.out.println(avg);
	}

}
