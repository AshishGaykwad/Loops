package array;

public class array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,1,1,0,0,0,0}; 
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1)
			{
				continue;
			}
			else
				a[i]=1;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		}
		
	}


