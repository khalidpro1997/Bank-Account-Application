package bankaccountapp;

import java.util.LinkedList;
import java.util.List;



public class BankAccountApp {
	public static void main(String[] args) {
		
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\NewBankAccount.csv";
		
/*		Checking chkacc1 = new Checking("Danish Khalid","123456789", 1500);
		
		Savings savAcc1 = new Savings ("Ali Baba","123123123",2500);
		
		
		
		savAcc1.showInfo();
		
		System.out.println("**********************************");
		
		chkacc1.showInfo(); */
		
		
		
		//Read a CSV File then create new accounts based on that data.
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder){
		System.out.println("NEW ACCOUNT");
		String name = accountHolder[0];
		String sSN = accountHolder[1];
		String accountType = accountHolder[2];
		double initDeposit = Double.parseDouble(accountHolder[3]);
		System.out.println(name + " " + sSN + " " + accountType + "RM" + initDeposit);
		if(accountType.equals("Savings")){
			System.out.println("OPEN A SAVING ACCOUNT");
			accounts.add(new Savings(name, sSN, initDeposit));
		}
		else if (accountType.equals("Checking")){
			System.out.println("OPEN A CHECKING ACCOUNT");
			accounts.add(new Checking(name, sSN, initDeposit));
		}
		else {
			System.out.println("ERROR READING ACCOUNT TYPE");
		}
		}
	
		for (Account acc: accounts){
			System.out.println("\n*******************************");
			acc.showInfo();
			//acc
			//
		}
	
	}

}
