package main.java.designPattern.structuralPattern.adapterPattern;

public class BankCustomerAdapter extends BankDetails implements CreditCardInterface {

	@Override
	public void setBankDtails(String accountNumber, String customerNumber, String customerName) {
		
		setAccountNumber(accountNumber);
		setCustomerName(customerName);
		setCustomerNumber(customerNumber);
		
	}

	@Override
	public String getCreditCard() {
		
		return (getAccountNumber()+"-"+getCustomerName()+"-"+getCustomerName()+"-12345");
		
	}

}
