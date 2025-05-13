package Oops;
class Account {
	private double balance;
	public double getBalance(double balance){
		boolean result = validate("sachin", "tendulkar");
		if (result) {
			this.balance = this.balance - balance;
			return balance;
		} else {
			System.out.println("Invalid username/password. Try again...");
			return 0.0;
		}
	}
	public void setBalance(double balance){
		boolean result = validate("sachin", "sachin123");
		if (result) {
			this.balance = this.balance + balance;
			System.out.println("Credited to the account");
		} else {
			System.out.println("Invalid username/password. Try again...");
		}
	}
	private boolean validate(String userName, String password) {
		return userName.equalsIgnoreCase("sachin") && password.equals("sachin123");
	}
}
public class TestApp {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setBalance(1000.0);
		double balance = acc.getBalance(500.0);
		System.out.println("Withdrawing :: " + balance + " Amount");
	}
}



