package main.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadLocalExample extends Thread {
	ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
		@Override
		public Integer initialValue()
		{
			return 50;
		}
	};
	
	@Override
	public void run()
	{
		local.set(local.get()+10);
		
		System.out.println("Thread id=====" +Thread.currentThread().getId() + "Local variable-" +local.get());
	}
	
	public static void main(String args[])
	{
		
		ExecutorService exectorService=Executors.newFixedThreadPool(30);
			Future future= null;
		for(int i=0;i<10;i++)
			future=exectorService.submit(new ThreadLocalExample());
		exectorService.shutdown();
		
	}

}
