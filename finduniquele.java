package array;

public class finduniquele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {33,55,11,33,11,44,55,66};
		
		for (int i = 0; i < a.length; i++) 
		{
			int cnt = 0;
			for (int j = 0; j < i; j++) 
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
				System.out.println(a[i]);
		}
	}

}
