package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.EmployeeService;

public class EmployeeServiceTest {
	
	//EmployeeService es = new Employeeservice();
	static EmployeeService es; // when class load that time only memory created
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this method is called only once before Test");
		es = new EmployeeService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		es = null; //destroys memory
		System.out.println("this method is called only once after Test");
		
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this method is called every time before each Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this method is called everytime after each Test");
	}

	
	@Test
	public void testCalSalary() {
		//fail("Not yet implemented");
		//EmployeeService es = new EmployeeService();
		
		float updatedSal = es.calSalary(1, "Tom", 1000, "Manager");
		assertEquals(4000, updatedSal, 0.0);
		
		try {
		float updatedManagerSal = es.calSalary(2, "Ron", 2000, "Manager");
		assertEquals(5000, updatedManagerSal, 0.0);
		}catch(AssertionError ae){
			System.out.println(ae);
		}
		
		try {
		float updatedDevOpsSal = es.calSalary(3, "John", 1000, "DevOps");
		assertEquals(51000, updatedDevOpsSal, 0.0);
		}catch(AssertionError ae) {
			System.out.println(ae);
		}
		
		try {
		float updatedClerkSal = es.calSalary(4, "Harry", 1000, "Clerk");
		assertEquals(2000, updatedClerkSal, 0.0);
		}catch(AssertionError ae) {
			System.out.println(ae);
		}
		
	}

	
	@Test
	public void testSayHello() {
		//fail("Not yet implemented");
		//EmployeeService es = new EmployeeService();
		String info = es.sayHello("Sam");
		assertEquals("Welcome Sam", info);
		
		
	}

}
