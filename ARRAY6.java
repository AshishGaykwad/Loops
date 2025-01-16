package array;

public class ARRAY6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a= {10,20,30,40};
		int [] b= {10,20,30,45};
		
//		if(a.length==b.length)
//		{	
//		int cnt=0;
//		
//		for (int i = 0; i < a.length; i++) 
//			
//			{
//			if(a[i]==b[i])
//				cnt++;
//			}
//		if(cnt==a.length)
//			System.out.println("array equal");
//		else
//			System.out.println("array not equal");
//		}
//		else 
//		{
//			System.out.println("array not equal");
//		}
		
		
		if(a.length==b.length)
		{
			int cnt=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
					cnt++;
			}
			if(cnt==a.length)
			{
				System.out.println("array euqual");
			}
			else
			{
				System.out.println("Array not equal");
			}
		}
		else
		{
			System.out.println("array not equal");
		}
	}

}
