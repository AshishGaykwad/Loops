package array;

//import java.util.Arrays;

public class array9 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		int [] a= {1,0,1,0,1,0,1,0,1,0};
		
//		int cnt=0;
//		
//		for (int i = 0; i < a.length; i++) 
//		{
//			if (a[i]==1||cnt>=2)
//				continue;
//			else
//			{
//				a[i]=1;
//			cnt++;
//			}
//		}
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.print(a[i] +" ");
//		}
		
		int cnt=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==1||cnt>=2)
			{
				continue;
			}
			else
			{
				a[i]=1;
				cnt++;
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	

}
