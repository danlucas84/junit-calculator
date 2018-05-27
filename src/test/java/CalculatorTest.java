
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;

	double a = 2.0;
	double b = 3.0;
	double c = 1.0;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDodawania() throws Exception {


		double suma = classUnderTest.sum(a, b);
		Assert.assertEquals("Bledny wynik sumowania", 5.0 , suma,0.001);

		double suma1 =classUnderTest.sum(b,c);
		Assert.assertEquals("Bledny wynik sumowania",5.0, suma1,0.001);
	}

	@Test
	public void testOdejmownaia() throws Exception {

		double wynikOdejmowania = classUnderTest.subtract(a,b);
		Assert.assertEquals("Bledny wynik odejmownai",-1.0,wynikOdejmowania,0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDzieleniaPrzezZero() {
		double a = 4.0;
		double b = 0.0;

		double wynik = classUnderTest.divide(a,b);
		Assert.
	}
}


