package assignmen5;
		class BankAccount {
		    protected double balance;

		    public BankAccount(double initialBalance) {
		        balance = initialBalance;
		    }

		    public void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		            System.out.println("Deposited: " + amount);
		        } else {
		            System.out.println("Invalid deposit amount.");
		        }
		    }

		    public void withdraw(double amount) {
		        if (amount > 0 && balance >= amount) {
		            balance -= amount;
		            System.out.println("Withdrew: " + amount);
		        } else {
		            System.out.println("Invalid withdraw amount or insufficient balance.");
		        }
		    }

		    public double getBalance() {
		        return balance;
		    }
		}

		class SavingsAccount extends BankAccount {
		    private static final double WITHDRAW_LIMIT = 10000.00;

		    public SavingsAccount(double initialBalance) {
		        super(initialBalance);
		    }

		    @Override
		    public void withdraw(double amount) {
		        if (amount > WITHDRAW_LIMIT) {
		            System.out.println("Withdrawal exceeds the limit of " + WITHDRAW_LIMIT);
		        } else {
		            super.withdraw(amount);
		        }
		    }
		}

		public class bank {
		    public static void main(String[] args) {
		        SavingsAccount sa = new SavingsAccount(15000);
		        sa.deposit(5000);
		        sa.withdraw(12000); // Exceeds limit
		        sa.withdraw(8000);  // Valid withdrawal
		        System.out.println("Final balance: " + sa.getBalance());
		    }
	}

