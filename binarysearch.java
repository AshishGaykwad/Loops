package array;

public class binarysearch {

	public static void main(String[] args) {
		

		
		int []a = {11,22,33,44,55};
		
		int start=0;
		int end=a.length-1;
		int data=44;
		int cnt=0;
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(a[mid]==data)
			{
				cnt++;
				System.out.println(mid);
				break;
			}
			
			if(data>a[mid])
				start=mid+1;
			else
				end=mid-1;
		}
		
		if(cnt==0)
		{
			System.out.println("not found");
		}
		
	}

}
