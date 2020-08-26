package bankaccountapp;

public abstract class Account implements IBaseRate {
	
	//List common properties for savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	
	static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	//constructor to set base properties and to initialize the account
	public Account(String name,String sSN,double initDeposit){
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		System.out.println("NAME: " + name + " SSN:" + sSN + " Balance:" + balance);
		
		//setAccount number
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println(getBaseRate());
		
		setRate();
	}
	
	public abstract void setRate();
	
	
	
	private String setAccountNumber(){
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2 , sSN.length());
		int uniqueID = index;
		int RandomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + RandomNumber;
	}
	
	public void compound(){
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
	
	
	//List common methods (Transactions)
	public void deposit(double amount){
		balance = balance * amount;
		System.out.println("Depositing: RM" + amount);
		printBalance();
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
		System.out.println("Withdrawing RM" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere,double amount){
		balance = balance - amount;
		System.out.println("Transfering RM " + amount + " to " + toWhere);
		printBalance();
		
	}
	
	public void printBalance(){
		System.out.println("Your Balance is now: RM" + balance);
	}
	
	
	public void showInfo(){
		System.out.println(
				"NAME: " + name +
				"\nAccount Number: " + accountNumber +
				"'\nBALANCE: " + balance + 
				"\nRATE: " + rate + "%");
	}

}
