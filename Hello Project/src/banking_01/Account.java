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
	 * ��Ǯ�ķ���
	 * @param amt Ҫ��Ľ��
	 */
	public void Desposit(double amt) {
		if(amt >0) {
			this.balance+=amt;
		}else {
			System.out.println("��Ǯ�����������");
		}
	}
	
	public void WIthDaw(double money) {
		if(this.balance-1>money) {
			this.balance-=money;
		}else {
			System.out.println("ȡǮ������С�����");
		}
	}
	
	public void PrintMoney() {
		System.out.println("�����:"+this.balance);
	}

}
