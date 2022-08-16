package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

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

	@Nested
	class range{	
		@ParameterizedTest
		@ValueSource(doubles = {0.0, 10.5})
		void testContains(double t) {
			Range range = new Range(0.0, 10.5);
			boolean result = range.contains(t);
			assertTrue(result);
			System.out.println(result);
		}
		@ParameterizedTest
		@ValueSource(doubles = {-0.1, 10.6})
		void testContains2(double t) {
			Range range = new Range(0.0, 10.5);
			boolean result = range.contains(t);
			assertFalse(result);
			System.out.println(result);
		}
	}
	
	
	@Nested
	class range2{
		@ParameterizedTest
		@ValueSource(doubles = {-5.1,5.1})
		void testContains(double t) {
			Range range = new Range(-5.1, 5.1);
			boolean result = range.contains(t);
			assertTrue(result);
			System.out.println(result);
		}
		@ParameterizedTest
		@ValueSource(doubles = {-5.2,5.2})
		void testContains2(double t) {
			Range range = new Range(-5.1, 5.1);
			boolean result = range.contains(t);
			assertFalse(result);
			System.out.println(result);
		}
	}
	
}
