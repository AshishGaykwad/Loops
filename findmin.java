package array;

public class findmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {33,44,11,55,22,66,11};
		
		int min=a[0];
		int minindex=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min)
			{
				min=a[i];
				minindex=i;
			}
			
			
		}
		System.out.println(min+" ");
		System.out.println(minindex);
		
	}

}

