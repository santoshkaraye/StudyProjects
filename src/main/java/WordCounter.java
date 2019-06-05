package main.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCounter {

	
	public static void main(String args[])
	{
		FileReader file = null;
		try {
			 file = new FileReader("C:\\Temp\\WrapperLog.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(file != null)
		{
			Scanner sc= new Scanner(file);
			int wordCount=0;
			
			while(sc.hasNextLine())
			{
				wordCount= wordCount+ sc.nextLine().split(" ").length;
			}
			
			System.out.println("Word Count:" +wordCount);
		}
	}
	
}
