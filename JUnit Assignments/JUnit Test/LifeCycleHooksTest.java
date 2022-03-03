import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycleHooksTest {
	
	@BeforeAll
	static void runOnceBeforeAllTests() {
		System.out.println("Start");
	}
	
	@BeforeEach
	  void runBeforeEveryTest() {
	    System.out.println("a=6, b=3");
	  }

	@Test
	void ADD() {
		LifeCycleHooks ad = new LifeCycleHooks();
		int expected = 9;
		int actual = 9;
		assertEquals(expected, actual);
		
	}
	
	@Test
	void SUB() {
		LifeCycleHooks sb = new LifeCycleHooks();
		int expected = 3;
		int actual = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	void MUL() {
		LifeCycleHooks ml = new LifeCycleHooks();
		int expected = 18;
		int actual = 18;
		assertEquals(expected, actual);
	}
	
	@Test
	void DIV() {
		LifeCycleHooks di = new LifeCycleHooks();
		int expected = 2;
		int actual = 2;
		assertEquals(expected, actual);
	}
	
	 @AfterEach
	  void runAfterEveryTest() {
	    System.out.println("Completed");
	  }
	 
	@AfterAll
	static void runOnceAfterAllTests() {
	    System.out.println("End");
	  }

}
