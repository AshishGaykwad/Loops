package array;

import java.util.*;
import java.util.Arrays;
//import java.util.Iterator;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[]= {1,2,3,4,5,6,7,8};
//		
//		
//		int evenCnt=0;
//		int oddCnt=0;
//		
//		for (int i = 0; i < a.length; i++) 
//		{
//			if(a[i]%2==0)
//				evenCnt++;
//			else
//				oddCnt++;
//		}
//		
//		
//		
////		System.out.println(evenCnt);
////		System.out.println(oddCnt);
//		
//		int evenArray[]=new int [evenCnt];
//		int oddArray[]=new int [oddCnt];
//		
//		
//		
//		int evenIndex=0;
//		int oddIndex=0;
//		
//		for (int i = 0; i < a.length; i++)
//		{
//			
//			if(a[i]%2==0)
//			{
//				evenArray[evenIndex]=a[i];
//				//evenIndex++;
//			}
//			else
//			{
//				oddArray[oddIndex]=a[i];
//				//oddIndex++;
//			}
//		}
//		System.out.println(Arrays.toString(evenArray));
//		System.out.println(Arrays.toString(oddArray));
		
//		int []a= {50,40,20,90,80,10,30};
//		
//		for (int i = 0; i < a.length; i++) 
//		{
//			for (int j = 0; j < a.length-1; j++)
//			{
//				if(a[j]<a[j+1])
//					continue;
//				else
//				{
//					 int temp = a[j];
//					 a[j]=a[j+1];
//					 a[j+1]=temp;
//					
//				}
//			}
//		}
//		for (int i = 0; i < a.length; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//	}
//}
//		}
//		System.out.println(Arrays.toString(a));
		
//		Take 10 integer inputs from user and store them in an array and print them on screen.
//		Scanner sc= new Scanner(System.in);
//		
//		int arr[] =new int[10];
//		
//		System.out.println("enter ten element in array");
//		
//		for (int i = 0; i < arr.length; i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		
//		for (int i = 0; i < arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		
//		Take 10 integer inputs from user and store them in an array. Again ask user to give a 
//		number. Now, tell user whether that number is present in array or not.
//		
//		int []a=new int[10];
//		Scanner sc =  new Scanner(System.in);
//		int cnt=0;
//		System.out.println("enter 10 integer");
//		for (int i = 0; i < a.length; i++) {
//			
//			a[i]=sc.nextInt();
//		}
//		
//		System.out.println("now enter the number which you want to found that is present or not in array");
//		
//		int data = sc.nextInt();
//		
//		for (int i = 0; i < a.length; i++)
//		{
//			
//			
//			if(a[i]==data)
//			cnt++;
//		
//		}
//		if(cnt!=0)
//		{
//			System.out.println("this element present in array");
//		}
//		else
//		{
//			System.out.println("this element not present in array");
//		}
		
//		Take 20 integer inputs from user and print the following:
//			number of positive numbers
//			number of negative numbers
//			number of odd numbers
//			number of even numbers
//			number of 0s.
		
//		int b[]=new int[20];
//		int positive = 0;
//		int negative = 0;
//		int odd = 0;
//		int even = 0;
//		int zeros = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter 20 element for find positive, negative, odd, even and 0s");
//		
//		for (int i = 0; i < b.length; i++)
//		{
//			b[i]=sc.nextInt();
//			
//		}
//		for (int i = 0; i < b.length; i++) 
//		{
//			if(b[i]>=0)
//					{
//				positive++;
//					}
//			if(b[i]<=0)
//			{
//				negative++;
//			}
//			if(b[i]%2==0)
//			{
//				even++;
//			}
//			if(b[i]%2!=0)
//			{
//				odd++;
//			}
//			
//			if(b[i]==0)
//			{
//				zeros++;
//			}
//		}
//		System.out.println(positive);
//		System.out.println(negative);
//		System.out.println(even);
//		System.out.println(odd);
//		System.out.println(zeros);
		
//		Take 10 integer inputs from user and store them in an array.
//		Now, copy all the elements in an another array but in reverse order.
		
//		int a[]=new int[5];
//		int b[]=new int[5];
//		
//		System.out.println("enter ten element in array for store in another array");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < a.length; i++)
//		{
//			 a[i]=sc.nextInt();
//			
//		}
//		int j=0;
//		for (int i = b.length-1; i > 0; i--)
//		{
//			b[i]=a[j];
//			j++;
//		}
//		for (int i = 0; i < b.length; i++)
//		{
//			System.out.print(b[i]+" ");
//		}
		
//		char [] s1= {'a','b','c','d'};
//		char [] s2= {'w','x','y','z','e','f','g'};
//		
//		char [] s3= new char [s1.length+s2.length];
//		
//		int index = 0;
//		
//		for (int i = 0; i < Math.max(s1.length,s2.length); i++)
//		{
//			if(i<s1.length)
//			{
//				s3[index]=s1[i];
//				index++;
//			}
//			if(i<s2.length)
//			{
//				s3[index]=s2[i];
//				index++;
//			}
//		}
//		
//		for (int i = 0; i < s3.length; i++)
//		{
//			System.out.print(s3[i]+" ");
//		}
//		}
//	}
		
		
		int []a= {50,40,20,90,80,10,30};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			
			System.out.println(a[i]);
		}
	}
}
	
























