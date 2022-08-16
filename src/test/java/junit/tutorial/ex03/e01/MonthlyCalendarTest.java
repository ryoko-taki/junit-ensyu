package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

class MonthlyCalendarTest {

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
	void testGetRemainingDays() {
		MonthlyCalendar calender = new MonthlyCalendar(LocalDate.of(2012, 1, 31));
		assertEquals(0,calender.getRemainingDays());
		System.out.println(calender.getRemainingDays());
		
		MonthlyCalendar calender2 = new MonthlyCalendar(LocalDate.of(2012, 1, 30));
		assertEquals(1,calender2.getRemainingDays());
		System.out.println(calender2.getRemainingDays());
		
		MonthlyCalendar calender3 = new MonthlyCalendar(LocalDate.of(2012, 2, 1));
		assertEquals(28,calender3.getRemainingDays());
		System.out.println(calender3.getRemainingDays());
	}

}
