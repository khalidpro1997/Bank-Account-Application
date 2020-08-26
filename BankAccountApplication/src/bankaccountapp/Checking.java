package bankaccountapp;

public class Checking extends Account {
	//List properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	//constructor
	public Checking(String name, String sSN, double initDeposit){
		super(name,sSN,initDeposit);
		accountNumber =  "2" + accountNumber;
		System.out.println("ACCOUNT NUMBER:" + this.accountNumber);
		System.out.println("new checking account");
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
		
	}
	

	
	//List any method specific to the checking account
	private void setDebitCard(){
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
		System.out.println("CARD: " + this.debitCardNumber);
		System.out.println("PIN: " + this.debitCardPIN);
	}
	
	public void showInfo(){
		super.showInfo();
		System.out.println("Your Checking Account feature" + 
		"\n Debit Card Number: " + debitCardNumber + 
		"\n Debit Card PIN: " + debitCardPIN);
	}



	

}
