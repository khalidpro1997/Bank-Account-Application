package bankaccountapp;

public class Savings extends Account {

	
	//List properties to the saving accounts
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	//Constructor to initialize settings for the savings properties
	public Savings(String name, String sSN, double initDeposit){
		super(name,sSN,initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.println("ACCOUNT NUMBER:" + this.accountNumber);
		System.out.println("New SAVINGS ACCOUNT");
		setSafetyDepositBox();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	

	
	private void setSafetyDepositBox(){
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	
	
	//List any method specifics to savings account
	public void showInfo(){
		super.showInfo();
		System.out.println(
				"Your Saving Account Features" +
				"\n Safety Deposit Box ID" + safetyDepositBoxID +
				"\n Safety Deposit Box Key" + safetyDepositBoxKey
				);
	}
}
