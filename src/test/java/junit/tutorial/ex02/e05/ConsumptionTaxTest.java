package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {

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

	@ParameterizedTest
	//"税率、入力値、期待値"
	@CsvSource({"5,100,105",   "5,3000,3150",   "10,50,55",   "5,50,52",   "3,50,51"})
	void testApply(int rate, int input, int actual) {
		ConsumptionTax consumptionTax = new ConsumptionTax(rate);
		int result = consumptionTax.apply(input);
		assertEquals(actual, result);
	}

}
