import java.text.NumberFormat;

public class Account implements Depositable, Withdrawable, Balance{
	
	protected double amount;
	
	public Account (){
		
	}
	public Account(double amount){
		this.amount = amount;
	}	
	//implement Depositable interface
	public void deposit(double amount){
		setBalance(getBalance() + amount);
	}
	//implement Withdrawable interface
	public void withdraw(double amount){
		setBalance(getBalance() - amount);
	}
	//implement Balance interface
	public double getBalance(){
		return amount;
	}
	public void setBalance(double amount){
		this.amount = amount;
	}
	public String getBalanceFormatted(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(amount);
        return priceFormatted;
	}
	
}
