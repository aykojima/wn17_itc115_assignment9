import java.text.NumberFormat;

public class CheckingAccount extends Account{
	//By default, the monthly fee for a checking account should be $1.
	//private double amount;
	private double monthlyFee;
	public CheckingAccount(){
		super();
		monthlyFee = 0;
	}
	void subtractMonthlyFee(){
		//setBalance(getBalance() - monthlyFee);	
		amount = amount - monthlyFee;
		
	}
	
	void setMonthlyFee(double monthlyFee){
		this.monthlyFee = monthlyFee;
	}
	
	double getMonthlyFee(){
		return monthlyFee;
	}
	
	String getMonthlyFeeFormatted(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(monthlyFee);
        return priceFormatted;
	}
	
}
