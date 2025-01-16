package twoDimensionalarray;

public class firstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] arr= {
		
		//print all 2d array
		{10,20},
		{40,50,60,50},
		{70,80,90}
		};
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("print all element from only 1 row");
		
//		for (int i = 0; i < arr[1].length; i++) 
//		{
			System.out.print(arr[2][1]+" ");
		//}
	}

}
