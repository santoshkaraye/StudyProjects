package main.java.designPattern.structuralPattern.adapterPattern;

public class AdapterDemo {

	public static void main(String[] args) {
		
		CreditCardInterface card = new BankCustomerAdapter();
		
		card.setBankDtails("0000000", "11111111", "Santosh");
		
		System.out.println("Your Credit card is==" +card.getCreditCard());
	}

}
