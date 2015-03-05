import java.util.Date;

class Account {

	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated = new Date();
	
	/** A no-arg constructor that creates a default account.*/
	public Account(){
		}
	
	/** A constructor that creates an account with the specified id and initial balance*/
	public Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	
	/** The getter and setter methods for id, balance, and annualInterestRate.*/
	public int getId(){
		return id;
	}
	
	public void setId(int newId){
		id = newId;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	/** return annualInterestRate*/
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	/** set a new annualInterestRate */
	public void setAnnualInterestRate(double newAnuualInterestRate){
		annualInterestRate = newAnuualInterestRate;
	}
	
	/** The accessor method for dateCreated.*/ 
	public Date dateCreated(){
		return dateCreated;
	}
	
	/** A method named getMonthlyInterestRate() that returns the monthly interest rate.*/
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	/** A method named withdraw that withdraws a specified amount from the account.*/
	  public void withdraw(double amount) throws InsufficientFundsException {
		  	if(amount <= balance)
		  	{
		  		balance -= amount;
		  	}
		  	else
		  	{
		  		double needs = amount - balance;
		  		throw new InsufficientFundsException(needs);
		  	}
	  }
	
	/** A method named deposit that deposits a specified amount to the account.*/
	public void deposit(double amount){
		balance += amount;
	}
	
}
