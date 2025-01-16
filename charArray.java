
package array;

import java.util.Arrays;

public class charArray {

	public static void main(String[] args) {
		

		
		char [] s1= {'a','b','c','d'};
		char [] s2= {'w','x','y','z','e','f','g'};
		
		char [] s3= new char [s1.length+s2.length];
		
		int index=0;
		
		for (int i = 0; i < s3.length; i++) 
		{
			if(i<s1.length)
			{
				s3[index]=s1[i];
				index++;
				
			}
			if(i<s2.length)
			{
				s3[index]=s2[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(s3));
	}

}




