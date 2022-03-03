
public class BankAccount {
	public int withdraw(int n) throws InsufficientFundsExpcetion {
        int Balance = 1000;

        if (Balance > n) {
            throw new InsufficientFundsExpcetion();
        }
		return n;
	}
	

}
