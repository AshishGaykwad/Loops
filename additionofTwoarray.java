package twoDimensionalarray;

public class additionofTwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int b[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int c[][]=new int [3][3];
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				 c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[i].length; j++) 
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[][] c = new int [3][3];
//		
//		for (int i = 0; i < a.length; i++)
//		{
//			for (int j = 0; j < a[i].length; j++)
//			{
//				c[i][j]=a[i][j]+b[i][j];
//			}
//		}
//		
//		for (int i = 0; i < a.length; i++)
//		{
//			for (int j = 0; j < c[i].length; j++)
//			{
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
