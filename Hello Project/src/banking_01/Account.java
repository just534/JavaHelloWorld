package banking_01;

public class Account {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(double init_balance) {
		this.balance = init_balance;
	}
	/**
	 * 存钱的方法
	 * @param amt 要存的金额
	 */
	public void Desposit(double amt) {
		if(amt >0) {
			this.balance+=amt;
		}else {
			System.out.println("存钱金额必须大于零");
		}
	}
	
	public void WIthDaw(double money) {
		if(this.balance-1>money) {
			this.balance-=money;
		}else {
			System.out.println("取钱金额必须小于余额");
		}
	}
	
	public void PrintMoney() {
		System.out.println("余额是:"+this.balance);
	}

}
