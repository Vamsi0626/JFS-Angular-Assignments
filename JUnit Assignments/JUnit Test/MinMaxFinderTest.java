import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Test
	void test1() {
		
		MinMaxFinder MinMaxFinder = new MinMaxFinder();
		
		
		int[] myArr1 = {3,5,8,7,4};
		int min = MinMaxFinder.min(myArr1);
		int max = MinMaxFinder.max(myArr1);
		int[] expected = {3,8};
		int[] actual = {min,max};
		assertArrayEquals(expected , actual);
	}
	
	@Test
	void test2() {
		
		MinMaxFinder MinMaxFinder = new MinMaxFinder();
		
		
		int[] myArr3 = {12,15,20,16,13};
		int min = MinMaxFinder.min(myArr3);
		int max = MinMaxFinder.max(myArr3);
		int[] expected = {12,20};
		int[] actual = {min,max};
		assertArrayEquals(expected , actual);
	}
	
	
	@Test
	void test3() {
		
		MinMaxFinder MinMaxFinder = new MinMaxFinder();
		
		
		int[] myArr5 = {26,29,30,22,27};
		int min = MinMaxFinder.min(myArr5);
		int max = MinMaxFinder.max(myArr5);
		int[] expected = {22,30};
		int[] actual = {min,max};
		assertArrayEquals(expected , actual);
	}
}
