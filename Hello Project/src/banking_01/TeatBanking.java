package banking_01;

public class TeatBanking {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Account account=new Account(5000);
		account.PrintMoney();
		account.WIthDaw(100.25);
		account.PrintMoney();
		account.Desposit(10000);
		account.PrintMoney();
		
	}

}
