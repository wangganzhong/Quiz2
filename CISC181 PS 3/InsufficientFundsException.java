public class InsufficientFundsException extends Exception{
	private double amount;
	
	/** Construct an exception */
	public InsufficientFundsException(double amount){
		
		this.amount = amount;
	}
	
	/** Return the amount */
	public double getAmount(){
		return amount;
	}
}