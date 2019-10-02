package main.java.designPattern.creationalPattern.singleTone;

public class StaticClass {
	
	
	
	private static StaticClass instance;
	
	 static{
	        try{
	            instance = new StaticClass();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }

	 	}
	 
	 public static StaticClass getInstance()
		{
			return instance;
		}
}
