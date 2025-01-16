package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.Arrays;

public class finduniquepair {

	
		public static void main(String[] args) throws BEx 
		{
			//excep.3
			try
	        {
	            System.out.println("Before A");
	            methodA(false);
	            System.out.println("Before n");
	            methodB(true);
	            System.out.println("Before C");
	            methodC(false);
	        }
	        catch(AEx ax)
	        {
	            System.out.println("Exception A Occured");
	        }
		}

		 public static void methodA(boolean value) throws AEx
		    {
		        if(value) throw new AEx();
		    }

		    public static void methodB(boolean value) throws AEx
		    {
		        if(value) throw new BEx();
		    }

		    public static void methodC(boolean value) throws AEx
		    {
		        if(value) throw new CEx();
		    }
		
	}
	class AEx extends Exception
	{
	}

	class BEx extends AEx
	{
	}

	class CEx extends BEx
	{
	}

	