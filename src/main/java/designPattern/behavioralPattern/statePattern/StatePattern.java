package main.java.designPattern.behavioralPattern.statePattern;

public class StatePattern {
	
	public static void main(String[] args)
    {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");
         
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }

}
