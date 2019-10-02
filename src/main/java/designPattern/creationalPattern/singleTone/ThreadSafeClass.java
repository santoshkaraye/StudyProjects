package main.java.designPattern.creationalPattern.singleTone;

public class ThreadSafeClass {

private static ThreadSafeClass instance;
	
	private ThreadSafeClass() {}
	
	 public static synchronized ThreadSafeClass getInstance()
		{
		  if(instance==null)
			  instance = new ThreadSafeClass();
		  return instance;
		}
	
	 public static ThreadSafeClass getInstanceByDoubleLocking()
	 {
		 if(instance==null)
		 {
			 synchronized(ThreadSafeClass.class)
			 {
				 instance = new ThreadSafeClass();
			 }
		 }
		 
		 return instance;
	 }
	 
}
