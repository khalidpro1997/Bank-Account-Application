package bankaccountapp;

public interface IBaseRate {
	
	//Write a method that return a base rate.
	default double getBaseRate(){
		return 2.5;
	}

}
