
public class TestAccount {
	public static void main(String[]arg){ 
		Account myAccount = new Account (1122,20000);
		
		myAccount.setAnnualInterestRate(0.045);	
		
	      try
	      {
	         System.out.println("Withdraw $2500");
	         myAccount.withdraw(2500);
	         
	         System.out.println("Withdraw $20000");
	         myAccount.withdraw(20000);
	         
	         /** test the case amount of withdraw > balance*/
	         System.out.println("Withdraw $23000");
	         myAccount.withdraw(23000);
	         
	      }
	      
	      catch(InsufficientFundsException ex)
	      {
	         System.out.println("Sorry, but you do not have enough balance!");
	      }
	
	      
	    myAccount.deposit(3000.00);
		
		System.out.println("Balance: $" +  myAccount.getBalance());
		
		System.out.println("Monthly intereste: $" + myAccount.getMonthlyInterestRate()*myAccount.getBalance());
		
		System.out.println("Account was created on:" + myAccount.dateCreated());

	}
}