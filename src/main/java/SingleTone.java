package main.java;

public class SingleTone {
	
	public int a;
	public int b;
	public static SingleTone single;
	
	private SingleTone()
	{
		
	}
	
	public static synchronized SingleTone getInstance()
	{
			
		return LazyHolder.INSTANCE;
	}
	
	private static class LazyHolder {
        static final SingleTone INSTANCE = new SingleTone();
    }

}
