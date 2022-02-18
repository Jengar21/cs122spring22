package assignments.assignment1;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(7658, 5000);
		Account savings = new Savings( 7659, 2500);
		Account checking = new Checking( 7660, 3000, -50);
		
		account.setAnnualInterestRate(1.2);
		savings.setAnnualInterestRate(1.2);
		checking.setAnnualInterestRate(1.2);
		account.deposit(60);
		savings.deposit(25);
		checking.deposit(73);
		account.withdraw(100);
		savings.withdraw(800);
		checking.withdraw(3000);
		
		
		System.out.println(account.toString() + "\n");
		System.out.println(savings.toString() + "\n");
		System.out.println(checking.toString() + "\n");
		
	}

}
