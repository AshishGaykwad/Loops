package array;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a[]= {10,20,30,40,50,60};

int data=30;
int cnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==data)
			{
				cnt++;
			}
			

}
		if(cnt==0)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
		
	}

}


