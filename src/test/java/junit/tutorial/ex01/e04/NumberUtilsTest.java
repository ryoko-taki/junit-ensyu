package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsEven1() {
		boolean test1 = NumberUtils.isEven(10);
		assertEquals(true, test1, "Error");
		System.out.println(NumberUtils.isEven(10));
	}
	
	@Test
	void testIsEven2() {
		boolean test2 = NumberUtils.isEven(7);
		assertEquals(false, test2, "Error");
		System.out.println(NumberUtils.isEven(7));
	}

}
