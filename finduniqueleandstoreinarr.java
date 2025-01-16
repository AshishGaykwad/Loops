package array;

import java.util.Arrays;

public class finduniqueleandstoreinarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {33,55,11,33,11,44,55,66};
		int uniqueEleCnt = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			int Cnt = 0;
			for (int j = 0; j < i; j++) 
			{
				if(a[i]==a[j])
					Cnt++;
			}
			if(Cnt==0)
				
			uniqueEleCnt++;
		}
	
		System.out.println(uniqueEleCnt);
		
		int b[]=new int [uniqueEleCnt];
		
		int index = 0;
		
		for (int i = 0; i < a.length; i++) 
		{
			int cnt=0;
			for (int j = 0; j < i; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
			{
				b[index]=a[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}

}
