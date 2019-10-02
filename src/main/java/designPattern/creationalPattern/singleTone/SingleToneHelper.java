package main.java.designPattern.creationalPattern.singleTone;


public class SingleToneHelper {
	

	
	private SingleToneHelper()
	{
		
	}
	
	public static SingleToneHelper getInstance()
	{
			
		return LazyHolder.INSTANCE;
	}
	
	private static class LazyHolder {
        static final SingleToneHelper INSTANCE = new SingleToneHelper();
    }

}

