package main.java.designPattern.creationalPattern.singleTone;

import java.io.Serializable;

public class SerializableClass implements Serializable {

	private static SerializableClass instance;
	
	private SerializableClass()
	{
		
	}
	
	 public static SerializableClass getInstance()
		{
		  if(instance==null)
			  instance = new SerializableClass();
		  return instance;
		}
	 
	 protected Object readResolve() {
		    return getInstance();
		}
}
