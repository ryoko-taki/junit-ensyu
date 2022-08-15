package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

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

	FizzBuzz fb = new FizzBuzz();
	@Test
	void testCreateFizzBuzzList() {
		List<String> expected = fb.createFizzBuzzList(16);
		List<String> actual = fb.createFizzBuzzList(16);
		assertIterableEquals(expected, actual);
		System.out.println(fb.createFizzBuzzList(16));
	}

}
