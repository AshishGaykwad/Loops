package twoDimensionalarray;

public class findMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr= {
				
				//print all 2d array
				{10,20,90},
				{40,50,60},
				{70,30,80}
		};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]>max)
					max=arr[i][j];
			}
		}
		System.out.println(max);

		
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]<min)
					min=arr[i][j];
			}
		}
		
		
		System.out.println(min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int max = arr[0][0];
//		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			for (int j = 0; j < arr[i].length; j++)
//			{
//				if(arr[i][j]>max)
//					max=arr[i][j];
//			}
//		}
//		System.out.println(max);
//		
//		
//		int min = arr[0][0];
//		
//		for (int i = 0; i < arr.length; i++)
//		{
//			for (int j = 0; j < arr[i].length; j++)
//			{
//				if(arr[i][j]<min)
//					min=arr[i][j];
//			}
//		}
//		System.out.println(min);
	}
	

}
