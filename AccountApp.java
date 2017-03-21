import java.util.Scanner;
	
public class AccountApp {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		//display a welcome message
		displayLine();
		//a.displayLine("Welcome to the Account Calculator");
		displayLine("Starting Balance");
		//Display checking account balance of $1,000.00
		double amount =0;
		CheckingAccount account = new CheckingAccount();
		account.setBalance(1000);
		displayLine("Checking: " + account.getBalanceFormatted());
		displayLine("Enter the transactions for the month");
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
		String wD = getString("Withdrawal or deposit? (w/d): ");
			//Transactions t = new Transactions();
			if(wD.equalsIgnoreCase("w")){
				amount = getInt("Amount: ");				
				Transactions.withdraw(account, amount);
				//displayLine(account.getBalanceFormatted());
			}else if(wD.equalsIgnoreCase("d")){
				amount = getInt("Amount: ");				
				Transactions.deposit(account, amount);
				//displayLine(account.getBalanceFormatted());
			}
			choice = getString("Continue?(y/n): ");	
		}//end of while loop
		displayLine("Monthly Fees");
		account.setMonthlyFee(1);
		displayLine("Checking fee:  " + account.getMonthlyFeeFormatted());
		//account.getBalance();
		//checking.subtractMonthlyFee();
		account.subtractMonthlyFee();
		displayLine("Final Balance\nChecking:  " + account.getBalanceFormatted());
		
		sc.close();
	}
	





    public static void displayLine() {
        System.out.println("Welcome to the Account Calculator");
    }

    public static void displayLine(String s) {
        System.out.println(s);
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }

    public static int getInt(String prompt) {
        int i = 0;
        while (true) {
            System.out.print(prompt);
            try {
                i = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid integer. Try again.");
            }
        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        while (true) {
            System.out.print(prompt);
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid decimal. Try again.");
            }
        }
        return d;
    }
}
