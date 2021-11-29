package junitAssignment;
class InsufficientFundsException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
}

public class JunitAssign3 {
	long balance;
	
	public JunitAssign3(long balance) {
		super();
		this.balance = balance;
	}


	public void withdraw(long amount) {
		if(amount>balance)
			throw new InsufficientFundsException();
		else
			balance-=amount;
	}
}
