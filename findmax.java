package array;

public class findmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {11,44,77,88,55,22,66,};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}

}
