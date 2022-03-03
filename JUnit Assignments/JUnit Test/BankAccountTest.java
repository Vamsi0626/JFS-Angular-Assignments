import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class BankAccountTest {

	@Test
	void test() {
		BankAccount acc = new BankAccount();
		
		assertThrows(InsufficientFundsExpcetion.class, () -> acc.withdraw(100));
	}

}
