package main.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("Thread id=====" +Thread.currentThread().getId());
	}
	
	public static void main(String args[])
	{
		
	ExecutorService exectorService=Executors.newFixedThreadPool(30);
	
	Future future= null;
	for(int i=0;i<10;i++)
		future=exectorService.submit(new ExecutorExample());
	
	exectorService.shutdown();
	
	
	}

}
