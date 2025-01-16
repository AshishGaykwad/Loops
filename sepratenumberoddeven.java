package array;

import java.util.Arrays;

public class sepratenumberoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {11,22,33,44,88,22};
		
		int evencnt=0;
		int oddcnt=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				evencnt++;
			else
				oddcnt++;
		}
		
		int evenarr[]=new int[evencnt];
		int oddarr[]=new int[oddcnt];
		
		int evenindex=0;
		int oddindex=0;
		
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				evenarr[evenindex]=a[i];
				evenindex++;
			}
			else
			{
				oddarr[oddindex]=a[i];
				oddindex++;
			}
		}
		for (int i = 0; i < evenarr.length; i++) 
		{
			System.out.println(evenarr[i]);
		}
		System.out.println(Arrays.toString(oddarr));
	}

}
