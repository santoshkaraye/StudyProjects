package main.java;

public class InterviewCoreJava {
	
	public static void main(String args[])
	{
		for(int i=100;i>=0;--i)
		{
			System.out.println(+i + " " + (100-i));
			if(i==0)
				i=100;
		}
			
	}

}
