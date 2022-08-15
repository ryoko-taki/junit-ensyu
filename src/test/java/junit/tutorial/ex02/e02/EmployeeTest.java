package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
	void test() {
		try {
			InputStream in = new FileInputStream("/Users/ryokotaki/springworkspace/junit-ensyu/src/main/java/junit/tutorial/ex02/e02/Employee.txt");
			List<Employee> list = Employee.load(in);
			assertEquals("Ichiro", list.get(0).getFirstName(), "Error");
			System.out.println(list.get(0).getFirstName());
			
			assertEquals("Tanaka", list.get(0).getLastName(), "Error");
			System.out.println(list.get(0).getLastName());
			
			assertEquals("ichiro@example.com", list.get(0).getEmail(), "Error");
			System.out.println(list.get(0).getEmail());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
