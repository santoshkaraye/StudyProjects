package main.java.designPattern.structuralPattern.adapterPattern;

public interface CreditCardInterface {

	public void setBankDtails(String accountNumber, String customerNumber, String customerName);
	
	public String getCreditCard();
}
