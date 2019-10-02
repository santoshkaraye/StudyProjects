package main.java.designPattern.creationalPattern.singleTone;

public class EagerClass {

	private static final EagerClass instance= new EagerClass();
	
	private EagerClass()
	{
		
	}
	
	
	public static EagerClass getInstance()
	{
		return instance;
	}
}
