package array;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a=
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
			int[][] b=
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
			
	
			int[][] c=new int[a.length][a[0].length];
			add(a,b,c);
		}
		//EndOfMainMethod
		private static void add(int[][] a, int[][] b, int[][] c) 
		{
			//code here
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;i++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			for(int i=0;i<c.length;i++)
			{
				System.out.println(c[i]+" ");
			}
		}
	

}




//o/p :
//2 4 6 
//8 10 12 
//14 16 18 





