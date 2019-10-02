package main.java.designPattern.creationalPattern.singleTone;

public class LazyClass {
	
	private static LazyClass instance;
	
	private LazyClass() {}
	
	 public static LazyClass getInstance()
		{
		  if(instance==null)
			  instance = new LazyClass();
		  return instance;
		}
	

}
