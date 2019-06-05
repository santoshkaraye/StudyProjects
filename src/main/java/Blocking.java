package main.java;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Blocking {

	
	public static void main(String args[])
	{
		
		BlockingQueue<Connection> queue = new ArrayBlockingQueue<>(20);
		Producer pro= new Producer(queue);
		Consumer consu= new Consumer(queue);
		
		Thread t = new Thread(pro);
		
		t.start();
		
		Thread t1= new Thread(consu);
		
		t1.start();
		
		
	}
	
	
	static class Producer implements Runnable
	{
		BlockingQueue queue;
		
		Producer(BlockingQueue queue)
		{
			this.queue=queue;
		}

		@Override
		public void run() {
			Connection conn;
			for(int i=0;i<10;i++)
			{
				conn= new Connection("oracle","SID","username"+i,"Password"+i);
				queue.add(conn);
			}
			
			
		}
		
	}
	
	
	static class Consumer implements Runnable
	{
		BlockingQueue queue;
		
		Consumer(BlockingQueue queue)
		{
			this.queue=queue;
		}

		@Override
		public void run() {
			
			while(true)
			{
				Connection con = null;
				try {
					con = (Connection)queue.take();
				
				
				if(con!=null)
				{
					System.out.println("Connection------>" +con.getDb()+" "+con.getSid()+" "+con.getUserName()+" "+con.getPassword());
				}
				
				Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
}
