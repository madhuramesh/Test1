package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.RunMain;

class RunMainTest {

	RunMain test = new RunMain();
	int arrtoBin[] = {4, 8, 10, 12, 14, 20, 22, 25, 26, 27, 28, 30, 31, 32}; 
	
	@Test
	void testLeftRotation() {
		Assert.assertEquals("humad", test.leftRotation("madhu", 3));
		Assert.assertEquals("madhu", test.leftRotation("madhu", 5));
		Assert.assertEquals("adhum", test.leftRotation("madhu", 1));
		Assert.assertEquals("madhu", test.leftRotation("madhu", 0));
	}
	
	/*@Test
	void testleftRotationTimes() {
		Assert.assertEquals(["adhum", "dhuma", "humad", "umadh", "madhu"],test.leftRotationTimes("madhu", 5));
	}*/
	
	@Test
	void testIsPalindrome() {
		Assert.assertEquals(true, test.isPalindrome("racecar"));
		Assert.assertEquals(true, test.isPalindrome("rotator"));
		Assert.assertEquals(false, test.isPalindrome("rotate"));
		Assert.assertEquals(true, test.isPalindrome("Kayak"));
	}
	
	@Test
	void testCheckPermutation() {
		Assert.assertEquals(true, test.checkPermutation("ausebec","because"));
		Assert.assertEquals(false, test.checkPermutation("auseb","because"));
		Assert.assertEquals(true, test.checkPermutation("causebe","because"));
		
	}

	@Test
	void testIsSubstring() {
		Assert.assertEquals(true, test.isSubstring("bec","because"));
		Assert.assertEquals(false, test.isSubstring("ausebec","because"));
		Assert.assertEquals(true, test.isSubstring("cause","because"));
		
	}

	@Test
	void testBinarySearch() {
		Assert.assertEquals(3, test.binarySearch(arrtoBin, 12));
	}

}
