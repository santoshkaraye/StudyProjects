package main.java.designPattern.creationalPattern.factoryPattern;

public class Factory {
	
	public CommonInterface getObject(String type)
	{
		if(type.equals("A"))
			return new A();
		
		if(type.equals("B"))
			return new B();
		
		if(type.equals("C"))
			return new C();
		
		return null;
	}
	
	public static void main(String args[])
	{
		Factory factory = new Factory();
		
		CommonInterface common = factory.getObject(args[0]);
		
		System.out.println("Class object===" +common.getClassName());
		
		
	}

}
