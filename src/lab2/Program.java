package lab2;

public class Program {

	public static void main(String[] args) {
		Account[] accounts = new Account[3];
		
		accounts[0] = new Account(1, "James", 100.00);
		accounts[1] = new Account(2, "Sarah", 250.00);
		accounts[2] = new Account(3, "Tom", 500.00);
		
		accounts[0].Deposit(50.00);
		accounts[0].Withdraw(20.00);
		
		accounts[0].Deposit(-50.00);
		accounts[0].Withdraw(500.00);
		
		for (Account account : accounts) {
		    System.out.println(account.getDetails());
		}
		
		Account myAccount = new Account (4, "My Account", 100.00);
		
		myAccount.AddInterest();
		System.out.println(myAccount.getDetails());
		
		Account partnerAccount = myAccount;
		partnerAccount.AddInterest();
		
		System.out.println(myAccount.getDetails());
		
		processAccount(myAccount);
		System.out.println(myAccount.getDetails());
		
		int k = 100;
		incInt(k);
		System.out.println(k);
		
	}
	
	static void processAccount(Account acc) {
	    acc.AddInterest();
	}
	
	private static void incInt(int x) {
	    x++;
	}

}
